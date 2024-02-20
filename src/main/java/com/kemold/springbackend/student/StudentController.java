package com.kemold.springbackend.student;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    private StudentService studentService;;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> findAllStudentss() {
        return studentService.findAllStudents();
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email) {
        return studentService.findByEmail(email);
    }

    @DeleteMapping("/{email}")
    public void deleteStudent(@PathVariable("email") String email) {
        studentService.deleteStudent(email);
    }

    @PutMapping("/{email}")
    public Student updateStudent(@PathVariable("email") String email, @RequestBody Student student) {
        return studentService.updateStudent(email, student);
    }

}
