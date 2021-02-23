package com.meena.interview_kickstart;

import lombok.Getter;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Getter
@ToString
@Scope(value = "prototype")
public class SimplePojo {

  public SimplePojo() {
    System.out.println("Inside SimplePojo");
  }
}
