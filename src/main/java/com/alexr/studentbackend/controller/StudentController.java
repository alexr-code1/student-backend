/*Class Injects Student Service*/
/*Maps HTTP methods for CRUD operations*/

package com.alexr.studentbackend.controller;

import com.alexr.studentbackend.model.Student;
import com.alexr.studentbackend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student is Added.";
    }
    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
