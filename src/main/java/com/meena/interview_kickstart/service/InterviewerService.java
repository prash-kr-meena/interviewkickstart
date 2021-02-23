package com.meena.interview_kickstart.service;

import com.meena.interview_kickstart.model.Interviewer;
import com.meena.interview_kickstart.model.Schedule;
import com.meena.interview_kickstart.repository.InterviewerRepository;
import com.meena.interview_kickstart.repository.ScheduleRepository;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class InterviewerService {

  private final InterviewerRepository interviewerRepository;
  private final ScheduleRepository scheduleRepository;


  public InterviewerService(
      InterviewerRepository interviewerRepository,
      ScheduleRepository scheduleRepository) {

    this.interviewerRepository = interviewerRepository;
    this.scheduleRepository = scheduleRepository;
  }

  @Transactional
  public void insertSomeInterviewer() {

    ZonedDateTime startDate = ZonedDateTime.of(
        LocalDate.of(2021, 2, 23),
        LocalTime.of(23, 24),
        ZoneId.of("Asia/Kolkata")
    );

    long startTimeInMillis = startDate.toInstant().toEpochMilli();
    long endTimeInMillis = startTimeInMillis + 1000000; // increasing 1000 seconds

    Schedule morningSchedule = new Schedule();
    morningSchedule.setStart(new Timestamp(startTimeInMillis));
    morningSchedule.setEnd(new Timestamp(endTimeInMillis));

    Schedule eveningSchedule = new Schedule();
    eveningSchedule.setStart(new Timestamp(startTimeInMillis + 2000000));
    eveningSchedule.setEnd(new Timestamp(endTimeInMillis + 2000000 + 1000000));

    scheduleRepository.save(morningSchedule);
    scheduleRepository.save(eveningSchedule);

    Interviewer mayank = new Interviewer("mayank", 6);
    mayank.getSchedule().add(morningSchedule);
    mayank.getSchedule().add(eveningSchedule);

    interviewerRepository.save(mayank);
  }
}
