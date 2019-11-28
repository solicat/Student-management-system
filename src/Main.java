
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

import dm.Account_data;
import hci.login.login;
import pd.management.Account;
import pd.management.Administrator;
import pd.student_data.Student;

public class Main {

	public static void main(String[] args) {
	
		ArrayList<Account> iaccount = new ArrayList<Account>();

		iaccount.add(new Account("0000000000", "qwer", new Student()));
		iaccount.add(new Account("1111111111", "asdf", new Student()));
		iaccount.add(new Account("2222222222", "zxcv", new Administrator()));

		for (Account iter : iaccount)
			System.out.println(iter.getID() + " " + iter.getPW() + " " + iter.getUser().getClass());
		try {
			ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream("Account.dat"));
			ostream.writeObject(iaccount);

			ostream.close();
		} catch (IOException e) {
			System.out.println("Problem with file output.");
		}

		Account_data account = new Account_data();
		account.openAccount();
		
		login loginGui = new login();
		loginGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginGui.setVisible(true);		
	}
}
