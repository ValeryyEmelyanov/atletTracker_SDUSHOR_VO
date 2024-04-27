package com.atlettracker.atlettracker_sdushor_vo.services;

import com.atlettracker.atlettracker_sdushor_vo.models.Student;
import com.github.javafaker.Faker;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.IntStream;



public interface StudentService {

     List<Student> findAllStudent();

     Student saveStudent(Student student);
     Student findByEmail(String email);
     Student updateStudent(Student student);
     void deleteStudent(String email);

//@PostConstruct
//    public void loadAppInDB(){
//        Faker faker = new Faker();
//        applications = IntStream.rangeClosed(1,100)
//                .mapToObj(i -> Student.builder()
//                        .id(i)
//                        .name(faker.app().name())
//                        .author(faker.app().author())
//                        .version(Integer.parseInt(faker.app().version()))
//                        .build())
//                .toList();
//    }
//
//    public List<Student> allApplications (){
//    return applications;
//    }
//
//    public Student applicationByID(int id){
//        return applications.stream()
//                .filter(app->app.getId() == id)
//                .findFirst()
//                .orElse(null);
//    }

}


