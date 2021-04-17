package com.dc.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dc.api.model.Student;
import com.dc.api.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;
	
	
	public Student saveStudent(Student student)
	{
		return studentRepo.save(student);
	}
	public List<Student> getAllStudents()
	{
		return studentRepo.findAll();
	}
	public String deleteStudent(int studentno)
	{
		studentRepo.deleteById(studentno);
		return "Student Deleted "+ studentno;
	}
	public Student updateStudent(Student student)
	{
		Student existingStudent=studentRepo.findById(student.getStudentNo()).get();
		existingStudent.setStudentName(student.getStudentName());
		existingStudent.setStudentDOJ(student.getStudentDOJ());
		existingStudent.setStudentDOB(student.getStudentDOB());
		
		return studentRepo.save(existingStudent);
	}
	

}
