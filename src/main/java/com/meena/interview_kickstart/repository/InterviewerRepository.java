package com.meena.interview_kickstart.repository;

import com.meena.interview_kickstart.model.Interviewer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewerRepository extends JpaRepository<Interviewer, Long> {

}
