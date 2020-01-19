package pr.Oracle.sgh.GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Panel;
import java.awt.Choice;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;
import javax.swing.JToolBar;
import java.awt.Label;
import javax.swing.JFormattedTextField;

public class GUI_Watcher_Upgrade_to_scout extends JFrame {
	public GUI_Watcher_Upgrade_to_scout() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(25, 25, 112));
		panel.setBounds(14, 12, 472, 657);
		getContentPane().add(panel);
		
		JPanel pnl_upgrade = new JPanel();
		pnl_upgrade.setLayout(null);
		pnl_upgrade.setBackground(Color.WHITE);
		pnl_upgrade.setBounds(14, 12, 442, 633);
		panel.add(pnl_upgrade);
		
		JLabel label = new JLabel("\uBD09\uC0AC\uC790 \uB4F1\uAE09 \uC2E0\uCCAD");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(72, 61, 139));
		label.setFont(new Font("경기천년제목 Bold", Font.BOLD, 50));
		label.setBounds(26, 62, 391, 79);
		pnl_upgrade.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(54, 164, 338, 142);
		pnl_upgrade.add(panel_2);
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(new Color(255, 222, 173));
		panel_3.setBounds(27, 36, 96, 94);
		panel_2.add(panel_3);
		
		JLabel lbl_watcher = new JLabel("\uD574\uB2F9 \uC694\uC6D0");
		lbl_watcher.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_watcher.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_watcher.setBounds(27, 12, 96, 18);
		panel_2.add(lbl_watcher);
		
		JLabel lbl_watching = new JLabel("\uAC10\uC2DC\uD69F\uC218");
		lbl_watching.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_watching.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_watching.setBounds(157, 50, 96, 18);
		panel_2.add(lbl_watching);
		
		JLabel lbl_watching_count = new JLabel("#\uD68C");
		lbl_watching_count.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_watching_count.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_watching_count.setBounds(245, 50, 63, 18);
		panel_2.add(lbl_watching_count);
		
		JLabel lbl_star = new JLabel("\uD3C9\uC810");
		lbl_star.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_star.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_star.setBounds(157, 80, 96, 18);
		panel_2.add(lbl_star);
		
		JLabel lbl_star_score = new JLabel("@.@\uC810");
		lbl_star_score.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_star_score.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_star_score.setBounds(245, 80, 63, 18);
		panel_2.add(lbl_star_score);
		
		JButton btn_upgrade = new JButton("\uC2E0\uCCAD");
		btn_upgrade.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_upgrade.setBackground(new Color(123, 104, 238));
		btn_upgrade.setBounds(119, 575, 85, 34);
		pnl_upgrade.add(btn_upgrade);
		
		JButton btn_cancel = new JButton("\uCDE8\uC18C");
		btn_cancel.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_cancel.setBackground(new Color(123, 104, 238));
		btn_cancel.setBounds(234, 575, 85, 34);
		pnl_upgrade.add(btn_cancel);
		
		JLabel label_4 = new JLabel("\uBD09\uC0AC\uC790\uB85C \uB4F1\uAE09\uC744 \uC62C\uB9AC\uAE30 \uC704\uD574\uC11C\uB294 \uBC94\uC8C4\uACBD\uB825\uC5EC\uBD80\uB97C \uC99D\uBA85\uD574\uC8FC\uC138\uC694.");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		label_4.setBounds(52, 351, 354, 18);
		pnl_upgrade.add(label_4);
		
		JPanel pnl_upload_file = new JPanel();
		pnl_upload_file.setBounds(54, 420, 75, 26);
		pnl_upgrade.add(pnl_upload_file);
		
		JLabel label_7 = new JLabel("\uD30C\uC77C \uC120\uD0DD");
		pnl_upload_file.add(label_7);
		label_7.setBackground(Color.LIGHT_GRAY);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		
		JFormattedTextField upload_file_category = new JFormattedTextField();
		upload_file_category.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		upload_file_category.setText("\uC5C5\uB85C\uB4DC\uC2DC \uD30C\uC77C\uACBD\uB85C \uB728\uAE30");
		upload_file_category.setBounds(131, 420, 199, 26);
		pnl_upgrade.add(upload_file_category);
		
		JButton btn_search_upload_file = new JButton("\uCC3E\uAE30");
		btn_search_upload_file.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		btn_search_upload_file.setBounds(331, 420, 61, 26);
		pnl_upgrade.add(btn_search_upload_file);
		
		JLabel lbl_apply_for1 = new JLabel("\uC0C1\uD669\uC5D0 \uB530\uB77C \uB4F1\uAE09 \uC0C1\uD5A5\uAE4C\uC9C0 2~3\uC77C\uC774 \uAC78\uB9B4 \uC218 \uC788\uC2B5\uB2C8\uB2E4.");
		lbl_apply_for1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_apply_for1.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_apply_for1.setBounds(54, 492, 338, 18);
		pnl_upgrade.add(lbl_apply_for1);
		
		JLabel lbl_apply_for2 = new JLabel("\uC2E0\uCCAD\uD558\uC2DC\uACA0\uC2B5\uB2C8\uAE4C?");
		lbl_apply_for2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_apply_for2.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_apply_for2.setBounds(97, 532, 251, 18);
		pnl_upgrade.add(lbl_apply_for2);
	}
}
