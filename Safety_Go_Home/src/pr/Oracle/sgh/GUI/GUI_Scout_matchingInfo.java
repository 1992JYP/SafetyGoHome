package pr.Oracle.sgh.GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Panel;
import javax.swing.JButton;

public class GUI_Scout_matchingInfo extends JFrame {
	public GUI_Scout_matchingInfo() {
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
		
		JLabel lbl_accompany = new JLabel("\uB3D9\uD589\uD560 \uCE5C\uAD6C\uB4E4");
		lbl_accompany.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_accompany.setForeground(new Color(72, 61, 139));
		lbl_accompany.setFont(new Font("경기천년제목 Bold", Font.BOLD, 50));
		lbl_accompany.setBounds(25, 43, 391, 79);
		panel_1.add(lbl_accompany);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(50, 134, 338, 287);
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
		
		JLabel label_2 = new JLabel("\uD568\uAED8\uD560 \uB3D9\uD589\uCC9C\uC0AC");
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
		
		JButton btn_danger = new JButton("\uC2E0\uACE0\uD558\uAE30");
		btn_danger.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_danger.setBackground(new Color(123, 104, 238));
		btn_danger.setBounds(284, 572, 85, 34);
		panel_1.add(btn_danger);
		
		Panel panel_5 = new Panel();
		panel_5.setBackground(new Color(255, 222, 173));
		panel_5.setBounds(76, 453, 96, 94);
		panel_1.add(panel_5);
		
		JLabel lbl_watcher = new JLabel("\uAD00\uCC30\uC694\uC6D0");
		lbl_watcher.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_watcher.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_watcher.setBounds(98, 433, 52, 18);
		panel_1.add(lbl_watcher);
		
		JLabel lbl_watching_start = new JLabel("\uAD00\uCC30 \uB300\uAE30\uC911\uC785\uB2C8\uB2E4.");
		lbl_watching_start.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_watching_start.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_watching_start.setBounds(192, 495, 165, 18);
		panel_1.add(lbl_watching_start);
		
		JButton button = new JButton("\uB9CC\uB0AC\uC5B4\uC694!");
		button.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		button.setBackground(new Color(123, 104, 238));
		button.setBounds(64, 572, 96, 34);
		panel_1.add(button);
		
		JButton button_1 = new JButton("\uC5F0\uB77D\uD558\uAE30");
		button_1.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		button_1.setBackground(new Color(123, 104, 238));
		button_1.setBounds(174, 572, 96, 34);
		panel_1.add(button_1);
	}

}
