package com.meena.interview_kickstart.service;

import com.github.javafaker.Faker;
import com.meena.interview_kickstart.model.Interviewer;
import com.meena.interview_kickstart.model.Schedule;
import com.meena.interview_kickstart.repository.InterviewerRepository;
import com.meena.interview_kickstart.repository.ScheduleRepository;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import org.springframework.stereotype.Service;

@Service
public class FakeDataService {

  private final InterviewerRepository interviewerRepository;
  private final ScheduleRepository scheduleRepository;
  private final Faker faker;

  private static final int _1_HOUR_IN_MILLIS = 60 * 60 * 1000;
  private static final int _15_MINUTES_IN_MILLIS = 15 * 60 * 1000;

  public FakeDataService(
      InterviewerRepository interviewerRepository,
      ScheduleRepository scheduleRepository) {

    this.interviewerRepository = interviewerRepository;
    this.scheduleRepository = scheduleRepository;
    this.faker = new Faker();
  }

  public Interviewer createInterviewer() {
    String fakeFirstName = faker.name().firstName();
    int fakeYoe = faker.number().numberBetween(1, 8);
    Interviewer fakeInterviewer = new Interviewer(fakeFirstName, fakeYoe);
    interviewerRepository.save(fakeInterviewer);
    return fakeInterviewer;
  }

  public void createScheduleForInterviewer(Interviewer interviewer) {
    int maxNoOfSchedules = 5; // can have 5 schedule at a gap of 30 minutes each
    int randomNoOfSchedule = faker.number().numberBetween(1, maxNoOfSchedules);

    ZonedDateTime startDate = getZoneDateTimeForToday();

    long startTimeInMillis = startDate.toInstant().toEpochMilli();
    long endTimeInMillis = startTimeInMillis + _1_HOUR_IN_MILLIS; // increasing 1 hour

    for (int i = 0; i < randomNoOfSchedule; i++) {
      Schedule schedule = new Schedule();
      schedule.setStart(new Timestamp(startTimeInMillis));
      schedule.setEnd(new Timestamp(endTimeInMillis));
      schedule.setInterviewer(interviewer);
      scheduleRepository.save(schedule);

      startTimeInMillis = startTimeInMillis + _15_MINUTES_IN_MILLIS;
      endTimeInMillis = startTimeInMillis + _15_MINUTES_IN_MILLIS;
    }
  }

  private ZonedDateTime getZoneDateTimeForToday() {
    ZoneId zoneId = ZoneId.of("Asia/Kolkata");
    ZonedDateTime now = LocalDateTime.now().atZone(zoneId);

    // Starting from 9AM
    return ZonedDateTime.of(
        LocalDate.of(now.getYear(), now.getMonth(), now.getDayOfMonth()),
        LocalTime.of(9, 0),
        ZoneId.of("Asia/Kolkata")
    );
  }
}
