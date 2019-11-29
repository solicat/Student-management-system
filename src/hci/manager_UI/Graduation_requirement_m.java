package manager_UI;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import manager_UI.Graduation_requirement_c;
import manager_UI.Graduation_requirement_i;

//import manager_UI.Manager_menu.MyActionListener1;
//import manager_UI.Manager_menu.MyActionListener2;

public class Graduation_requirement_m extends JFrame{

	public Graduation_requirement_m() {

		setTitle("������"); // �������� Ÿ��Ʋ�ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane(); // ����Ʈ�Ҿ˾Ƴ���
		contentPane.setBackground(Color.WHITE); // �Ͼ�� ��漳��
		contentPane.setLayout(null); 	// Layout�� ������ �ʱ�	
										// ������ ��ġ�� ������ �ֱ� ����
		
		JLabel label = new JLabel("���� ��� ����");
		label.setLocation(80,50);
		label.setSize(140, 60);
		label.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(label);
		
		// �޴� �ȿ� �� ��ư
		JButton button1 = new JButton("Ʈ���� �������");
		JButton button2 = new JButton("������� �߰�");
		
		button1.setLocation(80,140);
		button1.setSize(140, 60);
		contentPane.add(button1);
		
		button2.setLocation(80,220);
		button2.setSize(140, 60);
		contentPane.add(button2);
		
		button1.addActionListener(new MyActionListener1());
		button2.addActionListener(new MyActionListener2());
		
		setSize(300, 500); // ������ ũ�� 300x150 ����
		setVisible(true); // ȭ�鿡 ������ ���
	}


/*
 * 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Graduation_requirement_m();
	}
 * */

	class MyActionListener1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new Graduation_requirement_c();
		}	
	}
	
	class MyActionListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new Graduation_requirement_i();
		}	
	}


}
