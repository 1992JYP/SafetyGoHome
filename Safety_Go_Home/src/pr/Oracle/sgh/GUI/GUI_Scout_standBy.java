package pr.Oracle.sgh.GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import pr.Oracle.sgh.test.GUITest;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Scout_standBy extends JFrame {
	
	public GUI_Scout_standBy() {
		setBounds(100, 100, GUITest.SCREEN_WIDTH,GUITest.SCREEN_HEIGHT);
		setTitle("프로그램");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(25, 25, 112));
		panel.setBounds(0, 0, 472, 657);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(14, 14, 444, 630);
		panel.add(panel_1);
		
		JLabel lbl = new JLabel("\uB300\uAE30\uD654\uBA74");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setForeground(new Color(72, 61, 139));
		lbl.setFont(new Font("경기천년제목 Bold", Font.BOLD, 50));
		lbl.setBounds(25, 116, 391, 79);
		panel_1.add(lbl);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(52, 207, 338, 142);
		panel_1.add(panel_4);
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(new Color(255, 222, 173));
		panel_3.setBounds(27, 36, 96, 94);
		panel_4.add(panel_3);
		
		JLabel lbl_scout_name = new JLabel("\uC2A4\uCE74\uC6B0\uD2B8 \uC774\uB984");
		lbl_scout_name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_scout_name.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_scout_name.setBounds(27, 12, 96, 18);
		panel_4.add(lbl_scout_name);
		
		JLabel lbl_grade = new JLabel("\uACC4\uAE09\uB098\uC624\uAE30");
		lbl_grade.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_grade.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_grade.setBounds(198, 36, 96, 18);
		panel_4.add(lbl_grade);
		
		JLabel lbl_scout = new JLabel("\uBD09\uC0AC\uD69F\uC218");
		lbl_scout.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_scout.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_scout.setBounds(157, 66, 96, 18);
		panel_4.add(lbl_scout);
		
		JLabel lbl_scout_count = new JLabel("#\uD68C");
		lbl_scout_count.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_scout_count.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_scout_count.setBounds(245, 66, 63, 18);
		panel_4.add(lbl_scout_count);
		
		JLabel lbl_scout_star = new JLabel("\uD3C9\uC810");
		lbl_scout_star.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_scout_star.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_scout_star.setBounds(157, 96, 96, 18);
		panel_4.add(lbl_scout_star);
		
		JLabel lbl_scout_star_score = new JLabel("@.@\uC810");
		lbl_scout_star_score.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_scout_star_score.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_scout_star_score.setBounds(245, 96, 63, 18);
		panel_4.add(lbl_scout_star_score);
		
		JButton btn_Info = new JButton("\uC815\uBCF4\uC218\uC815");
		btn_Info.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		btn_Info.setBounds(257, 0, 81, 27);
		panel_4.add(btn_Info);
		
		JButton btn_standby = new JButton("\uC2A4\uCE74\uC6B0\uD2B8 \uB300\uAE30\uC2DC\uC791");
		btn_standby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_standby.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_standby.setBackground(new Color(123, 104, 238));
		btn_standby.setBounds(136, 444, 175, 34);
		panel_1.add(btn_standby);
		
		JButton btn_end_service = new JButton("\uC2A4\uCE74\uC6B0\uD2B8 \uC885\uB8CC");
		btn_end_service.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_end_service.setBackground(new Color(123, 104, 238));
		btn_end_service.setBounds(136, 504, 175, 34);
		panel_1.add(btn_end_service);
		
		JButton btn_type_change = new JButton("\uC0AC\uC6A9\uD0C0\uC785 \uBCC0\uACBD");
		btn_type_change.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_type_change.setBackground(new Color(123, 104, 238));
		btn_type_change.setBounds(136, 385, 175, 34);
		panel_1.add(btn_type_change);
		
		JButton btn_review_page = new JButton("\uB9AC\uBDF0 \uD398\uC774\uC9C0");
		btn_review_page.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_review_page.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_review_page.setBackground(new Color(123, 104, 238));
		btn_review_page.setBounds(136, 563, 175, 34);
		panel_1.add(btn_review_page);
	}
}
