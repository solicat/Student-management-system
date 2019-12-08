package pd.student_data;

import java.io.Serializable;

public class Subject implements Serializable{
	private String grade; //A+ 
	private String code;
	private String course_name; 
	private String prof_name;
	
	public Subject(){
	
	}
	
	public Subject(String grade, String code, String course_name, String prof_name) {
		super();
		this.grade=grade;
		this.code=code;
		this.course_name=course_name;
		this.prof_name=prof_name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCoures_name(String coures_name) {
		this.course_name = coures_name;
	}
	public String getProf_name() {
		return prof_name;
	}
	public void setProf_name(String prof_name) {
		this.prof_name = prof_name;
	}
	public String toString(){
		return "Grade: " + this.grade + " Code: " + this.code + " Course: " + this.course_name + " Prof: " + this.prof_name;
	}
}
