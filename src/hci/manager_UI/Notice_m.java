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
import pd.management.Administrator;

public class Notice_m extends JFrame{

	public Notice_m() {

		setTitle("공지사항"); // 프레임의 타이틀달기
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Container contentPane = getContentPane(); // 컨텐트팬알아내기
		contentPane.setBackground(Color.WHITE); // 하얀색 배경설정
		contentPane.setLayout(null); 	// Layout을 정하지 않기	
										// 절대적 위치를 지정해 주기 위해
		
		JLabel label = new JLabel("공지사항 목록");
		label.setLocation(80,50);
		label.setSize(140, 60);
		label.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(label);
		
		// 메뉴 안에 들어갈 버튼
		JButton button1 = new JButton("공지사항 제목");
		JButton button2 = new JButton("추가");
		
		button1.setLocation(80,140);
		button1.setSize(140, 60);
		contentPane.add(button1);
		
		button2.setLocation(80,220);
		button2.setSize(140, 60);
		contentPane.add(button2);
		
		button1.addActionListener(new MyActionListener1());
		button2.addActionListener(new MyActionListener2());
		
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
			new Notibe_i();
		}	
	}
	
	class MyActionListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new Notice_c();
		}	
	}
}