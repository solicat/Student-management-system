package dm;

import java.io.*;
import java.util.*;

import pd.management.Notice;

public class Notice_data {
	private static ArrayList<Notice> notice;
	public static ArrayList<Notice> getList(){
		return notice;
	}
	
	public void openNotice() {
		try {
			ObjectInputStream istream = new ObjectInputStream(new FileInputStream("Notice.dat"));	
			notice = (ArrayList<Notice>) istream.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			
		}
	}
	
	public boolean createNotice(String type, String title, String content) {
		Notice temp;
		
		temp = new Notice(type, title, content);
		notice.add(temp);
		this.FileSave();
		
		return true;
	}
	
	//suggest: �������� �ϳ��� id�� �ο��ؼ� �� id�� search�ϴ� �� ���� �������?
		// index �� ó���ϴ� ���� ���Ұ� �����ϴ�. Requirment �� �׷��� ����
	public boolean deleteNotice(int index) {
		if(0<=index && index<this.getList().size())
		{
			notice.remove(index);
			this.FileSave();
			return true;
		}
		return false;
	}
	
	public static Notice getNoticeByTitle(String title) {
		for(Notice a : notice) {
			if(a.getTitle().equals(title)){
				return a;
			}
		}
		return null;	// Can't find
	}
	
	
	// modify �� Arraylist  �� index �� ����Ͽ� �����ϴ� ������� �Ͽ����ϴ�
	public boolean modifyNotice(int index, String type, String title, String content) {
		if(0<=index && index<this.getList().size())
		{
			Notice target = notice.get(index);
			target.setType(type);
			target.setTitle(title);
			target.setContent(content);
			this.FileSave();
			return true;
		}
		return false;
	}
	
	public void FileSave() {
		try {
			ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream("Notice.dat"));
			ostream.writeObject(notice);
			ostream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
