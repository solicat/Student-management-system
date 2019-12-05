package hci.manager_UI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import pd.management.Notice;

public class Notice_c extends JFrame implements ActionListener{
	//관리자:공지사항 추가 UI
	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;
	
	public static final int TITLE_CHAR = 30;
	public static final int CONTENT_CHAR = 100;
	
	private JTextField title;
	private JTextArea content;
	private JTextField type;
	
	public Notice_c() {
		setTitle("공지사항"); // 프레임의 타이틀달기
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		Container contentPane = getContentPane(); // 컨텐트팬알아내기
		contentPane.setBackground(Color.WHITE); // 하얀색 배경설정
		contentPane.setLayout(null); 	// Layout을 정하지 않기	
									// 절대적 위치를 지정해 주기 위해
		
		JLabel label = new JLabel("공지 사항 추가");
		label.setLocation(175,20);
		label.setSize(140,20);
		label.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(label);
		
		JPanel addNoticePanel = new JPanel();
		
		/*Title*/
		JPanel titlePanel = new JPanel();
		title = new JTextField(TITLE_CHAR);
		JLabel titleLabel = new JLabel("제목 : ");
		titlePanel.add(titleLabel);
		titlePanel.add(title);
		//titlePanel.setLocation(40, 140);
		//titlePanel.setSize(400, 60);
		
		addNoticePanel.add(titlePanel);
		//add(titlePanel);
		
		
		/*Type*/
		JPanel typePanel = new JPanel();
		type = new JTextField(TITLE_CHAR);
		JLabel typeLabel = new JLabel("분류 : ");
		typePanel.add(typeLabel);
		typePanel.add(type);
		addNoticePanel.add(typePanel);
		
		/*Content*/
		content = new JTextArea(14, 35);
		addNoticePanel.add(content);
		
		addNoticePanel.setSize(400,350);
		addNoticePanel.setLocation(40, 40);
		contentPane.add(addNoticePanel);
		
		// 메뉴 안에 들어갈 버튼
		//JButton button1 = new JButton("공지 사항 내용");
		JButton button2 = new JButton("추가");
		
		/*
		button1.setLocation(80,140);
		button1.setSize(140, 60);
		contentPane.add(button1);
		*/
		
		button2.addActionListener(this);
		button2.setLocation(200,400);
		button2.setSize(100, 30);
		contentPane.add(button2);
		
		
		setSize(WIDTH, HEIGHT); // 프레임 크기 설정
		setVisible(true); // 화면에 프레임 출력
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String inputTitle = title.getText();
		String inputType = type.getText();
		String inputContent = content.getText();
		
		Notice newNotice = new Notice(inputType, inputTitle, inputContent);
		newNotice.create_notice();
		
		/*test*/
		/* 
		Notice_data data = new Notice_data();
		data.openNotice();
		
		ArrayList<Notice> not = Notice_data.getList();
		for(Notice iter : not)
			System.out.println(iter.getType()+": "+iter.getTitle()+"\n"+iter.getContent());
		*/
		
		getContentPane().removeAll();
		JLabel added = new JLabel("공지사항이 추가되었습니다.");
		JPanel addedPanel = new JPanel();
		addedPanel.add(added);
		addedPanel.setSize(200, 50);
		addedPanel.setLocation(145, 200);
		addedPanel.setBackground(Color.WHITE);
		getContentPane().add(addedPanel);
		revalidate();
		repaint();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Notice_c();
	}
	

}