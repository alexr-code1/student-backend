/*"StudentServiceImpl" implements the "StudentService" interface*/
/*Service bean annotation*/
/*Implements methods in "StudentService" interface
to perform CRUD operations on Student object*/

package com.alexr.studentbackend.service;

import com.alexr.studentbackend.model.Student;
import com.alexr.studentbackend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}