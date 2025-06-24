package com.gaurav.stu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.stu.entity.Student;
import com.gaurav.stu.service.StudentService;

@RestController
public class StudentController {
	
	
	
	// post get put del
	// post --- create
	// get --- read data
	// put--- update
	// del--- delete
	
	@Autowired
	StudentService stuService;
	
	@PostMapping("/gaurav/stu/add/one")
	public String addNewStu(@RequestBody Student stuObj) {
		
		
		stuService.saveNewStudent(stuObj);
		
		return "successfully saved new student--->";
	}
	
	
	@PostMapping("/gaurav/stu/add/all")
	public String addAllStus(@RequestBody List<Student> stuList) {
		
		
		stuService.saveAllStudents(stuList);
		
		return "successfully saved all students--->"+stuList.size();
	}
	
	
	// get --- read
	
	@GetMapping("/gaurav/stu/get/all")
	public List<Student> getAllStudents() {
		
		return stuService.fetchAllStudents();
	}
	
	
	@GetMapping("/gaurav/stu/get/one/rollNo")
	public Student findStudentByRollNo(@RequestParam int stuNo) {
		
		return stuService.getStuByRollNo(stuNo);
	}
	@GetMapping("/gaurav/stu/get/one/name")
	public Student findStudentByName(@RequestParam String stuName) {
		
		return stuService.getStuByName(stuName);
	}
	
	@GetMapping("/gaurav/stu/get/one/mobile")
	public Student findStudentByMobileNo(@RequestParam String mobileNo) {
		
		return stuService.getStuByMobileNo(mobileNo);
	}
	
	@GetMapping("/gaurav/stu/get/all/college")
	public List<Student> findStudentByCollege(@RequestParam String college) {
		
		return stuService.getStuByCollege(college);
	}

}
