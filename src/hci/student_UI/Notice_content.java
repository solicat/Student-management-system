package hci.student_UI;

import java.awt.*;
import javax.swing.*;

import dm.Notice_data;
import pd.management.Notice;

public class Notice_content extends JFrame{

	public Notice_content(String title) {

		setTitle("공지사항"); // 프레임의 타이틀달기
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Container contentPane = getContentPane(); // 컨텐트팬알아내기
		contentPane.setBackground(Color.WHITE); // 하얀색 배경설정
		contentPane.setLayout(new BorderLayout(10,10));
		
		Notice notice = Notice_data.getNoticeByTitle(title);
		JPanel topPanel = new JPanel(new GridLayout(2,1));
		topPanel.setBackground(Color.WHITE); // 하얀색 배경설정

		/*Title*/
		JLabel titleLabel = new JLabel("제목 : "+title);
		//titleLabel.setHorizontalAlignment(JLabel.LEFT);
		topPanel.add(titleLabel);
		
		/*Type*/
		JLabel typeLabel = new JLabel("분류 : "+notice.getType());
		//typeLabel.setHorizontalAlignment(JLabel.LEFT);
		topPanel.add(typeLabel);
		
		contentPane.add(topPanel, BorderLayout.NORTH);
		
		
		/*Content*/
		TextArea content = new TextArea(notice.getContent());
		content.setEditable(false);
		content.setBackground(Color.WHITE); // 하얀색 배경설정
		contentPane.add(content, BorderLayout.CENTER);
		
		setSize(300, 500); // 프레임 크기 300x150 설정
		setVisible(true); // 화면에 프레임 출력	
		}
}