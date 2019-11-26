package management;

import student_data.Student;

public class Account {
	private String ID;
	private String PW;
	private Student student;
		
	public Account(String iD, String pW, Student student) {
		super();
		ID = iD;
		PW = pW;
		this.student = student;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPW() {
		return PW;
	}
	public void setPW(String pW) {
		PW = pW;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
