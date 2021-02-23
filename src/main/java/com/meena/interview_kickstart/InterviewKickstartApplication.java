package com.meena.interview_kickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class InterviewKickstartApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication
        .run(InterviewKickstartApplication.class, args);
  }
}