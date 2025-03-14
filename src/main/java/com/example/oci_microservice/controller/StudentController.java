package com.example.oci_microservice.controller;

import com.example.oci_microservice.model.Student;
import com.example.oci_microservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    //@GetMapping("/{studentId}")
    //public Student getStudentById(@PathVariable Long studentId) {
    //    return studentService.getStudentById(studentId);
    //}

    @GetMapping("/{studentId}")
    public Student getStudentByStudentId(@PathVariable String studentId) {
        return studentService.getStudentByStudentId(studentId);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
}