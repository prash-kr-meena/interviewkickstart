package com.meena.interview_kickstart.controller;

import com.meena.interview_kickstart.model.Interviewer;
import com.meena.interview_kickstart.service.FakeDataService;
import com.meena.interview_kickstart.service.InterviewerService;
import java.util.stream.IntStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FakeDataController {

  private final FakeDataService fakeDataService;

  public FakeDataController(FakeDataService fakeDataService) {
    this.fakeDataService = fakeDataService;
  }

  @GetMapping("/create/{copies}")
//  @PostMapping("/create/{copies}")
  private void insertSomeData(@PathVariable("copies") Integer copiesOfData) {
    IntStream.range(0, copiesOfData).forEach(copy -> {
      Interviewer interviewer = fakeDataService.createInterviewer();
      fakeDataService.createScheduleForInterviewer(interviewer);
    });
  }
}
