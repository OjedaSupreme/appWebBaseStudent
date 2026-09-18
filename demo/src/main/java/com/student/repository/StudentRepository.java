package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Integer> {

}
