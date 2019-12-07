
import java.io.*;
import java.util.*;
import javax.swing.*;

import dm.Account_data;
import dm.Notice_data;
import dm.Requirement_data;
import hci.login.*;
import pd.management.*;
import pd.student_data.*;

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

		Notice_data data = new Notice_data();
		data.openNotice();
		Notice a = new Notice("modify test","modify test","modify test");
		a.delete_notice();
		
//		data.modifyNotice(4, "modify test", "modify test", "modify test");
		
		Requirement_data requirement = new Requirement_data();
		requirement.openRequirement();  // open from file(Requirement.dat)
		
	/*	ArrayList<Subject> e_sub = new ArrayList<Subject>();
		e_sub.add(new Subject("Success3", "code", "name", "prof"));

		requirement.createRequirement((new Requirement(new Language_score("TOEIC3", 55.5), new Foriegn_exchange("USA3", "aa", 30),
				new Intern("bbb3", 5, 5), e_sub, 5, 6, 7, 8)));
		// new requirement data insert example

		System.out.println("삭제 전 출력");
		requirement.print_requirement();  // requirement arraylist print method
		
		requirement.deleteRequirement(2);
		System.out.println("삭제 후 출력");
		requirement.print_requirement();  // requirement arraylist print method
		
		
		e_sub.add(new Subject("M1", "code", "name", "prof"));
		requirement.modifyRequirement((new Requirement(new Language_score("M1", 55.5), new Foriegn_exchange("M1", "aa", 30),
				new Intern("m1", 5, 5), e_sub, 5, 6, 7, 8)), 1);
		System.out.println("수정 후 출력");
		requirement.print_requirement();  // requirement arraylist print method*/

		
		login loginGui = new login();
		loginGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginGui.setVisible(true);

	}
}
