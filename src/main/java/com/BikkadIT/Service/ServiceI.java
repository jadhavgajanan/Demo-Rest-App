package com.BikkadIT.Service;

import java.util.List;

import com.BikkadIT.model.Student;

public interface ServiceI {
	
	public int addStudent(Student student);
	public List<Student> getAllStudent();
	public Student getByStuAge(int stuAge);
	public int updateStudent(Student student);
	public void deleteById(int stuId);
	public void deleteAll(Student student);
	
}
