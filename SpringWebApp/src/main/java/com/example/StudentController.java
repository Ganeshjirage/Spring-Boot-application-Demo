package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	@GetMapping("getData")
	public String getTest() {
		return "Student data";
	}

	@GetMapping("getList")
	public List<String> getStudentData() {
		List<String> list = new ArrayList<String>();
		list.add("Ganesh");
		list.add("Mangesh");
		list.add("Ramesh");
		list.add("Mahesh");
		return list;
	}

	@GetMapping("/getStudent")
	public Student getStudentDetails() {
		Student student = new Student();
		student.setId(11);
		student.setName("Mininath");
		student.setCity("Kothrud");
		return student;
	}
}
