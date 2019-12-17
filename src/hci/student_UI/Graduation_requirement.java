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
import pd.student_data.Language_score;
import pd.student_data.Intern;
import pd.student_data.Foriegn_exchange;

public class Graduation_requirement extends JFrame{

		public Graduation_requirement() {
			
			

			setTitle("졸업 요건 조회"); // 프레임의 타이틀달기
			//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			Container contentPane = getContentPane(); // 컨텐트팬알아내기
			contentPane.setBackground(Color.WHITE); // 하얀색 배경설정
			contentPane.setLayout(null); 	// Layout을 정하지 않기	
											// 절대적 위치를 지정해 주기 위해
			
			Requirement_data data = new Requirement_data();
			data.openRequirement();
			ArrayList<Requirement> requirement = data.get_Requirement();
			Requirement check = null;
			
			Student current = (Student) Account_data.getCurrentAccount().getUser();
			Career std_career = current.getCareer();
			
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
			
			JPanel trk_p = new JPanel();
			JLabel trk_l = new JLabel(track);
			trk_p.add(trk_l);
			
			//headers for the table
			String[] columns = new String[] {
					"종류", "학생경력", "졸업요건", "달성여부"
			};
			
			int row = 0;
			int col = 0;
			
			Object[][] requireTable = new Object[8][4];
			
			JTable table = new JTable(requireTable, columns);
			
			table.getColumn("종류").setPreferredWidth(150);
			table.getColumn("학생경력").setPreferredWidth(400);
			table.getColumn("졸업요건").setPreferredWidth(400);
			
			JPanel requirePanel = new JPanel();
			requirePanel.setLayout(new BorderLayout());
			JScrollPane scroll = new JScrollPane(table);
			scroll.setPreferredSize(new Dimension(600,120));
			JLabel requireLabel = new JLabel("졸업 요건 달성도");
			requirePanel.add(requireLabel, BorderLayout.NORTH);
			requirePanel.add(scroll, BorderLayout.CENTER);
			
			requireTable[row][col++] = "언어 점수";
			for(Language_score i : std_career.getEng_grade()) {
				requireTable[row][col++] = i;
				requireTable[row][col++] = check.getLanguage_score();
				if(i.getType().equals(check.getLanguage_score().getType()) && i.getScore() >= check.getLanguage_score().getScore())
					requireTable[row][col++] = "OK";
				else
					requireTable[row][col++] = "NO";
				col = 1;
				row++;
			}
			
			col = 0;
			requireTable[row][col++] = "해외 교환 학생";
			for(Foriegn_exchange i : std_career.getExchange()) {
				requireTable[row][col++] = i;
				requireTable[row][col++] = check.getForiegn_exchange();
				if(i.getCredit() >= check.getForiegn_exchange().getCredit())
					requireTable[row][col++] = "OK";
				else
					requireTable[row][col++] = "NO";
				col = 1;
				row++;
			}
			
			col = 0;
			requireTable[row][col++] = "인턴";
			for(Intern i : std_career.getIntern()) {
				requireTable[row][col++] = i;
				requireTable[row][col++] = check.getIntern();
				if(i.getCredit() >= check.getIntern().getCredit())
					requireTable[row][col++] = "OK";
				else
					requireTable[row][col++] = "NO";
				col = 1;
				row++;
			}
			
			col = 0;
			requireTable[row][col++] = "상담횟수";
			requireTable[row][col++] = std_career.getCount_counseling();
			requireTable[row][col++] = check.getConsult_cnt();
			if(std_career.getCount_counseling() >= check.getConsult_cnt())
				requireTable[row][col] = "OK";
			else
				requireTable[row][col] = "NO";
			
			
			//필수과목 table
			String[] columns2 = new String[] {
					"과목코드","수강여부"
			};
			
			Object[][] subjectTable = new Object[15][2];
			
			JTable table2 = new JTable(subjectTable, columns2);
			JScrollPane scroll2 = new JScrollPane(table2);
			scroll2.setPreferredSize(new Dimension(300,120));
			
			JPanel requirePanel2 = new JPanel();
			requirePanel2.setLayout(new BorderLayout());
			JLabel subjectLabel2 = new JLabel("필수과목 수강여부");
			requirePanel2.add(subjectLabel2, BorderLayout.NORTH);
			requirePanel2.add(scroll2, BorderLayout.CENTER);
			
			row = 0; col = 0;
			for(Subject i : check.getEssential_subject()) {
				Integer ck = 0;
				subjectTable[row][col++] = i.getCode();
				for(Subject j : std_career.getSubject()) {
					if(i.getCode().equals(j.getCode())) {
						subjectTable[row][col] = "OK";
						ck = 1;
						break;
					}
				}
				if(ck != 1)
					subjectTable[row][col] = "NO";
				row++;
				col = 0;
			}			
			
			
			JPanel requirePanel3 = new JPanel();
			requirePanel3.setLayout(new BorderLayout());
			JLabel subjectLabel3 = new JLabel("이수과목");
			//수강정보
			String[] columns3 = new String[] {
					"성적", "과목코드", "과목", "교수"
			};			
			Object[][] infoTable = new Object[8][4];
			JTable info = new JTable(infoTable,columns3);
			info.getColumn("성적").setPreferredWidth(100);
			info.getColumn("과목코드").setPreferredWidth(150);
			info.getColumn("과목").setPreferredWidth(200);
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
			
			trk_p.setLocation(20, 15);
			trk_p.setSize(600, 30);
			trk_p.setBackground(Color.WHITE);
			
			requirePanel.setLocation(20, 45);
			requirePanel.setSize(600, 150);
			requirePanel.setBackground(Color.WHITE);
			
			requirePanel2.setLocation(20, 210);
			requirePanel2.setSize(600, 150);
			requirePanel2.setBackground(Color.WHITE);
			
			requirePanel3.setLocation(20, 370);
			requirePanel3.setSize(600, 150);
			requirePanel3.setBackground(Color.WHITE);

			contentPane.add(trk_p);
			contentPane.add(requirePanel);
			contentPane.add(requirePanel2);
			contentPane.add(requirePanel3);
			
			setSize(650, 600);
			setVisible(true); // 화면에 프레임 출력
		}
	
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Graduation_requirement();
	}
*/

}

