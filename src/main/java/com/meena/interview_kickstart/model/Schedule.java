package com.meena.interview_kickstart.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
@Entity
@SequenceGenerator(name = "schedule_sequence_generator", initialValue = 100)
public class Schedule {

  @Id
  @Setter(AccessLevel.PRIVATE)
  @GeneratedValue(generator = "schedule_sequence_generator")
  private Long id;

  @JsonIgnore
  @ManyToOne
  private Interviewer interviewer;

  private Timestamp start;
  private Timestamp end;

}
