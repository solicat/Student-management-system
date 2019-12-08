package dm;

import java.io.*;
import java.util.ArrayList;

import pd.management.*;
import pd.student_data.Student;

public class Account_data {
	private static ArrayList<Account> account;
	private static Account current;
	
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
		
		if(admin) temp = new Account(id, pw, new Administrator());
		else temp = new Account(id, pw, new Student());
		account.add(temp);		
		this.FileSave();
		return true;
	}
	
	public boolean deleteAccount(String id) {
		for(Account a : account) {
			if(a.getID().equals(id)) {
				account.remove(a);
				this.FileSave();
				return true;
			}
		}
		System.out.println("Delete Fail: No ID");
		return false;
	}
	
	public boolean modifyAccount(String id, Account acc) {
		for(Account a : account) {
			if(a.getID().equals(id)) {
				account.set(account.indexOf(a), acc);
				this.FileSave();
				return true;
			}
		}
		return false;
	}
	
	public static int tryLogin(String id, String pw) {
		for(Account a : account) {
			if(a.getID().equals(id) && a.getPW().equals(pw)){
				if(a.getUser() instanceof Student) {
					current = a;
					return 1;	// Student login
				}
				if(a.getUser() instanceof Administrator) {
					current = a;
					return 2;	// Administrator login
				}
			}
		}
		return 0;	// Login fail
	}
	
	public void FileSave() {
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
	}
}
