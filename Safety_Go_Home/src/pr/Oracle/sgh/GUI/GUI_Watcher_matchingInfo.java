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

public class GUI_Watcher_matchingInfo extends JFrame {
	public GUI_Watcher_matchingInfo() {
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
		
		JLabel lbl_accompany = new JLabel("\uAD00\uCC30\uD560 \uCE5C\uAD6C\uB4E4");
		lbl_accompany.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_accompany.setForeground(new Color(72, 61, 139));
		lbl_accompany.setFont(new Font("경기천년제목 Bold", Font.BOLD, 50));
		lbl_accompany.setBounds(25, 43, 391, 79);
		panel_1.add(lbl_accompany);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(50, 134, 338, 399);
		panel_1.add(panel_2);
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(new Color(255, 222, 173));
		panel_3.setBounds(27, 38, 96, 94);
		panel_2.add(panel_3);
		
		Panel panel_4 = new Panel();
		panel_4.setBackground(new Color(255, 222, 173));
		panel_4.setBounds(27, 162, 96, 94);
		panel_2.add(panel_4);
		
		JLabel label_1 = new JLabel("\uC774\uC6A9\uC790");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		label_1.setBounds(27, 12, 96, 18);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("\uCCAB\uBC88\uC9F8 \uB3D9\uD589\uCC9C\uC0AC");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		label_2.setBounds(27, 138, 96, 18);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("\uACC4\uAE09\uB098\uC624\uAE30");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		label_3.setBounds(159, 56, 96, 18);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("\uACC4\uAE09\uB098\uC624\uAE30");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		label_4.setBounds(159, 177, 96, 18);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("\uB3C4\uCC29\uAE4C\uC9C0 \uBA87 \uBD84 \uAC78\uB9BD\uB2C8\uB2E4.");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		label_5.setBounds(145, 98, 165, 18);
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("\uB3C4\uCC29\uAE4C\uC9C0 \uBA87 \uBD84 \uAC78\uB9BD\uB2C8\uB2E4.");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		label_6.setBounds(145, 218, 165, 18);
		panel_2.add(label_6);
		
		Panel panel_5 = new Panel();
		panel_5.setBounds(27, 286, 96, 94);
		panel_2.add(panel_5);
		panel_5.setBackground(new Color(255, 222, 173));
		
		JLabel lbl_watcher = new JLabel("\uB450\uBC88\uC9F8 \uB3D9\uD589\uCC9C\uC0AC");
		lbl_watcher.setBounds(27, 262, 96, 18);
		panel_2.add(lbl_watcher);
		lbl_watcher.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_watcher.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		
		JLabel label = new JLabel("\uACC4\uAE09\uB098\uC624\uAE30");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		label.setBounds(159, 303, 96, 18);
		panel_2.add(label);
		
		JLabel label_7 = new JLabel("\uB3C4\uCC29\uAE4C\uC9C0 \uBA87 \uBD84 \uAC78\uB9BD\uB2C8\uB2E4.");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		label_7.setBounds(145, 339, 165, 18);
		panel_2.add(label_7);
		
		JButton btn_danger = new JButton("\uC2E0\uACE0\uD558\uAE30");
		btn_danger.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_danger.setBackground(new Color(123, 104, 238));
		btn_danger.setBounds(231, 572, 85, 34);
		panel_1.add(btn_danger);
		
		JButton button_1 = new JButton("\uC5F0\uB77D\uD558\uAE30");
		button_1.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		button_1.setBackground(new Color(123, 104, 238));
		button_1.setBounds(106, 572, 90, 34);
		panel_1.add(button_1);
	}

}
