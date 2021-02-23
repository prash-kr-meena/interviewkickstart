package com.meena.interview_kickstart.repository.enumeration;

public enum Grade {

  POOR(0),
  BAD(1),
  OKAYISH(2),
  DECENT(3),
  GOOD(4),
  AMAZING(5);

  private final Integer gradeValue;

  Grade(Integer gradeValue) {
    this.gradeValue = gradeValue;
  }
}
