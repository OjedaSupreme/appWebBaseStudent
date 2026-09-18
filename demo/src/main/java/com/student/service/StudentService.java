package com.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.repository.StudentRepository;

import dto.StudentDto;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<StudentDto> findAll() {
        return studentRepository.findAll().stream().map(studentModel -> studentModel.toDto()).toList();
    }
}
