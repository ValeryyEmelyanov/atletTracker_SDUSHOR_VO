package com.atlettracker.atlettracker_sdushor_vo.services;

import com.atlettracker.atlettracker_sdushor_vo.models.Student;

import java.util.List;

// Интерфейс сервиса для управления студентами
public interface StudentService {

     List<Student> findAllStudent();

     Student saveStudent(Student student);
     Student findByEmail(String email);
     Student updateStudent(Student student);
     void deleteStudent(String email);
}
