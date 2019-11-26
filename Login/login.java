package Login;
import java.io.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class login extends JFrame implements ActionListener
{
	public static final int WIDTH = 500; //default width
	public static final int HEIGHT = 400; //default height
	
	public static final int NUMBER_OF_CHAR = 20;
	
	private JTextField ID;
	private JTextField PW;
	
	public static void main(String[] args) {
		login loginGui = new login();
		loginGui.setVisible(true);
	}
	
	public login() {
		super("Login");
		setLayout(new GridLayout(4, 1));
		setSize(WIDTH, HEIGHT);
		
		JPanel titlePanel = new JPanel();
		//titlePanel.setLayout(new BorderLayout());
		JLabel titleLabel = new JLabel("학생경력관리시스템");
		titlePanel.add(titleLabel, BorderLayout.SOUTH);
		add(titlePanel);
		
		JPanel anouncePanel = new JPanel();
		JLabel anounceLabel = new JLabel("ID와 PW 입력 후 로그인 버튼을 클릭하세요.");
		anouncePanel.add(anounceLabel);
		add(anouncePanel);
		
		/*ID & PW*/
		JPanel IDPWPanel = new JPanel();
		IDPWPanel.setLayout(new GridLayout(2,1));
		
		/*ID*/
		JPanel IDPanel = new JPanel();
		//IDPanel.setBackground(Color.WHITE);
		
		ID = new JTextField(NUMBER_OF_CHAR);
		JLabel IDLabel = new JLabel("ID  : ");
		IDPanel.add(IDLabel, BorderLayout.CENTER);
		IDPanel.add(ID, BorderLayout.CENTER);
		IDPWPanel.add(IDPanel);
		
		/*PW*/
		JPanel PWPanel = new JPanel();
		//PWPanel.setBackground(Color.WHITE);		
		
		PW = new JTextField(NUMBER_OF_CHAR);
		JLabel PWLabel = new JLabel("PW : ");
		PWPanel.add(PWLabel, BorderLayout.CENTER);
		PWPanel.add(PW, BorderLayout.CENTER);
		IDPWPanel.add(PWPanel);
		
		add(IDPWPanel);
		
		JPanel buttonPanel = new JPanel();
		JButton LoginButton = new JButton("로그인");
		LoginButton.addActionListener(this);
		buttonPanel.add(LoginButton);
		add(buttonPanel);
	}
	
	public void actionPerformed(ActionEvent e) {
		String inputID = ID.getText();
		String inputPW = PW.getText();
		
		/*If student
		 * Instance Code below : ID == 0 -> student
		 */
		if(stringToInteger(inputID) == 0) {
			System.out.println("You are a Student!\n");
			/*Open student window*/
		}
		/*If Manager
		 * Instance Code below : ID == 1 -> manager
		 */
		else if(stringToInteger(inputID) == 1) {
			System.out.println("You are a Manager!\n");
			/*Open manager window*/
		}
		/*No account*/
		else {
			/*Open login failure window*/
			Failure failureGui = new Failure();
			failureGui.setVisible(true);
		}
	}
	
	private static int stringToInteger(String StringObject) {
		return Integer.parseInt(StringObject.trim());
	}
}