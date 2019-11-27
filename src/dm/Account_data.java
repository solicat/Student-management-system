package dm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import pd.management.Account;
import pd.management.Administrator;
import pd.student_data.Student;

public class Account_data {
	private static ArrayList<Account> account;
	
	public void openAccount(){
		try {
			ObjectInputStream istream = new ObjectInputStream(new FileInputStream("Account.dat"));	
			account = (ArrayList<Account>) istream.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
		}
	}
	
	public boolean createAccount(String id, String pw, boolean admin){
		Account temp;
		
		for(Account a : account) {
			if(a.getID().equals(id)) {
				System.out.println("Have ID");
				return false;
			}
		}
		
		if(admin)
			temp = new Account(id, pw, new Administrator());
		else
			temp = new Account(id, pw, new Student());
		account.add(temp);		
		try {
			ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream("Account.dat"));
			ostream.writeObject(account);
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
	
	public boolean deleteAccount(String id) {
		for(Account a : account) {
			if(a.getID().equals(id)) {
				account.remove(a);
				return true;
			}
		}
		System.out.println("No ID");
		return false;
	}
	
	public void modifyAccount() {
		
	}
	
	public static int tryLogin(String id, String pw) {
		for(Account a : account) {
			if(a.getID().equals(id) && a.getPW().equals(pw)){
				if(a.getUser() instanceof Student) {
					return 1;	// Student login
				}
				if(a.getUser() instanceof Administrator) {
					return 2;	// Administrator login
				}
			}
		}
		return 0;	// Login fail
	}
}
