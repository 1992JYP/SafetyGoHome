package pr.Oracle.sgh.GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import java.awt.Panel;

public class GUI_Watcher_Status extends JFrame {
	public GUI_Watcher_Status() {
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
		
		JLabel lbl_accompany = new JLabel("\uAD00\uCC30\uD558\uB294 \uC911...");
		lbl_accompany.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_accompany.setForeground(new Color(72, 61, 139));
		lbl_accompany.setFont(new Font("경기천년제목 Bold", Font.BOLD, 50));
		lbl_accompany.setBounds(25, 43, 391, 79);
		panel_1.add(lbl_accompany);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(50, 154, 338, 266);
		panel_1.add(panel_2);
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(new Color(255, 222, 173));
		panel_3.setBounds(189, 36, 96, 94);
		panel_2.add(panel_3);
		
		Panel panel_4 = new Panel();
		panel_4.setBackground(new Color(255, 222, 173));
		panel_4.setBounds(189, 162, 96, 94);
		panel_2.add(panel_4);
		
		JLabel lblNewLabel = new JLabel("\uCCAB\uBC88\uC9F8 \uB3D9\uD589\uCC9C\uC0AC");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lblNewLabel.setBounds(147, 12, 96, 18);
		panel_2.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\uB450\uBC88\uC9F8 \uB3D9\uD589\uCC9C\uC0AC");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		label_1.setBounds(147, 138, 96, 18);
		panel_2.add(label_1);
		
		JLabel label_3 = new JLabel("\uACC4\uAE09\uB098\uC624\uAE30");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		label_3.setBounds(228, 12, 96, 18);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("\uACC4\uAE09\uB098\uC624\uAE30");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		label_4.setBounds(228, 138, 96, 18);
		panel_2.add(label_4);
		
		Panel panel_6 = new Panel();
		panel_6.setBackground(new Color(255, 222, 173));
		panel_6.setBounds(33, 99, 96, 94);
		panel_2.add(panel_6);
		
		JLabel label = new JLabel("\uC774\uC6A9\uC790");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		label.setBounds(54, 76, 52, 18);
		panel_2.add(label);
		
		Panel panel_5 = new Panel();
		panel_5.setBackground(new Color(255, 222, 173));
		panel_5.setBounds(83, 456, 96, 94);
		panel_1.add(panel_5);
		
		JLabel lbl_watcher = new JLabel("\uAD00\uCC30\uC694\uC6D0");
		lbl_watcher.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_watcher.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_watcher.setBounds(105, 432, 52, 18);
		panel_1.add(lbl_watcher);
		
		JLabel lbl_watching_start = new JLabel("\uAD00\uCC30\uC911....");
		lbl_watching_start.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_watching_start.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_watching_start.setBounds(192, 495, 165, 18);
		panel_1.add(lbl_watching_start);
		
		JButton btn_match_finish = new JButton("\uC5F0\uB77D\uD558\uAE30!");
		btn_match_finish.setBounds(98, 572, 96, 34);
		panel_1.add(btn_match_finish);
		btn_match_finish.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_match_finish.setBackground(new Color(123, 104, 238));
		
		JButton btn_danger = new JButton("\uC2E0\uACE0\uD558\uAE30");
		btn_danger.setBounds(234, 572, 85, 34);
		panel_1.add(btn_danger);
		btn_danger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_danger.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_danger.setBackground(new Color(123, 104, 238));
		
		JLabel label_6 = new JLabel("\uB3C4\uCC29\uC9C0\uAE4C\uC9C0 \uBA87 \uBD84 \uAC78\uB9BD\uB2C8\uB2E4.");
		label_6.setBounds(204, 465, 165, 18);
		panel_1.add(label_6);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
	}
}
