package com.kemold.springbackend.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryStudentDao {

    private final List<Student> students = new ArrayList<>();

    public List<Student> findAllStudents() {
        return students;
    }

    public Student saveStudent(Student student) {
        students.add(student);
        return student;
    }

    public Student findByEmail(String email) {
        return students.stream()
                .filter(student -> student.getEmail().equals(email))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student " + email + " does not exist"));
    }

    public void deleteStudent(String email) {
        students.removeIf(student -> student.getEmail().equals(email));
    }

    public Student updateStudent(String email, Student student) {
        Student studentToUpdate = findByEmail(email);
        students.remove(studentToUpdate);
        students.add(student);
        return student;
    }
}
