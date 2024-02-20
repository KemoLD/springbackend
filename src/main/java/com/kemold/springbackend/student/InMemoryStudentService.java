package com.kemold.springbackend.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class InMemoryStudentService implements StudentService {

    private final InMemoryStudentDao inMemoryStudentDao;

    public InMemoryStudentService(InMemoryStudentDao inMemoryStudentDao) {
        this.inMemoryStudentDao = inMemoryStudentDao;
    }

    @Override
    public List<Student> findAllStudents() {
        return inMemoryStudentDao.findAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return inMemoryStudentDao.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return inMemoryStudentDao.findByEmail(email);
    }

    @Override
    public void deleteStudent(String email) {
        inMemoryStudentDao.deleteStudent(email);
    }

    @Override
    public Student updateStudent(String email, Student student) {
        return inMemoryStudentDao.updateStudent(email, student);
    }
}
