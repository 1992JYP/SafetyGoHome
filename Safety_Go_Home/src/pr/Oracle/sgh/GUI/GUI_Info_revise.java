package pr.Oracle.sgh.GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class GUI_Info_revise extends JFrame {
	private JTextField txtfd_pw;
	private JTextField txtfd_double_ck_pw;
	private JTextField txtfd_phoneNum_third;
	private JTextField txtfd_phoneNum_second;
	private JTextField txtfd_phoneNum_first;
	public GUI_Info_revise() {
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
		
		JLabel lbl_signUp = new JLabel("\uD68C\uC6D0\uC815\uBCF4 \uC218\uC815");
		lbl_signUp.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_signUp.setForeground(new Color(72, 61, 139));
		lbl_signUp.setFont(new Font("경기천년제목 Bold", Font.BOLD, 50));
		lbl_signUp.setBounds(46, 60, 350, 79);
		panel_1.add(lbl_signUp);
		
		JLabel lbl_id = new JLabel("\uC544\uC774\uB514 :");
		lbl_id.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_id.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_id.setBounds(83, 148, 62, 18);
		panel_1.add(lbl_id);
		
		JLabel lbl_text_id = new JLabel("\uC544\uC774\uB514\uB0B4\uC6A9");
		lbl_text_id.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_text_id.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_text_id.setBounds(159, 148, 62, 18);
		panel_1.add(lbl_text_id);
		
		JLabel lbl_pw = new JLabel("\uBE44\uBC00\uBC88\uD638 :");
		lbl_pw.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pw.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_pw.setBounds(56, 184, 89, 18);
		panel_1.add(lbl_pw);
		
		txtfd_pw = new JTextField();
		txtfd_pw.setColumns(10);
		txtfd_pw.setBounds(159, 181, 116, 24);
		panel_1.add(txtfd_pw);
		
		JLabel lbl_double_ck_pw = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778 :");
		lbl_double_ck_pw.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_double_ck_pw.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_double_ck_pw.setBounds(46, 220, 99, 18);
		panel_1.add(lbl_double_ck_pw);
		
		txtfd_double_ck_pw = new JTextField();
		txtfd_double_ck_pw.setColumns(10);
		txtfd_double_ck_pw.setBounds(159, 217, 116, 24);
		panel_1.add(txtfd_double_ck_pw);
		
		JLabel lbl_name = new JLabel("\uC774\uB984 :");
		lbl_name.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_name.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_name.setBounds(83, 255, 62, 18);
		panel_1.add(lbl_name);
		
		JLabel lbl_txt_name = new JLabel("\uC774\uB984\uC801\uD798");
		lbl_txt_name.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_txt_name.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_txt_name.setBounds(159, 255, 62, 18);
		panel_1.add(lbl_txt_name);
		
		JLabel lbl_registerNum = new JLabel("\uC8FC\uBBFC\uB4F1\uB85D\uBC88\uD638 :");
		lbl_registerNum.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_registerNum.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_registerNum.setBounds(42, 291, 103, 18);
		panel_1.add(lbl_registerNum);
		
		JLabel lbl_regsterNum1 = new JLabel("910900");
		lbl_regsterNum1.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_regsterNum1.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_regsterNum1.setBounds(159, 291, 62, 18);
		panel_1.add(lbl_regsterNum1);
		
		JLabel lbl_hyphen_registerNum = new JLabel("-");
		lbl_hyphen_registerNum.setBounds(235, 291, 8, 18);
		panel_1.add(lbl_hyphen_registerNum);
		
		JLabel lbl_registerNum2 = new JLabel("2555555");
		lbl_registerNum2.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_registerNum2.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_registerNum2.setBounds(257, 291, 62, 18);
		panel_1.add(lbl_registerNum2);
		
		JLabel lbl_phoneNum = new JLabel("\uC5F0\uB77D\uCC98 :");
		lbl_phoneNum.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_phoneNum.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_phoneNum.setBounds(83, 327, 62, 18);
		panel_1.add(lbl_phoneNum);
		
		txtfd_phoneNum_first = new JTextField();
		txtfd_phoneNum_first.setColumns(10);
		txtfd_phoneNum_first.setBounds(159, 324, 53, 24);
		panel_1.add(txtfd_phoneNum_first);
		
		JLabel lbl_hyphen1_phone = new JLabel("-");
		lbl_hyphen1_phone.setBounds(214, 327, 14, 18);
		panel_1.add(lbl_hyphen1_phone);
		
		txtfd_phoneNum_second = new JTextField();
		txtfd_phoneNum_second.setColumns(10);
		txtfd_phoneNum_second.setBounds(226, 324, 59, 24);
		panel_1.add(txtfd_phoneNum_second);
		
		JLabel lbl_hyphen2_phone = new JLabel("-");
		lbl_hyphen2_phone.setBounds(287, 327, 8, 18);
		panel_1.add(lbl_hyphen2_phone);
		
		txtfd_phoneNum_third = new JTextField();
		txtfd_phoneNum_third.setColumns(10);
		txtfd_phoneNum_third.setBounds(298, 324, 59, 24);
		panel_1.add(txtfd_phoneNum_third);
		
		JLabel lbl_gender = new JLabel("\uC131\uBCC4 :");
		lbl_gender.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_gender.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_gender.setBounds(83, 363, 62, 18);
		panel_1.add(lbl_gender);
		
		JLabel label_2 = new JLabel("\uC131\uBCC4\uACE0\uC815");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		label_2.setBounds(159, 363, 62, 18);
		panel_1.add(label_2);
		
		JLabel lbl_type = new JLabel("\uAC00\uC785\uC720\uD615 :");
		lbl_type.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_type.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_type.setBounds(83, 398, 62, 18);
		panel_1.add(lbl_type);
		
		JLabel lbl_txt_type = new JLabel("\uC774\uC6A9\uC790\uAC10\uC2DC");
		lbl_txt_type.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_txt_type.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_txt_type.setBounds(159, 398, 62, 18);
		panel_1.add(lbl_txt_type);
		
		JButton btn_type_revise = new JButton("\uAC00\uC785\uC720\uD615 \uBCC0\uACBD\uC2E0\uCCAD");
		btn_type_revise.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_type_revise.setBounds(115, 502, 209, 27);
		panel_1.add(btn_type_revise);
		
		JButton btn_signUp = new JButton("\uC218\uC815");
		btn_signUp.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_signUp.setBounds(115, 557, 89, 27);
		panel_1.add(btn_signUp);
		
		JButton btn_cancel = new JButton("\uCDE8\uC18C");
		btn_cancel.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_cancel.setBounds(232, 557, 89, 27);
		panel_1.add(btn_cancel);
		
		JButton btn_withdraw = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
		btn_withdraw.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_withdraw.setBounds(339, 21, 89, 27);
		panel_1.add(btn_withdraw);
	}
}
