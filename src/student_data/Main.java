package student_data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import management.Account;
import management.Administrator;

public class Main {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		ArrayList<Account> account = new ArrayList<Account>();

		account.add(new Account("0000000000", "qwer", new Student()));
		account.add(new Account("1111111111", "asdf", new Student()));
		account.add(new Account("2222222222", "zxcv", new Administrator()));

		for (Account iter : account)
			System.out.println(iter.getID() + " " + iter.getPW() + " " + iter.getUser().getClass());
		try {
			ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream("Account.dat"));
			ostream.writeObject(account);

			ostream.close();
		} catch (IOException e) {
			System.out.println("Problem with file output.");
		}

		try {
			ObjectInputStream istream = new ObjectInputStream(new FileInputStream("Account.dat"));

			ArrayList<Account> faccount = (ArrayList<Account>) istream.readObject();

			for (Account i : faccount)
				System.out.println(i.getID() + " " + i.getPW() + " " + i.getUser().getClass());

			for (Account i : faccount) {
				if(i.getUser() instanceof Student)
					System.out.println("Student" + i.getUser());
				else if(i.getUser() instanceof Administrator)
					System.out.println("Administrator" + i.getUser());
			}
			
			int success = 0;
			do {
				System.out.print("ID: ");
				String id = kb.next();
				System.out.print("PW: ");
				String pw = kb.next();				
				
				for(Account i : faccount)
				{
					if(i.getID().equals(id) && i.getPW().equals(pw))
					{
						success = 1;
						System.out.println(i.getUser());
						break;
					}
				}
				if(success == 0)
					System.out.println("Login fail");
			}while(success != 1);
			
			System.out.println("Login success");
			
			
			istream.close();
		} catch (IOException e) {
			System.out.println("Problem with file input.");
		} catch (ClassNotFoundException e) {

		}
		
		
		System.exit(0);
	}

}
