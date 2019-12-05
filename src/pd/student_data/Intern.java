package pd.student_data;

import java.io.Serializable;

public class Intern implements Serializable{
	private String company_name;
	private int period;
	private int credit;
	
	public Intern(String company_name, int period, int credit) {
		super();
		this.company_name=company_name;
		this.period=period;
		this.credit=credit;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
}
