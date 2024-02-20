package com.kemold.springbackend.student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> findAllStudents();

    Student findByEmail(String email);

    void deleteStudent(String email);

    Student updateStudent(String email, Student student);

}
