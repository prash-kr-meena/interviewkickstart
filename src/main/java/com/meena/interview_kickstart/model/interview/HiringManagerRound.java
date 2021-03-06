package com.meena.interview_kickstart.model.interview;

import static com.meena.interview_kickstart.model.enumeration.InterviewRound.ROUND_6;


public class HiringManagerRound extends Interview {

  public static final String HIRING_MANAGER = "HIRING_MANAGER";

  public HiringManagerRound(Integer durationMinutes) {
    super(durationMinutes, ROUND_6.getRound(), HIRING_MANAGER);
  }
}
