package com.code.studentservice.service;

import com.code.studentservice.model.Student;

public interface StudentService {

    Student getById(int id);

    Student getByName(String name);

    boolean save(Student student);
}
