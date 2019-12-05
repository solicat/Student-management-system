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
		
		return true;
	}
	
	//suggest: 공지사항 하나에 id를 부여해서 그 id로 search하는 게 좋지 않을까요?
		// index 로 처리하는 것이 편할것 같습니다. Requirment 도 그렇게 했음
	public boolean deleteNotice(String type, String title, String content) {
		for(Notice n : notice) {
			if(n.getType().equals(type)
					&& n.getTitle().equals(title)
					&& n.getContent().equals(content)) {
				notice.remove(n);
				return true;
			}
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
	
	public boolean modifyNotice() {
		return false;
	}
	
}
