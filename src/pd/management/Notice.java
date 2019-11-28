package pd.management;

public class Notice {

	private String type;
	private String title;
	private String content;
	
	public Notice(String type, String title, String content) 
	{
		super();
		this.type = type;
		this.title = title;
		this.content = content;
	}
	
	public String getType() { return type; }
	public String getTitle() { return title; }
	public String getContent() { return content; }
	public void setType(String type) { this.type = type; }
	public void setTitle(String title) { this.title = title; }
	public void setContent(String content) { this.content = content; }
	
	public void create_notice() 
	{
		
	}
	public void delete_notice() 
	{
		
	}
	public void check_notice() 
	{
		
	}
	public void modify_notice() 
	{
		
	}
}
