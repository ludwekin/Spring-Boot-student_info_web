package com.example.student.service.impl;

import com.example.student.entity.StudentTable;
import com.example.student.mapper.StudentTableMapper;
import com.example.student.service.StudentTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentTableServiceImpl implements StudentTableService {

    @Autowired
    private StudentTableMapper studentTableMapper;

    @Override
    public List<StudentTable> findAll() {
        return studentTableMapper.findAll();
    }

    @Override
    public StudentTable findById(Long id) {
        return studentTableMapper.findById(id);
    }

    @Override
    public boolean save(StudentTable student) {
        return studentTableMapper.insert(student) > 0;
    }

    @Override
    public boolean update(StudentTable student) {
        return studentTableMapper.update(student) > 0;
    }

    @Override
    public boolean deleteById(Long id) {
        return studentTableMapper.deleteById(id) > 0;
    }
} 