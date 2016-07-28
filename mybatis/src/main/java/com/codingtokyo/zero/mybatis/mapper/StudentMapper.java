package com.codingtokyo.zero.mybatis.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.codingtokyo.zero.mybatis.dto.Student;

@Repository
public interface StudentMapper {
	
	List<Student> selectList();

	Student selectOne(String studentNo);

	void insert(Student student);

	void update(Student student);

	void delete(String studentNo);
}
