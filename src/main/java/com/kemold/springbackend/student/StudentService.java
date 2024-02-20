package com.kemold.springbackend.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(
                new Student("James", "Bond", 23, "james@gmail.com", LocalDate.now()),
                new Student("Jeff", "Bezos", 19, "jeff@gmail.com", LocalDate.now()));
    }

}
