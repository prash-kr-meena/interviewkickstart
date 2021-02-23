package com.meena.interview_kickstart.controller;

import com.meena.interview_kickstart.service.InterviewerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {


  private final InterviewerService interviewerService;

  public MainController(InterviewerService interviewerService) {
    this.interviewerService = interviewerService;
  }

  @RequestMapping
  private void insertSomeData() {
    interviewerService.insertSomeInterviewer();
  }

}