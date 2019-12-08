package pd.student_data;

import java.io.Serializable;

public class Language_score implements Serializable{
	private String type;
	private double score;
		
	public Language_score(String type, double score) {
		super();
		this.type = type;
		this.score = score;
	}
	public Language_score() {
		// TODO Auto-generated constructor stub
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String toString(){
		return "Type: " + this.type + "Score: " + this.score;
	}
}
