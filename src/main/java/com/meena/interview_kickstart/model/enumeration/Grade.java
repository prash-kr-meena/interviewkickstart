package com.meena.interview_kickstart.model.enumeration;

public enum Grade {

  POOR(0),
  DECENT(1),
  GOOD(2),
  AMAZING(3);

  private final Integer gradeValue;

  Grade(Integer gradeValue) {
    this.gradeValue = gradeValue;
  }
}
