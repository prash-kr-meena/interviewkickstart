package com.meena.interview_kickstart.repository.interview;

import static com.meena.interview_kickstart.repository.enumeration.InterviewRound.ROUND_2;

public class MachineCodingInterview extends Interview {

  public static final String MACHINE_CODING = "MACHINE_CODING";

  public MachineCodingInterview(Integer durationMinutes) {
    super(durationMinutes, ROUND_2.getRound(), MACHINE_CODING);
  }
}
