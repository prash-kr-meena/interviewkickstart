package com.meena.interview_kickstart.repository.interview;

import static com.meena.interview_kickstart.repository.enumeration.InterviewRound.ROUND_3;


public class LowLevelDesignInterview extends Interview {

  public static final String LOW_LEVEL_DESIGN = "LOW_LEVEL_DESIGN";

  public LowLevelDesignInterview(Integer durationMinutes) {
    super(durationMinutes, ROUND_3.getRound(), LOW_LEVEL_DESIGN);
  }
}
