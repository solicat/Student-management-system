package pd.student_data;

import java.io.Serializable;

public class Language_score implements Serializable{
	private String type;
	private double score;
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
}