package com.meena.interview_kickstart.controller;

import com.meena.interview_kickstart.controller.request_dto.FindSlotRequest;
import com.meena.interview_kickstart.model.Schedule;
import com.meena.interview_kickstart.service.InterviewerService;
import com.meena.interview_kickstart.service.ScheduleService;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MainController {


  private final InterviewerService interviewerService;
  private final ScheduleService scheduleService;


  public MainController(InterviewerService interviewerService,
      ScheduleService scheduleService) {

    this.interviewerService = interviewerService;
    this.scheduleService = scheduleService;
  }

  @GetMapping
  private String insertSomeData() {
    return "Hello From The Other Side";
  }

  @PostMapping("/find")
  private List<Schedule> findAppropriateSlots(@RequestBody FindSlotRequest findSlotRequest) {
    System.out.println(findSlotRequest);
    LocalDateTime startDateTime = LocalDateTime.parse(findSlotRequest.getStartDateTime());
    LocalDateTime endDateTime = LocalDateTime.parse(findSlotRequest.getEndDateTime());

    return scheduleService.findSchedule(findSlotRequest.getStudentId(), startDateTime, endDateTime);
  }
}
