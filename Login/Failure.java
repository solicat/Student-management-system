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
		JLabel failureLabel = new JLabel("�α��ο� �����Ͽ����ϴ�.\n");
		JLabel failureLabel2 = new JLabel("�ش� ������ �������� �ʽ��ϴ�.\n");
		failurePanel.add(failureLabel);
		failurePanel.add(failureLabel2);
		add(failurePanel);
	}
}