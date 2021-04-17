package com.dc.api.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;

import com.dc.api.model.Student;
import com.dc.api.service.StudentService;
@Path("/studentResource")
public class StudentResource {
	@Autowired
	private StudentService studentService;

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/save")
	public Student addStudent(Student student)
	{
		System.out.println(student);
		return studentService.saveStudent(student);
	}
	@GET
	@Produces("application/json")
	@Path("/getAllStudent")
	public List<Student> getAllStudent()
	{
		System.out.println(studentService.getAllStudents());
		return studentService.getAllStudents();
	}
	
	@DELETE
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/deleteStudent/{id}")
	public String deleteStudent(@PathParam("id") int studentNo)
	{
		System.out.println(studentNo);
		return studentService.deleteStudent(studentNo);
	}
	
	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/updateStudent")
	public Student updateStudent(Student student)
	{
		System.out.println(student);
		return studentService.updateStudent(student);
	}
	
}
