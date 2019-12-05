package pd.student_data;

import java.util.ArrayList;

public class Career {
	
	private int total_credit;
	private int count_counseling;
	private ArrayList<Foriegn_exchange> exchange;
	private ArrayList<Intern> intern;
	private ArrayList<Language_score> eng_grade;
	private ArrayList<Subject> subject;	

	public Career(int total_credit, int count_counseling) {
		super();
		this.total_credit = total_credit;
		this.count_counseling = count_counseling;
	}
	
	public int getTotal_credit() {return total_credit;}
	public int getCount_counseling() {return count_counseling;}
	public ArrayList<Foriegn_exchange> getExchange() {return exchange;}
	public ArrayList<Intern> getIntern() {return intern;}
	public ArrayList<Language_score> getEng_grade() {return eng_grade;}
	public ArrayList<Subject> getSubject() {return subject;}
	public void setTotal_credit(int total_credit) {this.total_credit = total_credit;}
	public void setCount_counseling(int count_counseling) {this.count_counseling = count_counseling;}
	public void setExchange(ArrayList<Foriegn_exchange> exchange) {this.exchange = exchange;}
	public void setIntern(ArrayList<Intern> intern) {this.intern = intern;}
	public void setEng_grade(ArrayList<Language_score> eng_grade) {this.eng_grade = eng_grade;}
	public void setSubject(ArrayList<Subject> subject) {this.subject = subject;}
	
	public void check_requirement()
	{
		
	}
}
