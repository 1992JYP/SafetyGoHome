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

public class GUI_User_Select_Request extends JFrame {
	public GUI_User_Select_Request() {
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
		
		JLabel label = new JLabel("\uB9E4\uCE6D \uC2E0\uCCAD");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(72, 61, 139));
		label.setFont(new Font("경기천년제목 Bold", Font.BOLD, 50));
		label.setBounds(24, 50, 391, 79);
		panel_1.add(label);
		
		JPanel bgd = new JPanel();
		bgd.setBounds(54, 160, 338, 424);
		panel_1.add(bgd);
		bgd.setLayout(null);
		
		JButton btn_watcher = new JButton("\uAC10\uC2DC\uC790");
		btn_watcher.setBackground(new Color(123, 104, 238));
		btn_watcher.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 30));
		btn_watcher.setBounds(49, 62, 240, 121);
		bgd.add(btn_watcher);
		
		JButton btn_scout_watcher = new JButton("\uBD09\uC0AC\uC790 \uC640 \uAC10\uC2DC\uC790");
		btn_scout_watcher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_scout_watcher.setForeground(new Color(0, 0, 0));
		btn_scout_watcher.setBackground(new Color(123, 104, 238));
		btn_scout_watcher.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 30));
		btn_scout_watcher.setBounds(49, 238, 240, 121);
		bgd.add(btn_scout_watcher);
	}

}
