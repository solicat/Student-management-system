
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
		
		Student Student1 = (Student) iaccount.get(0).getUser();
		Student Student2 = (Student) iaccount.get(1).getUser();
		
		Career stu1 = new Career();
		Career stu2 = new Career();
		
		ArrayList<Foriegn_exchange> fe_Stu1 = new ArrayList<Foriegn_exchange>();
		ArrayList<Foriegn_exchange> fe_Stu2 = new ArrayList<Foriegn_exchange>();
		ArrayList<Intern> int_Stu1 = new ArrayList<Intern>();
		ArrayList<Intern> int_Stu2 = new ArrayList<Intern>();
		ArrayList<Language_score> lan_Stu1 = new ArrayList<Language_score>();
		ArrayList<Language_score> lan_Stu2 = new ArrayList<Language_score>();		
		ArrayList<Subject> sub_Stu1 = new ArrayList<Subject>();
		ArrayList<Subject> sub_Stu2 = new ArrayList<Subject>();
		
		sub_Stu1.add(new Subject("A+", "COMP204", "Programming Basics", "abc"));
		sub_Stu1.add(new Subject("A+", "COME331", "Data Structure", "abc"));
		sub_Stu1.add(new Subject("A+", "CLTR211", "Math1", "abc"));
		sub_Stu1.add(new Subject("A+", "COME301", "Discrete Mathematics", "abc"));
		
		Student1.setName("Student 1");
		Student1.setStudent_number("2020123456");
		Student1.setPhone_number("010-2345-6789");
		Student1.setCourse("글로벌소프트웨어");
		Student1.setTrack("글로벌소프트웨어 학석사연계");
		Student1.setProfessor("abc");
		
		stu1.setExchange(fe_Stu1);
		stu1.setIntern(int_Stu1);
		stu1.setEng_grade(lan_Stu1);
		stu1.setSubject(sub_Stu1);
		
		Student1.setCareer(stu1);	
		
				
		sub_Stu2.add(new Subject("A+", "CLTR264", "Social Network", "abc"));
		sub_Stu2.add(new Subject("A+", "CLTR211", "Math1", "abc"));
		sub_Stu2.add(new Subject("A+", "CLTR213", "Physics1", "abc"));
		sub_Stu2.add(new Subject("A+", "CLTR223", "Physics Experiment", "abc"));
		
		Student2.setName("Student 2");
		Student2.setStudent_number("2020567890");
		Student2.setPhone_number("010-9876-5432");
		Student2.setCourse("심화컴퓨터");
		Student2.setTrack("심화컴퓨터");
		Student2.setProfessor("abc");
		
		stu2.setExchange(fe_Stu2);
		stu2.setIntern(int_Stu2);
		stu2.setEng_grade(lan_Stu2);
		stu2.setSubject(sub_Stu2);
		
		Student2.setCareer(stu2);			
			

		for (Account iter : iaccount)
			System.out.println(iter.getID() + " " + iter.getPW() + " " + iter.getUser().getClass());
		try {
			ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream("Account.dat"));
			ostream.writeObject(iaccount);

			ostream.close();
		} catch (IOException e) {
			System.out.println("Problem with file output.");
		}		
		
		ArrayList<Requirement> req= new ArrayList<Requirement>();

		Requirement trk0 = new Requirement();
		trk0.setTrack(0);
		
		ArrayList<Subject> trk0_req = new ArrayList<Subject>();
		
		trk0_req.add(new Subject("", "CLTR221", "", ""));
		trk0_req.add(new Subject("", "CLTR213", "", ""));
		trk0_req.add(new Subject("", "CLTR223", "", ""));
		trk0_req.add(new Subject("", "COME301", "", ""));
		trk0_req.add(new Subject("", "COMP205", "", ""));
		trk0_req.add(new Subject("", "COMP204", "", ""));
		trk0_req.add(new Subject("", "COME331", "", ""));
		trk0_req.add(new Subject("", "COMP217", "", ""));
		trk0_req.add(new Subject("", "ELEC462", "", ""));
		trk0_req.add(new Subject("", "COMP411", "", ""));
		trk0_req.add(new Subject("", "COMP319", "", ""));
		trk0_req.add(new Subject("", "COMP312", "", ""));
		trk0_req.add(new Subject("", "ITEC401", "", ""));
		trk0_req.add(new Subject("", "ITEC402", "", ""));
		
		trk0.setLanguage_score(new Language_score("TOEIC", 700));
		trk0.setIntern(new Intern("", 0, 3));
		trk0.setEssential_subject(trk0_req);
		trk0.setConsult_cnt(8);
		trk0.setIn_year(2012);
		
		req.add(trk0);
		
		Requirement trk3 = new Requirement();
		trk3.setTrack(3);
		
		ArrayList<Subject> trk3_req = new ArrayList<Subject>();		
				
		trk3_req.add(new Subject("", "COMP204", "", ""));
		trk3_req.add(new Subject("", "COME331", "", ""));
		trk3_req.add(new Subject("", "GLSO216", "", ""));
		trk3_req.add(new Subject("", "COMP312", "", ""));
		
		trk3.setLanguage_score(new Language_score("TOEIC", 700));
		trk3.setForiegn_exchange(new Foriegn_exchange("", "", 6));
		trk3.setIntern(new Intern("", 0, 3));
		trk3.setEssential_subject(trk3_req);
		trk3.setConsult_cnt(8);		
		
		req.add(trk3);		
		
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
		Notice a = new Notice("modify test","modify test","modify test");
		a.delete_notice();
		
//		data.modifyNotice(4, "modify test", "modify test", "modify test");
		
		Requirement_data requirement = new Requirement_data();
		requirement.openRequirement();  // open from file(Requirement.dat)
		
		login loginGui = new login();
		loginGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginGui.setVisible(true);

	}
}
