/*Service Interface defining two methods:*/
/*1. Save Student object into DB*/
/*2. Retrieve List of all Students in object*/

package com.alexr.studentbackend.service;

import com.alexr.studentbackend.model.Student;
import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);

    /*List of students*/
    public List<Student> getAllStudents();

}