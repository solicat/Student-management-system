package hci.login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Failure extends JFrame implements ActionListener{
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;
	
	public Failure() {
		super("�α��� ����");
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(3, 1));
		
		JPanel emptyPanel = new JPanel();
		emptyPanel.setBackground(Color.WHITE);
		add(emptyPanel);
		
		JPanel failurePanel = new JPanel();
		JLabel failureLabel = new JLabel("�α��ο� �����Ͽ����ϴ�.\n");
		JLabel failureLabel2 = new JLabel("�ش� ������ �������� �ʽ��ϴ�.\n");
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