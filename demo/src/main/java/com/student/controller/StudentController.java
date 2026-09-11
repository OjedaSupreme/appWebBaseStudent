package com.student.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.service.StudentService;

import dto.StudentDto;

@Controller
@RequestMapping(value = "/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public ResponseEntity<?> findAll() {
        List<StudentDto> studentDto = studentService.findAll();
        return new ResponseEntity<>(studentDto, HttpStatus.OK);
    }
}

