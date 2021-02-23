package com.meena.interview_kickstart.repository.interview;

import static com.meena.interview_kickstart.repository.enumeration.InterviewRound.ROUND_4;

public class HighLevelDesignInterview extends Interview {

  public static final String HIGH_LEVEL_INTERVIEW = "HIGH_LEVEL_INTERVIEW";

  public HighLevelDesignInterview(Integer durationMinutes) {
    super(durationMinutes, ROUND_4.getRound(), HIGH_LEVEL_INTERVIEW);
  }
}
