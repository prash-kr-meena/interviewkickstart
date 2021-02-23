package com.meena.interview_kickstart.repository;

import com.meena.interview_kickstart.repository.enumeration.Grade;
import com.meena.interview_kickstart.repository.enumeration.MockInterviewState;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class MockInterview {

  @Id
  @GeneratedValue
  private Long id;
  private Long studentId;
  private Long interviewerId;
  private MockInterviewState state;
  private Grade grade;

}
