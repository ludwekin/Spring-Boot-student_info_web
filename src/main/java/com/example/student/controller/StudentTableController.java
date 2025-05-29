package com.example.student.controller;

import com.example.student.entity.StudentTable;
import com.example.student.service.StudentTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentTableController {

    @Autowired
    private StudentTableService studentTableService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("students", studentTableService.findAll());
        return "student/list";
    }

    @GetMapping("/add")
    public String addForm() {
        return "student/add";
    }

    @PostMapping("/add")
    public String add(StudentTable student) {
        studentTableService.save(student);
        return "redirect:/student/list";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentTableService.findById(id));
        return "student/edit";
    }

    @PostMapping("/edit")
    public String edit(StudentTable student) {
        studentTableService.update(student);
        return "redirect:/student/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        studentTableService.deleteById(id);
        return "redirect:/student/list";
    }
} 