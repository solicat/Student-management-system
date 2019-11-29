package student_UI;
import manager_UI.Notice_m;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Student_menu extends JFrame{

	public Student_menu() {

		setTitle("�л� �޴�"); // �������� Ÿ��Ʋ�ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane(); // ����Ʈ�Ҿ˾Ƴ���
		contentPane.setBackground(Color.WHITE); // �Ͼ�� ��漳��
		contentPane.setLayout(null); 	// Layout�� ������ �ʱ�	
										// ������ ��ġ�� ������ �ֱ� ����
		
		JLabel label = new JLabel("�л� �޴�");
		label.setLocation(80,50);
		label.setSize(140, 50);
		label.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(label);
		
		// �޴� �ȿ� �� ��ư
		JButton button1 = new JButton("���� ���� ��ȸ");
		JButton button2 = new JButton("���� ���� ��ȸ");
		JButton button3 = new JButton("���� ���� ��ȸ");
		
		button1.setLocation(80,140);
		button1.setSize(140, 60);
		contentPane.add(button1);
		
		button2.setLocation(80,220);
		button2.setSize(140, 60);
		contentPane.add(button2);
		
		button3.setLocation(80,300);
		button3.setSize(140, 60);
		contentPane.add(button3);
		
		button1.addActionListener(new MyActionListener1());
		button2.addActionListener(new MyActionListener2());
		button3.addActionListener(new MyActionListener3());
		
		setSize(300, 500); // ������ ũ�� 300x150 ����
		setVisible(true); // ȭ�鿡 ������ ���
	}
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			new Student_menu();
	}
	
	class MyActionListener1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new Graduation_requirement();
		}	
	}

	class MyActionListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new Personal_information();
		}	
	}
	
	class MyActionListener3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new Notice_m();
		}	
	}
}
