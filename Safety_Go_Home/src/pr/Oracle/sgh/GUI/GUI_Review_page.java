package pr.Oracle.sgh.GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import pr.Oracle.sgh.test.GUITest;

import java.awt.Panel;
import javax.swing.JButton;
import java.awt.TextArea;
import java.awt.Choice;

public class GUI_Review_page extends JFrame {
	public GUI_Review_page() {
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
		
		JLabel lbl_review = new JLabel("\uB3D9\uD589 \uD6C4\uAE30");
		lbl_review.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_review.setForeground(new Color(72, 61, 139));
		lbl_review.setFont(new Font("경기천년제목 Bold", Font.BOLD, 50));
		lbl_review.setBounds(25, 43, 391, 79);
		panel_1.add(lbl_review);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(50, 134, 338, 142);
		panel_1.add(panel_2);
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(new Color(255, 222, 173));
		panel_3.setBounds(27, 36, 96, 94);
		panel_2.add(panel_3);
		
		JLabel lbl_target = new JLabel("\uD574\uB2F9 \uC694\uC6D0");
		lbl_target.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_target.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_target.setBounds(27, 12, 96, 18);
		panel_2.add(lbl_target);
		
		JLabel lbl_grade = new JLabel("\uACC4\uAE09\uB098\uC624\uAE30");
		lbl_grade.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_grade.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_grade.setBounds(157, 36, 96, 18);
		panel_2.add(lbl_grade);
		
		JLabel lbl_star_review = new JLabel("\uD3C9\uC810 \uB4F1\uB85D");
		lbl_star_review.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_star_review.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_star_review.setBounds(159, 66, 57, 18);
		panel_2.add(lbl_star_review);
		
		//String star_review[]= {"★★★★★","★★★★","★★★","★★","★"};
		Choice choice_star = new Choice();
		choice_star.setFont(null);
		choice_star.setBounds(157, 88, 151, 24);
		panel_2.add(choice_star);

		
		
		// 콤보박스 (메뉴)
		//CBmenu = new JComboBox(CBmenu_1); 
		//CBmenu.setPreferredSize(new Dimension(150,20)); // 콤보박스 사이즈 조절 Dimension(넓이,높이)
		//customerPn.add(CBmenu);
		
		
		
		
		
		JButton btn_write = new JButton("\uB4F1\uB85D");
		btn_write.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_write.setBackground(new Color(123, 104, 238));
		btn_write.setBounds(109, 572, 85, 34);
		panel_1.add(btn_write);
		
		JButton btn_cancel = new JButton("\uCDE8\uC18C");
		btn_cancel.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_cancel.setBackground(new Color(123, 104, 238));
		btn_cancel.setBounds(234, 572, 85, 34);
		panel_1.add(btn_cancel);
		
		TextArea textArea_review = new TextArea();
		textArea_review.setBounds(50, 293, 338, 239);
		panel_1.add(textArea_review);
	}

}
