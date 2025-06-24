package com.gaurav.stu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaurav.stu.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

	Student findByName(String stuName);

	Student findByMobileNo(String mobileNo);

	List<Student> findByCollege(String college);

}
