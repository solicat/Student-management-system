package dm;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

import pd.management.Notice;
import pd.management.Requirement;
import pd.student_data.Foriegn_exchange;
import pd.student_data.Intern;
import pd.student_data.Language_score;
import pd.student_data.Subject;

public class Requirement_data {
	private static ArrayList<Requirement> requirement;
	public static ArrayList<Requirement> getList(){
		return requirement;
	}

	public void openRequirement() {
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

	public ArrayList<Requirement> get_Requirement() {
		return requirement;
	}

	public boolean createRequirement(Requirement req) {
		requirement.add(req);
		this.FileSave();
		return true;
	}
	
	public static Requirement getRequireByTrack(String trk) {
		String[] track = new String[] {
				"��ȭ��ǻ��", "�۷ι�����Ʈ���� ��������", "�۷ι�����Ʈ���� �ؿܺ�������", "�۷ι�����Ʈ���� �м��翬��", "SW ���� ����"
		};
		
		for(Requirement a : requirement) {
			if(a.getTrack() == Arrays.asList(track).indexOf(trk))
				return a;
		}
		
		return null;
	}

	public boolean modifyRequirement(Requirement req, int index) {
		if (0 <= index && index < requirement.size()) {
			requirement.set(index, req);
			this.FileSave();
			return true;
		}
		return false;
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

	public boolean deleteRequirement(int index) {
		if (0 <= index && index < requirement.size()) {
			requirement.remove(index);
			this.FileSave();
			return true;
		}
		return false;
	}
	
	public void FileSave() {
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
