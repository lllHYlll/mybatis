package com.codingtokyo.zero.mybatis.service;

import java.util.List;

import com.codingtokyo.zero.mybatis.dto.Student;

public interface StudentService {

	List<Student> getAllStudentInfo();

	Student getStudentInfoById(String studentNo);

	void signUpStudent(Student student);

	void modifyStudent(Student student);

	void deleteStudent(String studentNo);



}
