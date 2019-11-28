package pd.student_data;

public class Eng_Grade {
	
	private String type;
	private double grade;
	
	public Eng_Grade(String type, double grade) {
		super();
		this.type = type;
		this.grade = grade;
	}
	
	public String getType() {return type;}
	public double getGrade() {return grade;}
	public void setType(String type) {this.type = type;}
	public void setGrade(double grade) {this.grade = grade;}
	
}
