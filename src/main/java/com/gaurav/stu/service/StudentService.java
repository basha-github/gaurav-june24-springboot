package com.gaurav.stu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.stu.entity.Student;
import com.gaurav.stu.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo stuRepo;

	public void saveNewStudent(Student stuObj) {
		
		stuRepo.save(stuObj);
	}

	public void saveAllStudents(List<Student> stuList) {
		stuRepo.saveAll(stuList);
		
	}

	public List<Student> fetchAllStudents() {
		return stuRepo.findAll();
	}

	public Student getStuByRollNo(int stuNo) {
		return stuRepo.findById(stuNo).orElse(new Student());
	}

	public Student getStuByName(String stuName) {
		// TODO Auto-generated method stub
		return stuRepo.findByName(stuName);
		
	}

	public Student getStuByMobileNo(String mobileNo) {
		// TODO Auto-generated method stub
		return stuRepo.findByMobileNo(mobileNo);
	}

	public List<Student> getStuByCollege(String college) {
		// TODO Auto-generated method stub
		return stuRepo.findByCollege(college);
	}

}
