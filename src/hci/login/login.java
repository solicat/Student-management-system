package hci.login;

import hci.login.Failure;
import hci.manager_UI.*;
import hci.student_UI.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JPasswordField;

import dm.Account_data;

public class login extends JFrame implements ActionListener
{
	public static final int WIDTH = 500; //default width
	public static final int HEIGHT = 400; //default height
	
	
	public static final int NUMBER_OF_CHAR = 20;
	
	private JTextField ID;
	private JTextField PW;

	public login() {
		super("로그인");
		setLayout(new GridLayout(4, 1));
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
				
		JPanel titlePanel = new JPanel();
		//titlePanel.setLayout(new BorderLayout());
		JLabel titleLabel = new JLabel("학생경력관리시스템");
		titlePanel.add(titleLabel, BorderLayout.SOUTH);
		titlePanel.setBackground(Color.WHITE);
		add(titlePanel);
		
		JPanel anouncePanel = new JPanel();
		JLabel anounceLabel = new JLabel("ID와 PW 입력 후 로그인 버튼을 클릭하세요.");
		anouncePanel.add(anounceLabel);
		anouncePanel.setBackground(Color.WHITE);
		add(anouncePanel);
		
		/*ID & PW*/
		JPanel IDPWPanel = new JPanel();
		IDPWPanel.setLayout(new GridLayout(2,1));
		
		/*ID*/
		JPanel IDPanel = new JPanel();
		//IDPanel.setBackground(Color.WHITE);
		
		ID = new JTextField(NUMBER_OF_CHAR);
		JLabel IDLabel = new JLabel("ID   : ");
		IDPanel.add(IDLabel, BorderLayout.CENTER);
		IDPanel.add(ID, BorderLayout.CENTER);
		IDPanel.setBackground(Color.WHITE);
		IDPWPanel.add(IDPanel);
		
		/*PW*/
		JPanel PWPanel = new JPanel();
		//PWPanel.setBackground(Color.WHITE);		
		
		//PW = new JTextField(NUMBER_OF_CHAR);
		PW = new JPasswordField(NUMBER_OF_CHAR);
		((JPasswordField) PW).setEchoChar('*');
		
		JLabel PWLabel = new JLabel("PW : ");
		PWPanel.add(PWLabel, BorderLayout.CENTER);
		PWPanel.add(PW, BorderLayout.CENTER);
		PWPanel.setBackground(Color.WHITE);
		IDPWPanel.add(PWPanel);
		
		add(IDPWPanel);
		
		JPanel buttonPanel = new JPanel();
		JButton LoginButton = new JButton("로그인");
		LoginButton.addActionListener(this);
		buttonPanel.add(LoginButton);
		buttonPanel.setBackground(Color.WHITE);
		add(buttonPanel);		
	}
	
	public void actionPerformed(ActionEvent e) {
		String inputID = ID.getText();
		String inputPW = PW.getText();
		int result = Account_data.tryLogin(inputID, inputPW);
		
		if(result == 0) {
			System.out.println("Login Fail");
			Failure failureGui = new Failure();
			failureGui.setVisible(true);
		}
		else if(result == 1) {
			//System.out.println("You are a student!");
			new Student_menu();
			dispose();
			
		}
		else if(result == 2) {
			//System.out.println("You are a Administrator!");
			new Manager_menu();
			dispose();
		}
	}
}