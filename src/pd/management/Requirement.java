package pd.management;

import java.io.Serializable;
import java.util.ArrayList;

import pd.student_data.Foriegn_exchange;
import pd.student_data.Intern;
import pd.student_data.Language_score;
import pd.student_data.Subject;

public class Requirement implements Serializable{

	private Language_score language_score;//어학성적
	private Foriegn_exchange foriegn_exchange;//해외대학 이수학점
	private Intern intern;//현장실습 학점
	private ArrayList<Subject> essential_subject;//필수 이수과목
	
	private int consult_cnt;//상담횟수
	private int major;//학부과정
	private int track;//전공트랙 0 1 2 3 4 5
	private int in_year;//입학년도
	
	public Requirement(Language_score language_score, Foriegn_exchange foriegn_exchange, Intern intern,
			ArrayList<Subject> essential_subject, int consult_cnt, int major, int track, int in_year) {
		super();
		this.language_score=language_score;
		this.foriegn_exchange=foriegn_exchange;
		this.intern=intern;
		this.essential_subject=essential_subject;
		this.consult_cnt=consult_cnt;
		this.major=major;
		this.track=track;
		this.in_year=in_year;
	}
	
	public Language_score getLanguage_score() {
		return language_score;
	}
	public void setLanguage_score(Language_score language_score) {
		this.language_score = language_score;
	}
	
	public Foriegn_exchange getForiegn_exchange() {
		return foriegn_exchange;
	}
	public void setForiegn_exchange(Foriegn_exchange foriegn_exchange) {
		this.foriegn_exchange = foriegn_exchange;
	}
	
	public Intern getIntern() {
		return intern;
	}
	public void setIntern(Intern intern) {
		this.intern = intern;
	}
	
	public ArrayList<Subject> getEssential_subject() {
		return essential_subject;
	}
	public void setEssential_subject(ArrayList<Subject> essential_subject) {
		this.essential_subject = essential_subject;
	}
	

	public int getConsult_cnt() {
		return consult_cnt;
	}
	public void setConsult_cnt(int consult_cnt) {
		this.consult_cnt = consult_cnt;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	public int getMajor() {
		return major;
	}
	public void setMajor(int major) {
		this.major = major;
	}
	public int getIn_year() {
		return in_year;
	}
	public void setIn_year(int in_year) {
		this.in_year = in_year;
	}
}