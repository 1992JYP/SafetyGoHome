package pr.Oracle.sgh.GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import pr.Oracle.sgh.test.GUITest;

import java.awt.Font;
import javax.swing.SpringLayout;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Main extends JFrame {
	

	
	
	
	private JTextField txtfd_id;
	private JTextField txtfd_pw;
	public GUI_Main() {
		
		setTitle("프로그램");
		setSize(GUITest.SCREEN_WIDTH,GUITest.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(25, 25, 112));
		panel.setBounds(0, 0, 472, 657);
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(14, 14, 444, 630);
		panel.add(panel_1);
		
		JLabel label = new JLabel("\uB2EC\uBE5B\uCC9C\uC0AC");
		label.setForeground(new Color(72, 61, 139));
		label.setBounds(28, 156, 380, 79);
		panel_1.add(label);
		label.setFont(new Font("경기천년제목 Bold", Font.BOLD, 50));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(49, 264, 340, 216);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_login.setBounds(95, 125, 86, 29);
		panel_2.add(btn_login);
		btn_login.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		
		txtfd_id = new JTextField();
		txtfd_id.setBounds(95, 59, 183, 24);
		panel_2.add(txtfd_id);
		txtfd_id.setColumns(10);
		
		JLabel lbl_id = new JLabel("\uC544\uC774\uB514 :");
		lbl_id.setBounds(24, 61, 62, 18);
		panel_2.add(lbl_id);
		lbl_id.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_id.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		
		txtfd_pw = new JTextField();
		txtfd_pw.setBounds(95, 91, 183, 24);
		panel_2.add(txtfd_pw);
		txtfd_pw.setColumns(10);
		
		
		JButton btn_signUp = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_signUp.setBounds(187, 125, 91, 29);
		panel_2.add(btn_signUp);
		btn_signUp.setFont(new Font("\uACBD\uAE30\uCC9C\uB144\uC81C\uBAA9 Light", btn_signUp.getFont().getStyle(), btn_signUp.getFont().getSize()));
		
		JLabel lbl_pw = new JLabel("\uBE44\uBC00\uBC88\uD638 :");
		lbl_pw.setBounds(0, 93, 86, 18);
		panel_2.add(lbl_pw);
		lbl_pw.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pw.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		
		JRadioButton btn_user = new JRadioButton("\uC774\uC6A9\uC790");
		btn_user.setBounds(95, 23, 73, 28);
		panel_2.add(btn_user);
		btn_user.setBackground(new Color(176, 224, 230));
		btn_user.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		
		JRadioButton btn_admin = new JRadioButton("\uBD09\uC0AC\uC790");
		btn_admin.setBounds(187, 23, 73, 28);
		panel_2.add(btn_admin);
		btn_admin.setBackground(new Color(176, 224, 230));
		btn_admin.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		
		JButton btn_idpw_search = new JButton("\uC544\uC774\uB514/\uBE44\uBC00\uBC88\uD638 \uCC3E\uAE30");
		btn_idpw_search.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		btn_idpw_search.setBounds(95, 166, 183, 29);
		panel_2.add(btn_idpw_search);
	}
}
