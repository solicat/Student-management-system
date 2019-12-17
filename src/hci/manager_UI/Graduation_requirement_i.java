package hci.manager_UI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import dm.Requirement_data;
import pd.management.Requirement;
import pd.student_data.Language_score;
import pd.student_data.Subject;

public class Graduation_requirement_i extends JFrame{

	public Graduation_requirement_i(String track) {

		setTitle("���� ��� ����"); // �������� Ÿ��Ʋ�ޱ�
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Container contentPane = getContentPane(); // ����Ʈ�Ҿ˾Ƴ���
		contentPane.setBackground(Color.WHITE); // �Ͼ�� ��漳��
		contentPane.setLayout(null); 	// Layout�� ������ �ʱ�	
										// ������ ��ġ�� ������ �ֱ� ����
		Requirement require = Requirement_data.getRequireByTrack(track);
		
		JPanel requirePanel0 = new JPanel();
		requirePanel0.setLayout(new BorderLayout());
		JLabel label0 = new JLabel(track + " ���� ���");
		requirePanel0.add(label0);
		requirePanel0.setLocation(20, 10);
		requirePanel0.setSize(500, 20);
		requirePanel0.setBackground(Color.WHITE);
		
		contentPane.add(requirePanel0);
		
		JPanel requirePanel1 = new JPanel();
		requirePanel1.setLayout(new BorderLayout());
		JLabel label1 = new JLabel("��� ����");
		String[] column1 = new String[] {
				"���� ����", "����"
		};
		Object[][] table1 = new Object[1][2];
		JTable info1 = new JTable(table1, column1);
		info1.getColumn("���� ����").setPreferredWidth(100);
		JScrollPane scroll1 = new JScrollPane(info1);
		scroll1.setPreferredSize(new Dimension(200, 100));
		requirePanel1.add(label1, BorderLayout.NORTH);
		requirePanel1.add(scroll1, BorderLayout.CENTER);
		int row = 0; int col = 0;
		table1[row][col++] = require.getLanguage_score().getType();
		table1[row][col++] = require.getLanguage_score().getScore();
		requirePanel1.setLocation(20, 40);
		requirePanel1.setSize(250, 100);
		requirePanel1.setBackground(Color.WHITE);
		
		contentPane.add(requirePanel1);		
		
		JPanel requirePanel2 = new JPanel();
		requirePanel2.setLayout(new BorderLayout());
		JLabel label2 = new JLabel("�ؿܴ��� ����");
		String[] column2 = new String[] {
				"����", "����", "����"
		};
		Object[][] table2 = new Object[1][3];
		JTable info2 = new JTable(table2, column2);
		info2.getColumn("����").setPreferredWidth(80);
		info2.getColumn("����").setPreferredWidth(80);
		JScrollPane scroll2 = new JScrollPane(info2);
		scroll2.setPreferredSize(new Dimension(200, 100));
		requirePanel2.add(label2, BorderLayout.NORTH);
		requirePanel2.add(scroll2, BorderLayout.CENTER);
		row = 0; col = 0;
		table2[row][col++] = require.getForiegn_exchange().getCountry_name();
		table2[row][col++] = require.getForiegn_exchange().getUniv_name();
		table2[row][col++] = require.getForiegn_exchange().getCredit();
		requirePanel2.setLocation(20, 150);
		requirePanel2.setSize(250, 100);
		requirePanel2.setBackground(Color.WHITE);
		
		contentPane.add(requirePanel2);
		
		JPanel requirePanel3 = new JPanel();
		requirePanel3.setLayout(new BorderLayout());
		JLabel label3 = new JLabel("����");
		String[] column3 = new String[] {
				"ȸ��", "�Ⱓ", "����"
		};
		Object[][] table3 = new Object[1][3];
		JTable info3 = new JTable(table3, column3);
		info3.getColumn("ȸ��").setPreferredWidth(80);
		info3.getColumn("�Ⱓ").setPreferredWidth(80);
		JScrollPane scroll3 = new JScrollPane(info3);
		scroll3.setPreferredSize(new Dimension(200, 100));
		requirePanel3.add(label3, BorderLayout.NORTH);
		requirePanel3.add(scroll3, BorderLayout.CENTER);
		row = 0; col = 0;
		table3[row][col++] = require.getIntern().getCompany_name();
		table3[row][col++] = require.getIntern().getPeriod();
		table3[row][col++] = require.getIntern().getCredit();
		requirePanel3.setLocation(20, 260);
		requirePanel3.setSize(250, 100);
		requirePanel3.setBackground(Color.WHITE);
		
		contentPane.add(requirePanel3);
		
		JPanel requirePanel4 = new JPanel();
		requirePanel4.setLayout(new BorderLayout());
		JLabel label4 = new JLabel("�ʼ�����");
		String[] column4 = new String[] {
				"�����ڵ�", "�����"
		};
		Object[][] table4 = new Object[20][2];
		JTable info4 = new JTable(table4, column4);
		JScrollPane scroll4 = new JScrollPane(info4);
		scroll4.setPreferredSize(new Dimension(200, 100));
		requirePanel4.add(label4, BorderLayout.NORTH);
		requirePanel4.add(scroll4, BorderLayout.CENTER);
		row = 0; col = 0;
		for(Subject i : require.getEssential_subject()) {
			table4[row][col++] = i.getCode();
			table4[row][col++] = i.getCourse_name();
			col = 0;
			row++;
		}
		requirePanel4.setLocation(300, 40);
		requirePanel4.setSize(300, 320);
		requirePanel4.setBackground(Color.WHITE);
		
		contentPane.add(requirePanel4);
		
		JPanel requirePanel5 = new JPanel();
		requirePanel5.setLayout(new BorderLayout());
		JLabel label5 = new JLabel("���� �й�: " + require.getIn_year());
		requirePanel5.add(label5);
		requirePanel5.setLocation(20, 380);
		requirePanel5.setSize(500, 20);
		requirePanel5.setBackground(Color.WHITE);
		
		contentPane.add(requirePanel5);
		
		JPanel requirePanel6 = new JPanel();
		requirePanel6.setLayout(new BorderLayout());
		JButton button1 = new JButton("����");
		button1.addActionListener(new MyActionListener1());
		requirePanel6.add(button1);
		requirePanel6.setLocation(420, 380);
		requirePanel6.setSize(80, 20);
		
		contentPane.add(requirePanel6);
		
		JPanel requirePanel7 = new JPanel();
		requirePanel7.setLayout(new BorderLayout());
		JButton button2 = new JButton("���");
		requirePanel7.add(button2);
		button2.addActionListener(new MyActionListener2());
		requirePanel7.setLocation(520, 380);
		requirePanel7.setSize(80, 20);
		
		contentPane.add(requirePanel7);
		
		setSize(650, 600); 
		setVisible(true); // ȭ�鿡 ������ ���
	}

/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Graduation_requirement_i("��ȭ��ǻ��");
	}
*/	
	class MyActionListener1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		}	
	}
	
	class MyActionListener2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		}	
	}

}
