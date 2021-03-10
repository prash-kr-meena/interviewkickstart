package com.meena.interview_kickstart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
@SequenceGenerator(name = "student_sequence_generator", initialValue = 1)
public class Student {

  @Id
  @GeneratedValue(generator = "student_sequence_generator")
  private Long id;

  private String name;
  private String phone;
  private String email;
  private Double previousScore; // score of last 2 interviews ?? Should we keep it here or not?

}
