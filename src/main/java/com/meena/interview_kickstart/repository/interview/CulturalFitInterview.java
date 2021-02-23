package com.meena.interview_kickstart.repository.interview;

import static com.meena.interview_kickstart.repository.enumeration.InterviewRound.ROUND_5;


public class CulturalFitInterview extends Interview {

  public static final String CULTURAL_FITNESS = "CULTURAL_FITNESS";

  public CulturalFitInterview(Integer durationMinutes) {
    super(durationMinutes, ROUND_5.getRound(), CULTURAL_FITNESS);
  }
}
