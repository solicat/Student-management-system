package hci.manager_UI;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import hci.manager_UI.Graduation_requirement_c;
import hci.manager_UI.Graduation_requirement_i;
import hci.manager_UI.Notice_m.MyActionListener2;
import dm.Requirement_data;
import pd.management.Requirement;

public class Graduation_requirement_m extends JFrame{

	public Graduation_requirement_m() {

		setTitle("졸업 요건 관리"); // 프레임의 타이틀달기
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Container contentPane = getContentPane(); // 컨텐트팬알아내기
		contentPane.setBackground(Color.WHITE); // 하얀색 배경설정
		contentPane.setLayout(null); 	// Layout을 정하지 않기	
										// 절대적 위치를 지정해 주기 위해
		
		JLabel label = new JLabel("졸업 요건 목록");
		label.setLocation(80,50);
		label.setSize(140, 60);
		label.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(label);
		
		// 메뉴 안에 들어갈 버튼
		String[] track = new String[] {
				"심화컴퓨터", "글로벌소프트웨어 다중전공", "글로벌소프트웨어 해외복수학위", "글로벌소프트웨어 학석사연계", "SW 연계 융합"
		};
		JPanel panel1 = new JPanel();
		ArrayList<Requirement> require = Requirement_data.getList();
		JButton[] btn = new JButton[require.size()];
		panel1.setLayout(new GridLayout(require.size(), 1));
		for(int i = 0; i < require.size(); i++) {
			btn[i] = new JButton(track[require.get(i).getTrack()]);
			btn[i].addActionListener(new MyActionListener1());
			panel1.add(btn[i]);
		}
		panel1.setLocation(20, 140);
		panel1.setSize(250, 20*require.size());
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
		new Graduation_requirement_m();
	}
 * */

	class MyActionListener1 implements ActionListener{		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton btn = (JButton) e.getSource();
			String title = btn.getActionCommand();

			new Graduation_requirement_i(title);
		}	
	}
	
	class MyActionListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new Graduation_requirement_c();
		}	
	}


}
