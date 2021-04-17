package com.dc.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="STUDENT")
public class Student {
	@Id
	@Column(name = "STUDENT_NO")
	private int studentNo;
	@Column(name = "STUDENT_NAME")
	private String studentName;
	@Column(name = "STUDENT_DOB")
	private Date studentDOB;
	@Column(name = "STUDENT_DOJ")
	private Date studentDOJ;
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public Date getStudentDOJ() {
		return studentDOJ;
	}
	public void setStudentDOJ(Date studentDOJ) {
		this.studentDOJ = studentDOJ;
	}
	public Student(int studentNo, String studentName, Date studentDOB, Date studentDOJ) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.studentDOB = studentDOB;
		this.studentDOJ = studentDOJ;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", studentName=" + studentName + ", studentDOB=" + studentDOB
				+ ", studentDOJ=" + studentDOJ + "]";
	}
	
}
