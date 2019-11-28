package pd.student_data;

public class Subject {
	
	private double grade;
	private String course_code;
	private String professor;
	
	public Subject(double grade, String course_code, String professor) {
		super();
		this.grade = grade;
		this.course_code = course_code;
		this.professor = professor;
	}
	
	public double getGrade() {return grade;}
	public String getCourse_code() {return course_code;}
	public String getProfessor() {return professor;}
	public void setGrade(double grade) {this.grade = grade;}
	public void setCourse_code(String course_code) {this.course_code = course_code;}
	public void setProfessor(String professor) {this.professor = professor;}

}
