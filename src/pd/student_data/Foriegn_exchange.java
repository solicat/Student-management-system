package pd.student_data;

import java.io.Serializable;

public class Foriegn_exchange implements Serializable{
	private String country_name;
	private String univ_name;
	private int credit;
	
	public Foriegn_exchange() {
		// TODO Auto-generated constructor stub
	}
	public Foriegn_exchange(String country_name, String univ_name, int credit) {
		super();
		this.country_name = country_name;
		this.univ_name = univ_name;
		this.credit = credit;
	}
	
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public String getUniv_name() {
		return univ_name;
	}
	public void setUniv_name(String univ_name) {
		this.univ_name = univ_name;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
}
