package com.meena.interview_kickstart.repository.interview;

import static com.meena.interview_kickstart.repository.enumeration.InterviewRound.ROUND_1;


public class DsAlgoInterview extends Interview {

  public static final String DATA_STRUCTURE_ALGORITHMS = "DATA_STRUCTURE_ALGORITHMS";

  public DsAlgoInterview(Integer durationMinutes) {
    super(durationMinutes, ROUND_1.getRound(), DATA_STRUCTURE_ALGORITHMS);

  }
}
