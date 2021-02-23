package com.meena.interview_kickstart.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@NoArgsConstructor
@SequenceGenerator(name = "interviewer_sequence_generator", initialValue = 1)
public class Interviewer {

  @Id
  @GeneratedValue(generator = "interviewer_sequence_generator")
  @Setter(AccessLevel.PRIVATE)
  private Long id;

  private String name;
  private Integer yoe; // Years of Experience

  @Setter(AccessLevel.PRIVATE)
  @OneToMany(mappedBy = "interviewer")
  private List<Schedule> schedule;

  public Interviewer(String name, Integer yoe) {
    this.name = name;
    this.yoe = yoe;
    this.schedule = new ArrayList<>();
  }
}
