package com.codingtokyo.zero.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingtokyo.zero.mybatis.dto.Student;
import com.codingtokyo.zero.mybatis.mapper.StudentMapper;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper mapper;
	
	@Override
	public List<Student> getAllStudentInfo() {

		return mapper.selectList();
	}

	@Override
	public Student getStudentInfoById(String studentNo) {
		
		return mapper.selectOne(studentNo);
	}
	
	@Override
	public void signUpStudent(Student student) {
		
		mapper.insert(student);
	}

	@Override
	public void modifyStudent(Student student) {
		
		mapper.update(student);
	}

	@Override
	public void deleteStudent(String studentNo) {
		
		mapper.delete(studentNo);
		
	}


}
