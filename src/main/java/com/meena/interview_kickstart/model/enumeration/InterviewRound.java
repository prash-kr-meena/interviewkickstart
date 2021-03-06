package com.meena.interview_kickstart.model.enumeration;

import lombok.Getter;

public enum InterviewRound {
  ROUND_1(1),
  ROUND_2(2),
  ROUND_3(3),
  ROUND_4(4),
  ROUND_5(5),
  ROUND_6(6);

  @Getter
  Integer round;

  InterviewRound(Integer round) {
    this.round = round;
  }
}
