package com.sunlei666.dao;

import com.sunlei666.domain.Student;

public interface StudentDao {
    //查询一个学生
    Student selectStudentById(Integer id);
}
