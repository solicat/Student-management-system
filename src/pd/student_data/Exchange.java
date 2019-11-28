package pd.student_data;

public class Exchange {
	
	private String nation;
	private String univ_name;
	private int credit;

	public Exchange(String nation, String univ_name, int credit) {
		super();
		this.nation = nation;
		this.univ_name = univ_name;
		this.credit = credit;
	}
	
	public String getNation() {return nation;}
	public String getUniv_name() {return univ_name;}
	public int getCredit() {return credit;}
	public void setNation(String nation) {this.nation = nation;}
	public void setUniv_name(String univ_name) {this.univ_name = univ_name;}
	public void setCredit(int credit) {this.credit = credit;}
}
