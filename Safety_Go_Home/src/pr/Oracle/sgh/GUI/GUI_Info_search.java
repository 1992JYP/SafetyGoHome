package pr.Oracle.sgh.GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Info_search extends JFrame {
	private JTextField txtfd_rgst_num;
	private JTextField txtfd_name;
	private JTextField txtfd_phoneNum;
	private JTextField txtfd_id;
	public GUI_Info_search() {
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
		
		JLabel label = new JLabel("\uD68C\uC6D0\uC815\uBCF4\uCC3E\uAE30");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(72, 61, 139));
		label.setFont(new Font("경기천년제목 Bold", Font.BOLD, 50));
		label.setBounds(24, 68, 391, 79);
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(49, 182, 340, 402);
		panel_1.add(panel_2);
		
		JRadioButton radioButton = new JRadioButton("\uC774\uC6A9\uC790");
		radioButton.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		radioButton.setBackground(new Color(176, 224, 230));
		radioButton.setBounds(95, 23, 73, 28);
		panel_2.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\uBD09\uC0AC\uC790");
		radioButton_1.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		radioButton_1.setBackground(new Color(176, 224, 230));
		radioButton_1.setBounds(187, 23, 73, 28);
		panel_2.add(radioButton_1);
		
		txtfd_name = new JTextField();
		txtfd_name.setColumns(10);
		txtfd_name.setBounds(95, 88, 183, 24);
		panel_2.add(txtfd_name);
		
		JLabel lbl_name = new JLabel("\uC774\uB984 :");
		lbl_name.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_name.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_name.setBounds(24, 91, 62, 18);
		panel_2.add(lbl_name);
		
		txtfd_rgst_num = new JTextField();
		txtfd_rgst_num.setColumns(10);
		txtfd_rgst_num.setBounds(95, 124, 183, 24);
		panel_2.add(txtfd_rgst_num);
		
		JLabel lbl_rgst_num = new JLabel("\uC8FC\uBBFC\uB4F1\uB85D\uBC88\uD638 :");
		lbl_rgst_num.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_rgst_num.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_rgst_num.setBounds(0, 127, 86, 18);
		panel_2.add(lbl_rgst_num);
		
		JButton btn_search_id = new JButton("\uC544\uC774\uB514 \uCC3E\uAE30");
		btn_search_id.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		btn_search_id.setBounds(95, 166, 183, 29);
		panel_2.add(btn_search_id);
		
		txtfd_id = new JTextField();
		txtfd_id.setColumns(10);
		txtfd_id.setBounds(95, 254, 183, 24);
		panel_2.add(txtfd_id);
		
		JLabel lbl_id = new JLabel("\uC544\uC774\uB514 :");
		lbl_id.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_id.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_id.setBounds(24, 257, 62, 18);
		panel_2.add(lbl_id);
		
		txtfd_phoneNum = new JTextField();
		txtfd_phoneNum.setColumns(10);
		txtfd_phoneNum.setBounds(95, 289, 183, 24);
		panel_2.add(txtfd_phoneNum);
		
		JLabel lbl_phoneNum = new JLabel("\uC5F0\uB77D\uCC98 :");
		lbl_phoneNum.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_phoneNum.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_phoneNum.setBounds(0, 292, 86, 18);
		panel_2.add(lbl_phoneNum);
		
		JButton btn_search_pw = new JButton("\uBE44\uBC00\uBC88\uD638 \uCC3E\uAE30");
		btn_search_pw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_search_pw.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		btn_search_pw.setBounds(95, 332, 183, 29);
		panel_2.add(btn_search_pw);
	}

}
