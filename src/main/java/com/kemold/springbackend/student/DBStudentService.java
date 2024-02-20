package com.kemold.springbackend.student;

import java.util.List;

import org.springframework.stereotype.Service;

@Service("db")
public class DBStudentService implements StudentService {

    private final StudentRepository studentRepository;

    public DBStudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public void deleteStudent(String email) {
        studentRepository.deleteByEmail(email);
    }

    @Override
    public Student updateStudent(String email, Student student) {
        Student studentToUpdate = findByEmail(email);
        studentToUpdate.setFirstName(student.getFirstName());
        studentToUpdate.setLastName(student.getLastName());
        studentToUpdate.setDateOfBirth(student.getDateOfBirth());
        studentToUpdate.setEmail(student.getEmail());
        return studentRepository.save(studentToUpdate);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

}
