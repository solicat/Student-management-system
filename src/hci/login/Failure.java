package hci.login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Failure extends JFrame implements ActionListener{
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;
	
	public Failure() {
		super("로그인 실패");
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(3, 1));
		
		JPanel emptyPanel = new JPanel();
		emptyPanel.setBackground(Color.WHITE);
		add(emptyPanel);
		
		JPanel failurePanel = new JPanel();
		JLabel failureLabel = new JLabel("로그인에 실패하였습니다.\n");
		JLabel failureLabel2 = new JLabel("해당 계정이 존재하지 않습니다.\n");
		failurePanel.add(failureLabel);
		failurePanel.add(failureLabel2);
		failurePanel.setBackground(Color.WHITE);
		add(failurePanel);
		
		JPanel emptyPanel2 = new JPanel();
		emptyPanel2.setBackground(Color.WHITE);
		add(emptyPanel2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}