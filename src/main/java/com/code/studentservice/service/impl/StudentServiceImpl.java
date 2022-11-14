package com.code.studentservice.service.impl;

import com.code.studentservice.exception.StudentNotFoundException;
import com.code.studentservice.model.Student;
import com.code.studentservice.repository.StudentRepository;
import com.code.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student getById(int id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException(" Student Not Found!!!"));
        return student;
    }

    @Override
    public Student getByName(String name) {
        Student student = studentRepository.findByName(name).orElseThrow(() -> new StudentNotFoundException(" Student Not Found!!!"));
        return student;
    }

    @Override
    public boolean save(Student student) {
        studentRepository.save(student);
        return false;
    }
}