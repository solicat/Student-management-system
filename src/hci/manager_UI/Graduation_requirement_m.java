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

		setTitle("���� ��� ����"); // �������� Ÿ��Ʋ�ޱ�
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Container contentPane = getContentPane(); // ����Ʈ�Ҿ˾Ƴ���
		contentPane.setBackground(Color.WHITE); // �Ͼ�� ��漳��
		contentPane.setLayout(null); 	// Layout�� ������ �ʱ�	
										// ������ ��ġ�� ������ �ֱ� ����
		
		JLabel label = new JLabel("���� ��� ���");
		label.setLocation(80,50);
		label.setSize(140, 60);
		label.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(label);
		
		// �޴� �ȿ� �� ��ư
		String[] track = new String[] {
				"��ȭ��ǻ��", "�۷ι�����Ʈ���� ��������", "�۷ι�����Ʈ���� �ؿܺ�������", "�۷ι�����Ʈ���� �м��翬��", "SW ���� ����"
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
		
		JButton button2 = new JButton("�߰�");
		button2.setLocation(110,350);
		button2.setSize(80, 20);
		contentPane.add(button2);
		button2.addActionListener(new MyActionListener2());
		
		setSize(300, 500); // ������ ũ�� 300x150 ����
		setVisible(true); // ȭ�鿡 ������ ���
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
