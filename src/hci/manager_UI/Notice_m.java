package hci.manager_UI;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import dm.Notice_data;
import pd.management.Notice;

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
		JPanel panel1 = new JPanel();
		ArrayList<Notice> notice = Notice_data.getList();
		JButton[] btn = new JButton[notice.size()];
		panel1.setLayout(new GridLayout(notice.size(),1));
		for(int i =0; i< notice.size(); i++) {
			btn[i] = new JButton(notice.get(i).getTitle());
			btn[i].addActionListener(new MyActionListener1());
			panel1.add(btn[i]);
		}	
		panel1.setLocation(20,140);
		panel1.setSize(250, 20*notice.size());
		contentPane.add(panel1);
		
		JButton button2 = new JButton("추가");
		button2.setLocation(110,350);
		button2.setSize(80, 20);
		contentPane.add(button2);
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
			JButton btn = (JButton) e.getSource();
			String title = btn.getActionCommand();
			    
			new Notibe_i(title);
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