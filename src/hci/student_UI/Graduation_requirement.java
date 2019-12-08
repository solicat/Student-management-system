package hci.student_UI;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import dm.Requirement_data;
import dm.Account_data;
import pd.management.Requirement;
import pd.student_data.Subject;
import pd.student_data.Student;
import pd.student_data.Career;

public class Graduation_requirement extends JFrame{

		public Graduation_requirement() {

			setTitle("���� ��� ��ȸ"); // �������� Ÿ��Ʋ�ޱ�
			//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			Container contentPane = getContentPane(); // ����Ʈ�Ҿ˾Ƴ���
			contentPane.setBackground(Color.WHITE); // �Ͼ�� ��漳��
			contentPane.setLayout(null); 	// Layout�� ������ �ʱ�	
											// ������ ��ġ�� ������ �ֱ� ����
			
			JLabel label = new JLabel("���� ��� �޼���");
			label.setLocation(80,5);
			label.setSize(140, 60);
			label.setHorizontalAlignment(JLabel.CENTER);
			contentPane.add(label);
			
			Requirement_data data = new Requirement_data();
			data.openRequirement();
			ArrayList<Requirement> requirement = data.get_Requirement();
			Requirement check = null;
			
			Student current = (Student) Account_data.getCurrentAccount().getUser();
			Career std_carrer = current.getCareer();
			
			String track = current.getTrack();
			
			//String track -> requirement
			if(track.equals("��ȭ��ǻ��")) {
				for (Requirement i : requirement) {
					if(i.getTrack() == 0) {
						check = i;
						break;
					}
				}
			}else if(track.equals("�۷ι�����Ʈ���� ��������")) {
				for (Requirement i : requirement) {
					if(i.getTrack() == 1) {
						check = i;
						break;
					}
				}
			}else if(track.equals("�۷ι�����Ʈ���� �ؿܺ�������")) {
				for (Requirement i : requirement) {
					if(i.getTrack() == 2) {
						check = i;
						break;
					}
				}
			}else if(track.equals("�۷ι�����Ʈ���� �м��翬��")) {
				for (Requirement i : requirement) {
					if(i.getTrack() == 3) {
						check = i;
						break;
					}
				}
			}else if(track.equals("SW ���� ����")) {
				for (Requirement i : requirement) {
					if(i.getTrack() == 4) {
						check = i;
						break;
					}
				}
			}
			
					
			//panel
			JPanel requirePanel = new JPanel();
			requirePanel.setLayout(new GridLayout(15, 1)); //�ִ� �ʼ����� ���� ���� ���� �ʿ�
			
			JLabel languageLabel = new JLabel("��� ����: "+check.getLanguage_score().getType() + " " + check.getLanguage_score().getScore());
			requirePanel.add(languageLabel);
			
			JLabel exchangeLabel = new JLabel("�ؿ� ��ȯ �л�: "+check.getForiegn_exchange().getCountry_name() + " " + check.getForiegn_exchange().getUniv_name()
					+ " " + check.getForiegn_exchange().getCredit());
			requirePanel.add(exchangeLabel);
			
			JLabel internLabel = new JLabel("����: "+check.getIntern().getCompany_name() + " " + check.getIntern().getPeriod() + " "
					+ check.getIntern().getCredit());
			requirePanel.add(internLabel);
			
			requirePanel.add(new JLabel("�ʼ�����: "));
			ArrayList<JLabel> subject = new ArrayList<JLabel>();
			for (Subject j : check.getEssential_subject())
				subject.add(new JLabel("'" + j.getGrade() + " " + j.getCode() + " " + j.getCourse_name() + " "
						+ j.getProf_name() + "'"));
			for (JLabel l : subject) {
				requirePanel.add(l);
			}
			
			JLabel consultLabel = new JLabel("���: "+check.getConsult_cnt() + " " + check.getMajor() + " " + check.getTrack() + " " + check.getIn_year());
			requirePanel.add(consultLabel);
			
			requirePanel.setLocation(20, 45);
			requirePanel.setSize(250, 400);
			requirePanel.setBackground(Color.WHITE);
			
			contentPane.add(requirePanel);
			
			System.out.println("		�л����	��������	�޼�����");

			
			setSize(300, 500);
			setVisible(true); // ȭ�鿡 ������ ���
		}
	
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Graduation_requirement();
	}
*/

}
