package pd.management;

import java.io.*;
import dm.Notice_data;

public class Notice implements Serializable{

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
		Notice_data data = new Notice_data();
		if(data.createNotice(type, title, content)) {
			//System.out.println("Success: Creating notice");
		}
	}
	
	public void delete_notice() 
	{
		boolean flag = false;
		Notice_data data = new Notice_data();
		for(Notice a : data.getList()) {
			if(a.getType().equals(this.getType()) && a.getTitle().equals(this.getTitle()) && a.getContent().equals(this.getContent())) {
				data.deleteNotice(data.getList().indexOf(a));
				//System.out.println("Success: Deleting notice");
				flag = true;
				break;
			}
		}
		if(!flag) System.out.println("Fail: Deleting notice");
	}
	
	public void check_notice() 
	{
		
	}
	
	public void modify_notice(int index) 
	{
		Notice_data data = new Notice_data();
		if(data.modifyNotice(index, type, title, content)) {
			System.out.println("Success: Modifying notice");
		}
	}
	//public static void main(String[] args) {		
		
	//}
}
