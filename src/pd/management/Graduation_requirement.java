package pd.management;

import java.util.ArrayList;

public class Graduation_requirement<Require> {

	private int eng_grade;
	private int foreign_required_credit;
	private ArrayList<Require> required_subject;
	private int intern_credit;
	private int counseling;
	private String course;
	private String track;
	private int admission_year;
	
	public Graduation_requirement(int eng_grade, int foreign_required_credit, ArrayList<Require> required_subject,
			int intern_credit, int counseling, String course, String track, int admission_year) 
	{
		super();
		this.eng_grade = eng_grade;
		this.foreign_required_credit = foreign_required_credit;
		this.required_subject = required_subject;
		this.intern_credit = intern_credit;
		this.counseling = counseling;
		this.course = course;
		this.track = track;
		this.admission_year = admission_year;
	}
	
	public int getEng_grade() {return eng_grade;}
	public int getForeign_required_credit() {return foreign_required_credit;}
	public ArrayList<Require> getRequired_subject() {return required_subject;}
	public int getIntern_credit() {return intern_credit;}
	public int getCounseling() {return counseling;}
	public String getCourse() {return course;}
	public String getTrack() {return track;}
	public int getAdmission_year() {return admission_year;}
	public void setEng_grade(int eng_grade) {this.eng_grade = eng_grade;}
	public void setForeign_required_credit(int foreign_required_credit) {this.foreign_required_credit = foreign_required_credit;}
	public void setRequired_subject(ArrayList<Require> required_subject) {this.required_subject = required_subject;}
	public void setIntern_credit(int intern_credit) {this.intern_credit = intern_credit;}
	public void setCounseling(int counseling) {this.counseling = counseling;}
	public void setCourse(String course) {this.course = course;}
	public void setTrack(String track) {this.track = track;}
	public void setAdmission_year(int admission_year) {this.admission_year = admission_year;}
	
	public void check_requirement()
	{
		
	}
	public void create_requirement()
	{
		
	}
	public void modify_requirement()
	{
		
	}
	public void delete_requirement()
	{
		
	}
}