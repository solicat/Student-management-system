
import java.util.Scanner;

import javax.swing.JFrame;

import dm.Account_data;
import hci.login.login;

public class Main {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		/*
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
*/
		Account_data account = new Account_data();
		account.openAccount();
		
		login loginGui = new login();
		loginGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginGui.setVisible(true);		
	}
}
