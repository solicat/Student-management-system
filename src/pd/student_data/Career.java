package pd.student_data;

public class Career {
	
	private int total_credit;
	private int count_counseling;
	
	public Career(int total_credit, int count_counseling) {
		super();
		this.total_credit = total_credit;
		this.count_counseling = count_counseling;
	}
	
	public int getTotal_credit() {return total_credit;}
	public int getCount_counseling() {return count_counseling;}
	public void setTotal_credit(int total_credit) {this.total_credit = total_credit;}
	public void setCount_counseling(int count_counseling) {this.count_counseling = count_counseling;}
	
	public void check_requirement()
	{
		
	}
}
