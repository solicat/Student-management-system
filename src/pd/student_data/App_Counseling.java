package pd.student_data;

public class App_Counseling extends Application{

	public App_Counseling(String type, String content) {
		super(type, content);
		// TODO Auto-generated constructor stub
	}
	
	public App_Counseling(String type, String content, String professor, String date, String topic) {
		super(type, content);
		this.professor = professor;
		this.date = date;
		this.topic = topic;
	}
	
	private String professor;
	private String date;
	private String topic;
	
	public String getProfessor() {return professor;}
	public String getDate() {return date;}
	public String getTopic() {return topic;}
	public void setProfessor(String professor) {this.professor = professor;}
	public void setDate(String date) {this.date = date;}
	public void setTopic(String topic) {this.topic = topic;}
	
	public void report()
	{
		
	}
}
