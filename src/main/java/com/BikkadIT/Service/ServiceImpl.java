package com.BikkadIT.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.Repository.StudentRepository;
import com.BikkadIT.model.Student;

@Service
public class ServiceImpl implements ServiceI {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public int addStudent(Student student) {
		Student save = studentRepository.save(student);
		
		return save.getStuId();
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> findAll = studentRepository.findAll();
		return findAll;
	}

	@Override
	public Student getByStuAge(int stuAge) {
		Student byStuAge = studentRepository.getByStuAge(stuAge);
		return byStuAge ;
	}
	

	@Override
	public int updateStudent(Student student) {
		Student save = studentRepository.save(student);
		return save.getStuId();
	}

	@Override
	public void deleteById(int stuAge) {
		studentRepository.deleteById(stuAge);
		
	}

	@Override
	public void deleteAll(Student student) {
	studentRepository.deleteAll();
		
	}

	
	
	
	

}
