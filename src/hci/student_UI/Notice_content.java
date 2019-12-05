package hci.student_UI;

import java.awt.*;
import javax.swing.*;

import dm.Notice_data;
import pd.management.Notice;

public class Notice_content extends JFrame{

	public Notice_content(String title) {

		setTitle("��������"); // �������� Ÿ��Ʋ�ޱ�
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Container contentPane = getContentPane(); // ����Ʈ�Ҿ˾Ƴ���
		contentPane.setBackground(Color.WHITE); // �Ͼ�� ��漳��
		contentPane.setLayout(new BorderLayout(10,10));
		
		Notice notice = Notice_data.getNoticeByTitle(title);
		JPanel topPanel = new JPanel(new GridLayout(2,1));
		topPanel.setBackground(Color.WHITE); // �Ͼ�� ��漳��

		/*Title*/
		JLabel titleLabel = new JLabel("���� : "+title);
		//titleLabel.setHorizontalAlignment(JLabel.LEFT);
		topPanel.add(titleLabel);
		
		/*Type*/
		JLabel typeLabel = new JLabel("�з� : "+notice.getType());
		//typeLabel.setHorizontalAlignment(JLabel.LEFT);
		topPanel.add(typeLabel);
		
		contentPane.add(topPanel, BorderLayout.NORTH);
		
		
		/*Content*/
		TextArea content = new TextArea(notice.getContent());
		content.setEditable(false);
		content.setBackground(Color.WHITE); // �Ͼ�� ��漳��
		contentPane.add(content, BorderLayout.CENTER);
		
		setSize(300, 500); // ������ ũ�� 300x150 ����
		setVisible(true); // ȭ�鿡 ������ ���	
		}
}