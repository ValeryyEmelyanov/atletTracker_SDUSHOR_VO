package com.atlettracker.atlettracker_sdushor_vo.repository;

import com.atlettracker.atlettracker_sdushor_vo.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Long> {
    void deleteByEmail(String email);
    Student findByEmail(String email);
}
