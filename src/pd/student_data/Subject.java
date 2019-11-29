package pd.student_data;

import java.io.Serializable;

public class Subject implements Serializable{
	private String grade;
	private String code;
	private String course_name;
	private String prof_name;
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
	
}
