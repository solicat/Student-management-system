package hci.student_UI;

import java.awt.*;
import javax.swing.*;


public class Personal_information extends JFrame {

		public Personal_information() {

			setTitle("���� ����"); // �������� Ÿ��Ʋ�ޱ�
			//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			Container contentPane = getContentPane(); // ����Ʈ�Ҿ˾Ƴ���
			contentPane.setBackground(Color.WHITE); // �Ͼ�� ��漳��
			contentPane.setLayout(null); 	// Layout�� ������ �ʱ�	
											// ������ ��ġ�� ������ �ֱ� ����
			
			JLabel label = new JLabel("���� ���� ��ȸ");
			label.setLocation(80,50);
			label.setSize(140, 60);
			label.setHorizontalAlignment(JLabel.CENTER);
			contentPane.add(label);
			
			// �޴� �ȿ� �� ��ư
			JButton button1 = new JButton("���� ����");
			JButton button2 = new JButton("����");
			
			button1.setLocation(80,140);
			button1.setSize(140, 60);
			contentPane.add(button1);
			
			button2.setLocation(80,220);
			button2.setSize(140, 60);
			contentPane.add(button2);
			
			setSize(300, 500); // ������ ũ�� 300x150 ����
			setVisible(true); // ȭ�鿡 ������ ���
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Personal_information();
	}

}
