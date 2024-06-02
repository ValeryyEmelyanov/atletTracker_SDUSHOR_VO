package com.atlettracker.atlettracker_sdushor_vo.services;

import com.atlettracker.atlettracker_sdushor_vo.models.Student;
import com.atlettracker.atlettracker_sdushor_vo.repository.StudentRepository;
import com.atlettracker.atlettracker_sdushor_vo.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    @Override
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteByEmail(email);
    }
}
