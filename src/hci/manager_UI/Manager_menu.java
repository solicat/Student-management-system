package hci.manager_UI;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import hci.manager_UI.Graduation_requirement_m;
/*
import student_UI.Personal_information;
import student_UI.Student_menu;
import student_UI.Student_menu.MyActionListener1;
import student_UI.Student_menu.MyActionListener2;
*/

public class Manager_menu extends JFrame{

	public Manager_menu() {

		setTitle("������ �޴�"); // �������� Ÿ��Ʋ�ޱ�
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Container contentPane = getContentPane(); // ����Ʈ�Ҿ˾Ƴ���
		contentPane.setBackground(Color.WHITE); // �Ͼ�� ��漳��
		contentPane.setLayout(null); 	// Layout�� ������ �ʱ�	
										// ������ ��ġ�� ������ �ֱ� ����
		
		JLabel label = new JLabel("������ �޴�");
		label.setLocation(80,50);
		label.setSize(140, 50);
		label.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(label);
		
		// �޴� �ȿ� �� ��ư
		JButton button1 = new JButton("���� ���� ����");
		JButton button2 = new JButton("���� ����");
		JButton button3 = new JButton("�л� ��� ����");		
		JButton button4 = new JButton("���� ���� ����");
		
		button1.setLocation(80,140);
		button1.setSize(140, 60);
		contentPane.add(button1);
		
		button2.setLocation(80,220);
		button2.setSize(140, 60);
		contentPane.add(button2);
		
		button3.setLocation(80,300);
		button3.setSize(140, 60);
		contentPane.add(button3);
		
		button4.setLocation(80,380);
		button4.setSize(140, 60);
		contentPane.add(button4);
		
		button1.addActionListener(new MyActionListener1());
		button2.addActionListener(new MyActionListener2());
		button3.addActionListener(new MyActionListener3());
		button4.addActionListener(new MyActionListener4());
		
		
		setSize(300, 500); // ������ ũ�� 300x150 ����
		setVisible(true); // ȭ�鿡 ������ ���
	}
	/*
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			new Manager_menu();
	}
	*/
	
	class MyActionListener1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new Graduation_requirement_m();
		}	
	}
	
	class MyActionListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new Account_m();
		}	
	}
	
	class MyActionListener3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new Personal_information_m();
		}	
	}
	
	class MyActionListener4 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new Notice_m();
		}	
	}
	
}
