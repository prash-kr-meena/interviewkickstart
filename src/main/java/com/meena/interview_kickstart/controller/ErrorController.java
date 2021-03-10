package com.meena.interview_kickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping
public class ErrorController {

  //  @GetMapping("/error")
  public static String errorHandler() {
    return "Internal Server Error : 500";
  }
}
