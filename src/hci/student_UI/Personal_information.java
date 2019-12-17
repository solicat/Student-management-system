package hci.student_UI;

import java.awt.*;
import javax.swing.*;

import dm.Account_data;
import pd.student_data.Career;
import pd.student_data.Foriegn_exchange;
import pd.student_data.Intern;
import pd.student_data.Language_score;
import pd.student_data.Student;
import pd.student_data.Subject;


public class Personal_information extends JFrame {

		public Personal_information() {

			Student current = (Student) Account_data.getCurrentAccount().getUser();
			Career std_career = current.getCareer();
			
			setTitle("���� ����"); // �������� Ÿ��Ʋ�ޱ�
			//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			Container contentPane = getContentPane(); // ����Ʈ�Ҿ˾Ƴ���
			contentPane.setBackground(Color.WHITE); // �Ͼ�� ��漳��
			contentPane.setLayout(null); 	// Layout�� ������ �ʱ�	
											// ������ ��ġ�� ������ �ֱ� ����
			
			String[]columns = new String[] {"����", "����"};			
			Object[][] data = new Object[6][2];
			JTable table = new JTable(data, columns);
			
			data[0][0] = "�̸�";
			data[1][0] = "�й�";
			data[2][0] = "�޴���ȭ";
			data[3][0] = "�ڽ�";
			data[4][0] = "Ʈ��";
			data[5][0] = "���ӱ���";
			data[0][1] = current.getName();
			data[1][1] = current.getStudent_number();
			data[2][1] = current.getPhone_number();
			data[3][1] = current.getCourse();
			data[4][1] = current.getTrack();
			data[5][1] = current.getProfessor();
			
			table.getColumn("����").setPreferredWidth(150);
			
			JPanel personal_info_p = new JPanel();
			personal_info_p.setLayout(new BorderLayout());
			JScrollPane scroll = new JScrollPane(table);
			scroll.setPreferredSize(new Dimension(600,100));
			JLabel personal_info_l = new JLabel("���� ����");
			personal_info_p.add(personal_info_l, BorderLayout.NORTH);
			personal_info_p.add(scroll, BorderLayout.CENTER);
			
			personal_info_p.setLocation(20, 45);
			personal_info_p.setSize(600, 140);
			personal_info_p.setBackground(Color.WHITE);
			
			contentPane.add(personal_info_p);
			
			
			
			String[] columns1 = new String[] {
					"����", "�л����"
			};
			
			int row = 0;
			int col = 0;
			
			Object[][] requireTable = new Object[8][2];
			
			JTable table1 = new JTable(requireTable, columns1);
			
			table1.getColumn("����").setPreferredWidth(150);
						
			JPanel requirePanel = new JPanel();
			requirePanel.setLayout(new BorderLayout());
			JScrollPane scroll1 = new JScrollPane(table1);
			scroll1.setPreferredSize(new Dimension(600,120));
			JLabel requireLabel = new JLabel("�л� ���");
			requirePanel.add(requireLabel, BorderLayout.NORTH);
			requirePanel.add(scroll1, BorderLayout.CENTER);
			
			requirePanel.setLocation(20, 210);
			requirePanel.setSize(600, 150);
			requirePanel.setBackground(Color.WHITE);
			
			requireTable[row][col++] = "��� ����";
			for(Language_score i : std_career.getEng_grade()) {
				requireTable[row][col++] = i;				
				col = 1;
				row++;
			}
			
			col = 0;
			requireTable[row][col++] = "�ؿ� ��ȯ �л�";
			for(Foriegn_exchange i : std_career.getExchange()) {
				requireTable[row][col++] = i;
				col = 1;
				row++;
			}
			
			col = 0;
			requireTable[row][col++] = "����";
			for(Intern i : std_career.getIntern()) {
				requireTable[row][col++] = i;
				col = 1;
				row++;
			}
			
			col = 0;
			requireTable[row][col++] = "���Ƚ��";
			requireTable[row][col++] = std_career.getCount_counseling();
			
			contentPane.add(requirePanel);
			
			
			JPanel requirePanel3 = new JPanel();
			requirePanel3.setLayout(new BorderLayout());
			JLabel subjectLabel3 = new JLabel("�̼�����");
			//��������
			String[] columns3 = new String[] {
					"����", "�����ڵ�", "����", "����"
			};			
			Object[][] infoTable = new Object[8][4];
			JTable info = new JTable(infoTable,columns3);
			info.getColumn("����").setPreferredWidth(100);
			info.getColumn("�����ڵ�").setPreferredWidth(150);
			info.getColumn("����").setPreferredWidth(200);
			JScrollPane scroll3 = new JScrollPane(info);
			scroll3.setPreferredSize(new Dimension(300, 120));
			requirePanel3.add(subjectLabel3, BorderLayout.NORTH);
			requirePanel3.add(scroll3, BorderLayout.CENTER);
			row = 0; col = 0;
			for(Subject i : std_career.getSubject()) {
				infoTable[row][col++] = i.getGrade();
				infoTable[row][col++] = i.getCode();
				infoTable[row][col++] = i.getCourse_name();
				infoTable[row][col++] = i.getProf_name();				
				col = 0;
				row++;
			}
			
			requirePanel3.setLocation(20, 370);
			requirePanel3.setSize(600, 150);
			requirePanel3.setBackground(Color.WHITE);
			
			contentPane.add(requirePanel3);
			
			setSize(650, 600); // ������ ũ�� 300x150 ����
			setVisible(true); // ȭ�鿡 ������ ���
		}
		
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Personal_information();
	}*/

}
