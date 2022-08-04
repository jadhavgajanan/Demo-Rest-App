package com.BikkadIT.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.Service.ServiceI;
import com.BikkadIT.model.Student;

@RestController
public class StudentController {
	@Autowired
	private ServiceI serviceI;
	
	@PostMapping ("/addStudent")
	public int addStudent( @RequestBody Student student) {
		int addStudent = serviceI.addStudent(student);
		return addStudent;	
	}
	@GetMapping (value="/getAllStudent",consumes={"application/json","application/xml"},produces= {"application/json","application/xml"})
	public List<Student> getAllStudent() {
		List<Student> allStudent = serviceI.getAllStudent();
		System.out.println(allStudent);
		
		return allStudent;
	
	}
	@GetMapping (value="/getByAge/{stuAge}",consumes={"application/json","application/xml"},produces= {"application/json","application/xml"})
	public Student getByAge(@PathVariable int stuAge) {
	Student byStuAge = serviceI.getByStuAge(stuAge);
		return byStuAge;
		
	}
	@PostMapping ("/updateStudent")
	public String updateStudent( @RequestBody Student student) {
	int updateStudent = serviceI.updateStudent(student);
		return "Update Data Successfully.";	
	}
	@GetMapping ("/deleteById/{stuId}")
	public String deleteById(@PathVariable int stuId) {
		serviceI.deleteById(stuId);
		return "delete single data successfully.";
	}
	@GetMapping ("/deleteAllStudent")
      public String deleteAllStudent(Student student) {
		serviceI.deleteAll(student);
		return "delete All student Successfully.";
	}
	
	
	
	

}
