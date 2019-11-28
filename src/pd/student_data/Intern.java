package pd.student_data;

public class Intern {

	private String company;
	private int period;
	private int credit;
	
	public Intern(String company, int period, int credit) {
		super();
		this.company = company;
		this.period = period;
		this.credit = credit;
	}
	
	public String getCompany() {return company;}
	public int getPeriod() {return period;}
	public int getCredit() {return credit;}
	public void setCompany(String company) {this.company = company;}
	public void setPeriod(int period) {this.period = period;}
	public void setCredit(int credit) {this.credit = credit;}
}
