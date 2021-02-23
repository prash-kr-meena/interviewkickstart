package com.meena.interview_kickstart.repository;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
@SequenceGenerator(name = "interviewer_sequence_generator", initialValue = 1)
public class Interviewer {

  @Id
  @GeneratedValue(generator = "interviewer_sequence_generator")
  private Long id;
  private String name;
  private String yoe; // Years of Experience
  @OneToMany(mappedBy = "interviewer")
  private List<Schedule> schedule;

}
