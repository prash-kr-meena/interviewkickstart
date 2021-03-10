package com.meena.interview_kickstart.service;

import com.meena.interview_kickstart.model.Schedule;
import com.meena.interview_kickstart.repository.ScheduleRepository;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

  private final ScheduleRepository scheduleRepository;

  public ScheduleService(ScheduleRepository scheduleRepository) {
    this.scheduleRepository = scheduleRepository;
  }

  public List<Schedule> findSchedule(Integer studentId,
      LocalDateTime startDateTime,
      LocalDateTime endDateTime) {

    return scheduleRepository.findAll();
  }
}
