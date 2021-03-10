package com.meena.interview_kickstart.controller.request_dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import lombok.Data;

@Data
public class FindSlotRequest {

  private Integer studentId;
  private String startDateTime;
  private String endDateTime;

}
