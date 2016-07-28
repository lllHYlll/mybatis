package com.codingtokyo.zero.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.codingtokyo.zero.mybatis.dto.Student;
import com.codingtokyo.zero.mybatis.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/")
	public String home(){
		return "/student/home";
	}
	
	/*
	 *  Student 전체 리스트
	 */
	@RequestMapping("/viewAllStudent")
	public ModelAndView dispStudentList(){

		ModelAndView mv = new ModelAndView("/student/studentList");
		
		List<Student> studentList = studentService.getAllStudentInfo();
		mv.addObject("studentList", studentList);
		
		return mv;
	}
	
	/*
	 *  Student 개인 정보
	 */
	@RequestMapping(value = "/viewStudentInfo/{studentNo}", method = RequestMethod.GET)
	public ModelAndView dispStudentInfo(@PathVariable String studentNo){
		
		ModelAndView mv = new ModelAndView("/student/studentInfo");

		Student student = studentService.getStudentInfoById(studentNo);
		mv.addObject("studentOneList", student);

		return mv;
	}
	
	/*
	 * Student 등록화면으로 이동
	 */
	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public String addStudent(){
		
		return "/student/createStudent";
		
	}
	
	/*
	 * Student 등록
	 */
	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute("student") Student student){
		
		ModelAndView mv = new ModelAndView("redirect:/");
		
		studentService.signUpStudent(student);
		
		return mv;
	}
	
	/*
	 * Student 수정 화면으로 이동
	 */
	@RequestMapping(value = "/modifyStudent/{studentNo}", method = RequestMethod.GET)
	public ModelAndView modifyStudentInfo(@PathVariable String studentNo){
		
		System.out.println("studentNo : " + studentNo);
		ModelAndView mv = new ModelAndView("/student/studentUpdate");
		
		Student student = studentService.getStudentInfoById(studentNo);
		mv.addObject("studentOneList", student);
		
		return mv;
	}
	
	/*
	 * Student 정보 수정
	 */
	@RequestMapping(value = "/modifyStudent", method = RequestMethod.POST)
	public String modifyStudent(@ModelAttribute("student")Student student){
		
		System.out.println(student.toString());
		
		studentService.modifyStudent(student);
		
		return "redirect:/viewAllStudent";
	}
	
	/*
	 * Student 정보 삭제
	 */
	@RequestMapping(value = "/deleteStudent/{studentNo}", method = RequestMethod.GET)
	public String deleteStudent(@PathVariable String studentNo){
		
		studentService.deleteStudent(studentNo);
		return "redirect:/viewAllStudent";
	}
	
	
}
