package com.meena.interview_kickstart.model;

import com.meena.interview_kickstart.model.enumeration.Grade;
import com.meena.interview_kickstart.model.enumeration.InterviewStateAppointmentState;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class InterviewAppointment {

  @Id
  @GeneratedValue
  private Long id;
//  @ForeignKey
  private Long studentId;
//  @ForeignKey
  private Long interviewerId;

  private Date created;
  private InterviewStateAppointmentState state;
  private Grade grade;

}
