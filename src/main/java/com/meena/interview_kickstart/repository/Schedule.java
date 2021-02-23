package com.meena.interview_kickstart.repository;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "schedule_sequence_generator", initialValue = 1)
public class Schedule {

  @Id
  @GeneratedValue(generator = "schedule_sequence_generator")
  private Long id;
  @ManyToOne
  private Interviewer interviewer;
  private Timestamp start;
  private Timestamp end;

}
