
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

		ArrayList<Subject> e_sub = new ArrayList<Subject>();
		e_sub.add(new Subject("Success", "code", "name", "prof"));

		ArrayList<Requirement> req = new ArrayList<Requirement>();
		req.add(new Requirement(new Language_score("TOEIC", 55.5), new Foriegn_exchange("USA", "aa", 30),
				new Intern("bbb", 5, 5), e_sub, 1, 2, 3, 4));
		for (Requirement i : req) {
			System.out.println(i.getLanguage_score().getType() + " " + i.getLanguage_score().getScore());
			System.out.println(i.getForiegn_exchange().getCountry_name() + " " + i.getForiegn_exchange().getUniv_name()
					+ " " + i.getForiegn_exchange().getCredit());
			System.out.println(i.getIntern().getCompany_name() + " " + i.getIntern().getPeriod() + " "
					+ i.getIntern().getCredit());
			for (Subject j : i.getEssential_subject())
				System.out.println("'" + j.getCourse_name() + " " + j.getCode() + " " + j.getCourse_name() + " "
						+ j.getProf_name() + "'");
			System.out.println(i.getConsult_cnt() + " " + i.getMajor() + " " + i.getTrack() + " " + i.getIn_year());

		}
		try {
			ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream("Requirement.dat"));
			ostream.writeObject(req);

			ostream.close();
		} catch (IOException e) {
			System.out.println("Problem with file output.");
		}

		
		Account_data account = new Account_data();
		account.openAccount();

		Notice_data data = new Notice_data();
		data.openNotice();
		
		Requirement_data requirement = new Requirement_data();
		requirement.openRequirement();

		
		
		login loginGui = new login();
		loginGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginGui.setVisible(true);

	}
}
