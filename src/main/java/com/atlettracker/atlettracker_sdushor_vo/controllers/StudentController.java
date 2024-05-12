package com.atlettracker.atlettracker_sdushor_vo.controllers;

import com.atlettracker.atlettracker_sdushor_vo.models.Student;
import com.atlettracker.atlettracker_sdushor_vo.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
@AllArgsConstructor
public class StudentController {
    private StudentService service;


    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to the unprotected page";
    }


    @GetMapping("/all_student")
    public List<Student> findAllStudent(){
        return service.findAllStudent();
    }

    @GetMapping("/{email}")
    public Student findByEmail (@PathVariable("email") String email){
        return service.findByEmail(email);
    }

    @GetMapping("/hello")
    public String hello(){
        return "<h2> Hey, everyone! </h2>";
    }

    @GetMapping("/user")
    public String user(){
        return "<h2> Hey, user! </h2>";
    }

    @GetMapping("/admin")
    public String admin(){
        return "<h2> Hey, admin! </h2>";
    }


    @PostMapping("save_student")
    public String saveStudent(@RequestBody Student student){
        service.saveStudent(student);
        return "Student successfully saved";
    }




    @PutMapping("/update_student")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }


    @DeleteMapping("/delete_student/{email}")
    public void deleteStudent(@PathVariable String email){
        service.deleteStudent(email);
    }

}

