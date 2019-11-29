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

		setTitle("관리자 메뉴"); // 프레임의 타이틀달기
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Container contentPane = getContentPane(); // 컨텐트팬알아내기
		contentPane.setBackground(Color.WHITE); // 하얀색 배경설정
		contentPane.setLayout(null); 	// Layout을 정하지 않기	
										// 절대적 위치를 지정해 주기 위해
		
		JLabel label = new JLabel("관리자 메뉴");
		label.setLocation(80,50);
		label.setSize(140, 50);
		label.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(label);
		
		// 메뉴 안에 들어갈 버튼
		JButton button1 = new JButton("졸업 조건 관리");
		JButton button2 = new JButton("계정 관리");
		JButton button3 = new JButton("학생 경력 관리");		
		JButton button4 = new JButton("공지 사항 관리");
		
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
		
		
		setSize(300, 500); // 프레임 크기 300x150 설정
		setVisible(true); // 화면에 프레임 출력
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
