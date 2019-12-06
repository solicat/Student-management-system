package dm;

import java.io.*;
import java.util.ArrayList;

import pd.management.Requirement;
import pd.student_data.Foriegn_exchange;
import pd.student_data.Intern;
import pd.student_data.Language_score;
import pd.student_data.Subject;

public class Requirement_data {
	private static ArrayList<Requirement> requirement;
	
	public void openRequirement(){
		try {
			ObjectInputStream istream = new ObjectInputStream(new FileInputStream("Requirement.dat"));	
			requirement = (ArrayList<Requirement>) istream.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
		}
	}
	
	public ArrayList<Requirement> get_Requirement(){
		return requirement;
	}
	
	public boolean createRequirement(Requirement req){
		requirement.add(req);
		
		try {
			ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream("Requirement.dat"));
			ostream.writeObject(requirement);
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
	
	public void modifyRequirement(Requirement req, int index) {
		requirement.set(index, req);
		try {
			ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream("Requirement.dat"));
			ostream.writeObject(requirement);
			ostream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void print_requirement() {
		for (Requirement i : requirement) {
			System.out.println(i.getLanguage_score().getType() + " " + i.getLanguage_score().getScore());
			System.out.println(i.getForiegn_exchange().getCountry_name() + " " + i.getForiegn_exchange().getUniv_name()
					+ " " + i.getForiegn_exchange().getCredit());
			System.out.println(i.getIntern().getCompany_name() + " " + i.getIntern().getPeriod() + " "
					+ i.getIntern().getCredit());
			for (Subject j : i.getEssential_subject())
				System.out.println("'" + j.getGrade() + " " + j.getCode() + " " + j.getCourse_name() + " "
						+ j.getProf_name() + "'");
			System.out.println(i.getConsult_cnt() + " " + i.getMajor() + " " + i.getTrack() + " " + i.getIn_year());
		}
	}
	
	public void deleteRequirement(int index) {
		requirement.remove(index);
		try {
			ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream("Requirement.dat"));
			ostream.writeObject(requirement);
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
