package pd.management;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

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
			System.out.println("Success: Creating notice");
		}
	}
	
	public void delete_notice() 
	{
		Notice_data data = new Notice_data();
		if(data.deleteNotice(type, title, content)) {
			System.out.println("Success: Deleting notice");
		}
	}
	
	public void check_notice() 
	{
		
	}
	
	public void modify_notice() 
	{
		
	}
	
	//public static void main(String[] args) {		
		
	//}
}
