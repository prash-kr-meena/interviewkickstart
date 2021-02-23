package com.meena.interview_kickstart.model.interview;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@SequenceGenerator(name = "interview_sequence_generator")
public class Interview {

  @Id
  @GeneratedValue(generator = "interview_sequence_generator")
  protected Long id;

  private Integer durationMinutes;
  private Integer round;
  private String roundName;

  public Interview(Integer durationMinutes, Integer round, String roundName) {
    this.round = round;
    this.roundName = roundName;
    this.durationMinutes = durationMinutes;
  }

}
