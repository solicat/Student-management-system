package dm;

import java.io.*;
import java.util.ArrayList;

import pd.management.Requirement;

public class Requirement_data {
	private static ArrayList<Requirement> requirement;
	
	public void openRequirement(){
		try {
			ObjectInputStream istream = new ObjectInputStream(new FileInputStream("Requirement.dat"));	
			requirement = (ArrayList<Requirement>) istream.readObject();
			System.out.println(requirement.get(0).getEssential_subject().get(0).getGrade());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
		}
	}
	
	public boolean createRequirement(Requirement req){
		System.out.println(req.getLanguage_score().getScore() + req.getLanguage_score().getType());
		System.out.println(req.getIntern().getCompany_name() + req.getIntern().getCredit() + req.getIntern().getPeriod());
		System.out.println(req.getForiegn_exchange().getCountry_name() + req.getForiegn_exchange().getCredit()+req.getForiegn_exchange().getUniv_name());
		System.out.println(req.getEssential_subject().get(0).getGrade());
		System.out.println(req.getConsult_cnt());
		System.out.println(req.getMajor());
		System.out.println(req.getTrack());
		System.out.println(req.getIn_year());
		
		requirement = new ArrayList<Requirement>();
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
	
	public void modifyRequirement() {

	}
	
}
