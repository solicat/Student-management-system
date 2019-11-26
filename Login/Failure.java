package Login;
import java.io.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Failure extends JFrame implements ActionListener{
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;
	
	public Failure() {
		super("Login Failure");
		setSize(WIDTH, HEIGHT);
		
		JPanel failurePanel = new JPanel();
		JLabel failureLabel = new JLabel("로그인에 실패하였습니다.\n");
		JLabel failureLabel2 = new JLabel("해당 계정이 존재하지 않습니다.\n");
		failurePanel.add(failureLabel);
		failurePanel.add(failureLabel2);
		add(failurePanel);
	}
}