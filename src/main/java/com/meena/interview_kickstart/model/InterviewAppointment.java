package com.meena.interview_kickstart.model;

import com.meena.interview_kickstart.model.enumeration.Grade;
import com.meena.interview_kickstart.model.enumeration.InterviewStateAppointmentState;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class InterviewAppointment {

  @Id
  @GeneratedValue
  private Long id;
  private Date created;
  private InterviewStateAppointmentState state;
  private Grade grade;

  @ManyToOne
  private Student student;  // By Student_Id ForeignKey

  @ManyToOne
  private Interviewer interviewer;  // By Interviewer_Id ForeignKey

}
