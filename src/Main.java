
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

import dm.Account_data;
import dm.Notice_data;
import hci.login.login;
import pd.management.Notice;

public class Main {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		/*
		//Account Test
		ArrayList<Account> account = new ArrayList<Account>();

		account.add(new Account("0000000000", "qwer", new Student()));
		account.add(new Account("1111111111", "asdf", new Student()));
		account.add(new Account("2222222222", "zxcv", new Administrator()));

		for (Account iter : account)
			System.out.println(iter.getID() + " " + iter.getPW() + " " + iter.getUser().getClass());
		try {
			ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream("Account.dat"));
			ostream.writeObject(account);

			ostream.close();
		} catch (IOException e) {
			System.out.println("Problem with file output.");
		
*/
		
		
		//Notice Test
		/*
		//test1 : write directly to file
	    ArrayList<Notice> notice = new ArrayList<Notice>();

		notice.add(new Notice("typeA","test1","first test"));
		notice.add(new Notice("typeB","test2","second test"));
		notice.add(new Notice("typeC","test3","third test"));

		for (Notice iter : notice)
			System.out.println(iter.getType()+": "+iter.getTitle()+"\n"+iter.getContent());
		try {
			ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream("Notice.dat"));
			ostream.writeObject(notice);

			ostream.close();
		} catch (IOException e) {
			System.out.println("Problem with file output.");
		}
		*/
		
		/*
		//test2 : creating new notice
		Notice_data data = new Notice_data();
		data.openNotice();
		ArrayList<Notice> notice = Notice_data.getList();
		
		Notice n1 = new Notice("typeD","test4","fourth test");
		Notice n2 = new Notice("typeE","test5","fifth test");
		Notice n3 = new Notice("typeF","test6","sixth test");
		n1.create_notice();
		n2.create_notice();
		n3.create_notice();		
		
		for(Notice iter : notice)
			System.out.println(iter.getType()+": "+iter.getTitle()+"\n"+iter.getContent());
		*/
		
		Account_data account = new Account_data();
		account.openAccount();
		
		
		Notice_data data = new Notice_data();
		data.openNotice();
		
		login loginGui = new login();
		loginGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginGui.setVisible(true);		
	}
}
