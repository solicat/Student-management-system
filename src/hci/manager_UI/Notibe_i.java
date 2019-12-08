package hci.manager_UI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import dm.Notice_data;
import pd.management.Notice;

public class Notibe_i extends JFrame{
	public static final int TITLE_CHAR = 20;
	private JTextField titleField;
	private JTextArea content;
	private JTextField type;
	private String title_s;
	private String content_s;
	private String type_s;
	
	public Notibe_i(String title) {

		setTitle("��������"); // �������� Ÿ��Ʋ�ޱ�
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Container contentPane = getContentPane(); // ����Ʈ�Ҿ˾Ƴ���
		contentPane.setBackground(Color.WHITE); // �Ͼ�� ��漳��
		contentPane.setLayout(new BorderLayout(10,10)); 	
		
		Notice notice = Notice_data.getNoticeByTitle(title);
		title_s = title;
		
		JPanel topPanel = new JPanel(new GridLayout(2,1));
		
		/*Title*/
		JPanel titlePanel = new JPanel();
		JLabel titleLabel = new JLabel("���� : ");
		JTextField titleField = new JTextField(title_s, TITLE_CHAR);
		titlePanel.add(titleLabel);
		titlePanel.add(titleField);
		topPanel.add(titlePanel);
		
		/*Type*/
		JPanel typePanel = new JPanel();
		JLabel typeLabel = new JLabel("�з� : ");
		type_s = notice.getType();
		JTextField type = new JTextField(type_s, TITLE_CHAR);
		typePanel.add(typeLabel);
		typePanel.add(type);
		topPanel.add(typePanel);
		
		contentPane.add(topPanel, BorderLayout.NORTH);
		
		
		/*Content*/
		content_s = notice.getContent();
		TextArea content = new TextArea(content_s);
		contentPane.add(content, BorderLayout.CENTER);
		
		/*Buttons*/
		JPanel buttonPanel = new JPanel(new GridLayout(1,2));
		JButton button1 = new JButton("����");
		JButton button2 = new JButton("����");
		
		button2.addActionListener(new MyActionListener1());
		
		buttonPanel.add(button1);	buttonPanel.add(button2);		
		contentPane.add(buttonPanel, BorderLayout.SOUTH);

		
		setSize(300, 500); // ������ ũ�� 300x150 ����
		setVisible(true); // ȭ�鿡 ������ ���
	}

	
	class MyActionListener1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Notice newNotice = new Notice(type_s, title_s, content_s);
			newNotice.delete_notice();
			
			getContentPane().removeAll();
			JLabel added = new JLabel("���������� �����Ǿ����ϴ�.");
			JPanel addedPanel = new JPanel();
			addedPanel.add(added);
			addedPanel.setSize(200, 50);
			addedPanel.setLocation(145, 200);
			addedPanel.setBackground(Color.WHITE);
			getContentPane().add(addedPanel);
			revalidate();
			repaint();
		}	
	}

/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Graduation_requirement_c();
	}
*/


}