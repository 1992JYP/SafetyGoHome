package pr.Oracle.sgh.GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.TextArea;

public class GUI_User_Review_select extends JFrame {
	public GUI_User_Review_select() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(25, 25, 112));
		panel.setBounds(14, 12, 472, 657);
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(14, 12, 442, 633);
		panel.add(panel_1);
		
		JLabel lbl_accompany = new JLabel("\uB3D9\uD589\uD55C \uCC9C\uC0AC\uB4E4");
		lbl_accompany.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_accompany.setForeground(new Color(72, 61, 139));
		lbl_accompany.setFont(new Font("경기천년제목 Bold", Font.BOLD, 50));
		lbl_accompany.setBounds(25, 43, 391, 79);
		panel_1.add(lbl_accompany);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(50, 134, 338, 401);
		panel_1.add(panel_2);
		
		Panel pnl_scout1 = new Panel();
		pnl_scout1.setBackground(new Color(255, 222, 173));
		pnl_scout1.setBounds(27, 38, 96, 94);
		panel_2.add(pnl_scout1);
		
		Panel pnl_scout2 = new Panel();
		pnl_scout2.setBackground(new Color(255, 222, 173));
		pnl_scout2.setBounds(27, 162, 96, 94);
		panel_2.add(pnl_scout2);
		
		Panel pnl_watcher = new Panel();
		pnl_watcher.setBounds(27, 283, 96, 94);
		panel_2.add(pnl_watcher);
		pnl_watcher.setBackground(new Color(255, 222, 173));
		
		JLabel lbl_scout1 = new JLabel("\uCCAB\uBC88\uC9F8 \uB3D9\uD589\uCC9C\uC0AC");
		lbl_scout1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_scout1.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_scout1.setBounds(27, 12, 96, 18);
		panel_2.add(lbl_scout1);
		
		JLabel lbl_scout2 = new JLabel("\uB450\uBC88\uC9F8 \uB3D9\uD589\uCC9C\uC0AC");
		lbl_scout2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_scout2.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_scout2.setBounds(27, 138, 96, 18);
		panel_2.add(lbl_scout2);
		
		JLabel lbl_watcher = new JLabel("\uAD00\uCC30\uC694\uC6D0");
		lbl_watcher.setBounds(48, 262, 52, 18);
		panel_2.add(lbl_watcher);
		lbl_watcher.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_watcher.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		
		JLabel lbl_grade_scout1 = new JLabel("\uACC4\uAE09\uB098\uC624\uAE30");
		lbl_grade_scout1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_grade_scout1.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_grade_scout1.setBounds(159, 12, 96, 18);
		panel_2.add(lbl_grade_scout1);
		
		JLabel lbl_grade_scout2 = new JLabel("\uACC4\uAE09\uB098\uC624\uAE30");
		lbl_grade_scout2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_grade_scout2.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_grade_scout2.setBounds(159, 138, 96, 18);
		panel_2.add(lbl_grade_scout2);
		
		JLabel lbl_grade_watcher = new JLabel("\uACC4\uAE09\uB098\uC624\uAE30");
		lbl_grade_watcher.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_grade_watcher.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_grade_watcher.setBounds(159, 262, 96, 18);
		panel_2.add(lbl_grade_watcher);
		
		JButton btn_review_scout1 = new JButton("\uD6C4\uAE30\uB4F1\uB85D");
		btn_review_scout1.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_review_scout1.setBackground(new Color(123, 104, 238));
		btn_review_scout1.setBounds(187, 68, 85, 34);
		panel_2.add(btn_review_scout1);
		
		JButton btn_review_scout2 = new JButton("\uD6C4\uAE30\uB4F1\uB85D");
		btn_review_scout2.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_review_scout2.setBackground(new Color(123, 104, 238));
		btn_review_scout2.setBounds(187, 187, 85, 34);
		panel_2.add(btn_review_scout2);
		
		JButton btn_review_watcher = new JButton("\uD6C4\uAE30\uB4F1\uB85D");
		btn_review_watcher.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_review_watcher.setBackground(new Color(123, 104, 238));
		btn_review_watcher.setBounds(187, 319, 85, 34);
		panel_2.add(btn_review_watcher);
		
		JButton btn_danger = new JButton("\uC2E0\uACE0\uD558\uAE30");
		btn_danger.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_danger.setBackground(new Color(123, 104, 238));
		btn_danger.setBounds(168, 570, 85, 34);
		panel_1.add(btn_danger);
	}
}
