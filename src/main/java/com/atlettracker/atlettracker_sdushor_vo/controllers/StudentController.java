package com.atlettracker.atlettracker_sdushor_vo.controllers;

import com.atlettracker.atlettracker_sdushor_vo.models.Student;
import com.atlettracker.atlettracker_sdushor_vo.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {
    private final StudentService service;

    @GetMapping("/welcome")
    public String welcome() {
        return "Добро пожаловать на незащищенную страницу";
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return service.findAllStudent();
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }

    @GetMapping("/hello")
    public String hello() {
        return "<h2> Привет всем! </h2>";
    }

    @GetMapping("/user")
    public String user() {
        return "<h2> Привет, пользователь! </h2>";
    }

    @GetMapping("/admin")
    public String admin() {
        return "<h2> Привет, админ! </h2>";
    }

    @PostMapping
    public String saveStudent(@RequestBody Student student) {
        service.saveStudent(student);
        return "Студент успешно сохранен";
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("/{email}")
    public void deleteStudent(@PathVariable String email) {
        service.deleteStudent(email);
    }
}
