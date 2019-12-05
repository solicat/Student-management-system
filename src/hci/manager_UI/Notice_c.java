package hci.manager_UI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import pd.management.Notice;

public class Notice_c extends JFrame implements ActionListener{
	//������:�������� �߰� UI
	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;
	
	public static final int TITLE_CHAR = 30;
	public static final int CONTENT_CHAR = 100;
	
	private JTextField title;
	private JTextArea content;
	private JTextField type;
	
	public Notice_c() {
		setTitle("��������"); // �������� Ÿ��Ʋ�ޱ�
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		Container contentPane = getContentPane(); // ����Ʈ�Ҿ˾Ƴ���
		contentPane.setBackground(Color.WHITE); // �Ͼ�� ��漳��
		contentPane.setLayout(null); 	// Layout�� ������ �ʱ�	
									// ������ ��ġ�� ������ �ֱ� ����
		
		JLabel label = new JLabel("���� ���� �߰�");
		label.setLocation(175,20);
		label.setSize(140,20);
		label.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(label);
		
		JPanel addNoticePanel = new JPanel();
		
		/*Title*/
		JPanel titlePanel = new JPanel();
		title = new JTextField(TITLE_CHAR);
		JLabel titleLabel = new JLabel("���� : ");
		titlePanel.add(titleLabel);
		titlePanel.add(title);
		//titlePanel.setLocation(40, 140);
		//titlePanel.setSize(400, 60);
		
		addNoticePanel.add(titlePanel);
		//add(titlePanel);
		
		
		/*Type*/
		JPanel typePanel = new JPanel();
		type = new JTextField(TITLE_CHAR);
		JLabel typeLabel = new JLabel("�з� : ");
		typePanel.add(typeLabel);
		typePanel.add(type);
		addNoticePanel.add(typePanel);
		
		/*Content*/
		content = new JTextArea(14, 35);
		addNoticePanel.add(content);
		
		addNoticePanel.setSize(400,350);
		addNoticePanel.setLocation(40, 40);
		contentPane.add(addNoticePanel);
		
		// �޴� �ȿ� �� ��ư
		//JButton button1 = new JButton("���� ���� ����");
		JButton button2 = new JButton("�߰�");
		
		/*
		button1.setLocation(80,140);
		button1.setSize(140, 60);
		contentPane.add(button1);
		*/
		
		button2.addActionListener(this);
		button2.setLocation(200,400);
		button2.setSize(100, 30);
		contentPane.add(button2);
		
		
		setSize(WIDTH, HEIGHT); // ������ ũ�� ����
		setVisible(true); // ȭ�鿡 ������ ���
		
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
		JLabel added = new JLabel("���������� �߰��Ǿ����ϴ�.");
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