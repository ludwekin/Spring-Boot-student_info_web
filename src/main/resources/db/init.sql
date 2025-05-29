-- 创建数据库
CREATE DATABASE IF NOT EXISTS springtest DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE springtest;

-- 创建用户表
CREATE TABLE IF NOT EXISTS studenttable (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL COMMENT '用户名',
    hobby VARCHAR(200) COMMENT '兴趣爱好',
    friends VARCHAR(200) COMMENT '朋友',
    occupation VARCHAR(100) COMMENT '职业',
    hometown VARCHAR(100) COMMENT '户籍',
    UNIQUE KEY uk_username (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户信息表'; 