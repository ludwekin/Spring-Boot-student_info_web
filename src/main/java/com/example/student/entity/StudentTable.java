package com.example.student.entity;

import lombok.Data;

@Data
public class StudentTable {
    private Long id;
    private String username;     // 用户名
    private String hobby;        // 兴趣爱好
    private String friends;      // 朋友
    private String occupation;   // 职业
    private String hometown;     // 户籍
} 