package pd.student_data;

import java.util.ArrayList;

import pd.management.User;

public class Student extends User
{
	private String name;
	private String student_number;
	private String phone_number;
	private String course;
	private String track;
	private String professor;
	private Career career;
	private ArrayList<Application> application;
	private ArrayList<Memo> memo;
	
	public Student() {
		
	};
	
	public Student(String name, String student_number, String phone_number, String course, String track,
			String professor) {
		super();
		this.name = name;
		this.student_number = student_number;
		this.phone_number = phone_number;
		this.course = course;
		this.track = track;
		this.professor = professor;
	}

	public String getName() {return name;}
	public String getStudent_number() {return student_number;}
	public String getPhone_number() {return phone_number;}
	public String getCourse() {return course;}
	public String getTrack() {return track;}
	public String getProfessor() {return professor;}
	public Career getCareer() {return career;}
	public ArrayList<Application> getApplication() {return application;}
	public ArrayList<Memo> getMemo() {return memo;}
	public void setName(String name) {this.name = name;}
	public void setStudent_number(String student_number) {this.student_number = student_number;}
	public void setPhone_number(String phone_number) {this.phone_number = phone_number;}
	public void setCourse(String course) {this.course = course;}
	public void setTrack(String track) {this.track = track;}
	public void setProfessor(String professor) {this.professor = professor;}
	public void setCareer(Career career) {this.career = career;}
	public void setApplication(ArrayList<Application> application) {this.application = application;}
	public void setMemo(ArrayList<Memo> memo) {this.memo = memo;}
	
	public void modify_personal_info()
	{
		
	}

	
	
}
