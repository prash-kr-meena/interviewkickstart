package com.meena.interview_kickstart.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@NoArgsConstructor
@SequenceGenerator(name = "student_sequence_generator", initialValue = 1)
public class Student {

  @Id
  @GeneratedValue(generator = "student_sequence_generator")
  private Long id;

  private String name;
  private String phone;
  private String email;
  private Double previousScore; // score of last 2 interviews ?? Should we keep it here or not?

  @Setter(AccessLevel.PRIVATE)
  @OneToMany(mappedBy = "student")
  private List<InterviewAppointment> interviewAppointments;

  public Student(String name, String phone, String email) {
    this.name = name;
    this.phone = phone;
    this.email = email;
  }
}
