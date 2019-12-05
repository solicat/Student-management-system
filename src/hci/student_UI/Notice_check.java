package hci.student_UI;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import dm.Notice_data;
import pd.management.Notice;

public class Notice_check extends JFrame{
	public Notice_check() {

		setTitle("��������"); // �������� Ÿ��Ʋ�ޱ�
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Container contentPane = getContentPane(); // ����Ʈ�Ҿ˾Ƴ���
		contentPane.setBackground(Color.WHITE); // �Ͼ�� ��漳��
		contentPane.setLayout(null); 	// Layout�� ������ �ʱ�	
										// ������ ��ġ�� ������ �ֱ� ����
		
		JLabel label = new JLabel("�������� ���");
		label.setLocation(80,50);
		label.setSize(140, 60);
		label.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(label);
		
		// �޴� �ȿ� �� ��ư
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
		
		//button2.setLocation(80,220);
		//button2.setSize(140, 60);
		//contentPane.add(button2);
		
		//button1.addActionListener(new MyActionListener1());
		//button2.addActionListener(new MyActionListener2());
		
		setSize(300, 500); // ������ ũ�� 300x150 ����
		setVisible(true); // ȭ�鿡 ������ ���
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
		    
			new Notice_content(title);
		}	
	}
	/*
	
	class MyActionListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new Notibe_i();
		}	
	}
	*/
}
