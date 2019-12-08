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

			setTitle("졸업 요건 조회"); // 프레임의 타이틀달기
			//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			Container contentPane = getContentPane(); // 컨텐트팬알아내기
			contentPane.setBackground(Color.WHITE); // 하얀색 배경설정
			contentPane.setLayout(null); 	// Layout을 정하지 않기	
											// 절대적 위치를 지정해 주기 위해
			
			JLabel label = new JLabel("졸업 요건 달성도");
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
			if(track.equals("심화컴퓨터")) {
				for (Requirement i : requirement) {
					if(i.getTrack() == 0) {
						check = i;
						break;
					}
				}
			}else if(track.equals("글로벌소프트웨어 다중전공")) {
				for (Requirement i : requirement) {
					if(i.getTrack() == 1) {
						check = i;
						break;
					}
				}
			}else if(track.equals("글로벌소프트웨어 해외복수학위")) {
				for (Requirement i : requirement) {
					if(i.getTrack() == 2) {
						check = i;
						break;
					}
				}
			}else if(track.equals("글로벌소프트웨어 학석사연계")) {
				for (Requirement i : requirement) {
					if(i.getTrack() == 3) {
						check = i;
						break;
					}
				}
			}else if(track.equals("SW 연계 융합")) {
				for (Requirement i : requirement) {
					if(i.getTrack() == 4) {
						check = i;
						break;
					}
				}
			}
			
					
			//panel
			JPanel requirePanel = new JPanel();
			requirePanel.setLayout(new GridLayout(15, 1)); //최대 필수과목 수에 따라 조정 필요
			
			JLabel languageLabel = new JLabel("언어 점수: "+check.getLanguage_score().getType() + " " + check.getLanguage_score().getScore());
			requirePanel.add(languageLabel);
			
			JLabel exchangeLabel = new JLabel("해외 교환 학생: "+check.getForiegn_exchange().getCountry_name() + " " + check.getForiegn_exchange().getUniv_name()
					+ " " + check.getForiegn_exchange().getCredit());
			requirePanel.add(exchangeLabel);
			
			JLabel internLabel = new JLabel("인턴: "+check.getIntern().getCompany_name() + " " + check.getIntern().getPeriod() + " "
					+ check.getIntern().getCredit());
			requirePanel.add(internLabel);
			
			requirePanel.add(new JLabel("필수과목: "));
			ArrayList<JLabel> subject = new ArrayList<JLabel>();
			for (Subject j : check.getEssential_subject())
				subject.add(new JLabel("'" + j.getGrade() + " " + j.getCode() + " " + j.getCourse_name() + " "
						+ j.getProf_name() + "'"));
			for (JLabel l : subject) {
				requirePanel.add(l);
			}
			
			JLabel consultLabel = new JLabel("상담: "+check.getConsult_cnt() + " " + check.getMajor() + " " + check.getTrack() + " " + check.getIn_year());
			requirePanel.add(consultLabel);
			
			requirePanel.setLocation(20, 45);
			requirePanel.setSize(250, 400);
			requirePanel.setBackground(Color.WHITE);
			
			contentPane.add(requirePanel);
			
			System.out.println("		학생경력	졸업조건	달성여부");

			
			setSize(300, 500);
			setVisible(true); // 화면에 프레임 출력
		}
	
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Graduation_requirement();
	}
*/

}
