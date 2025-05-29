package com.example.student.service;

import com.example.student.entity.StudentTable;
import java.util.List;

public interface StudentTableService {
    List<StudentTable> findAll();
    StudentTable findById(Long id);
    boolean save(StudentTable student);
    boolean update(StudentTable student);
    boolean deleteById(Long id);
} 