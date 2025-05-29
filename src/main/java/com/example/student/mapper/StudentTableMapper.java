package com.example.student.mapper;

import com.example.student.entity.StudentTable;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentTableMapper {
    
    @Select("SELECT * FROM studenttable")
    List<StudentTable> findAll();
    
    @Select("SELECT * FROM studenttable WHERE id = #{id}")
    StudentTable findById(Long id);
    
    @Insert("INSERT INTO studenttable(username, hobby, friends, occupation, hometown) " +
            "VALUES(#{username}, #{hobby}, #{friends}, #{occupation}, #{hometown})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(StudentTable student);
    
    @Update("UPDATE studenttable SET username=#{username}, hobby=#{hobby}, " +
            "friends=#{friends}, occupation=#{occupation}, hometown=#{hometown} " +
            "WHERE id=#{id}")
    int update(StudentTable student);
    
    @Delete("DELETE FROM studenttable WHERE id = #{id}")
    int deleteById(Long id);
} 