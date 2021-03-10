package com.meena.interview_kickstart.repository;

import com.meena.interview_kickstart.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
