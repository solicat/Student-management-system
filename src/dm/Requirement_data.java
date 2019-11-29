package dm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import pd.management.Requirement;

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
	
	public boolean createRequirement(){
		
		try {
			ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream("Account.dat"));
			ostream.writeObject(requirement);
			ostream.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public void modifyRequirement() {

	}
	
}
