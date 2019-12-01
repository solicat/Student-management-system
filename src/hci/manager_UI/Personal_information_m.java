package hci.manager_UI;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import hci.manager_UI.Account_m.MyActionListener1;
import hci.manager_UI.Account_m.MyActionListener2;


public class Personal_information_m extends JFrame{

	public Personal_information_m() {

		setTitle("학생 경력 관리"); // 프레임의 타이틀달기
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Container contentPane = getContentPane(); // 컨텐트팬알아내기
		contentPane.setBackground(Color.WHITE); // 하얀색 배경설정
		contentPane.setLayout(null); 	// Layout을 정하지 않기	
										// 절대적 위치를 지정해 주기 위해
		
		JLabel label = new JLabel("학생 경력 관리");
		label.setLocation(80,50);
		label.setSize(140, 60);
		label.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(label);
		
		// 메뉴 안에 들어갈 버튼
		JButton button1 = new JButton("학생");
		
		button1.setLocation(80,140);
		button1.setSize(140, 60);
		contentPane.add(button1);
				
		button1.addActionListener(new MyActionListener1());
		
		setSize(300, 500); // 프레임 크기 300x150 설정
		setVisible(true); // 화면에 프레임 출력
	}


/*
 * 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Account_m();
	}
 * */

	class MyActionListener1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new Personal_information_c();
		}	
	}

}
