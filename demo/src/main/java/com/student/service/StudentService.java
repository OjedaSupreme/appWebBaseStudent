package com.student.service;

import org.springframework.stereotype.Service;

import com.student.repository.StudentRepository;

import dto.StudentDto;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentDto findById(Integer id) {
        return studentRepository.findById(id)
            .map(studentModel -> studentModel.toDto())
            .orElse(null);
    }
}
