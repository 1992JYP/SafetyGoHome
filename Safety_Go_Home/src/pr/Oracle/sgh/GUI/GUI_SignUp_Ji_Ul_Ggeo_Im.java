package pr.Oracle.sgh.GUI;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class GUI_SignUp_Ji_Ul_Ggeo_Im extends JFrame {
	private JTextField textField_id;
	private JTextField txtfd_pw;
	private JTextField txtfd_pw2;
	private JTextField txtfd_name;
	private JTextField txtfd_rgst_num1;
	private JTextField txtfd_rgst_num2;
	private JLabel lbl_pw1;
	private JLabel lbl_pw2;
	private JLabel lbl_name;
	private JLabel lbl_rgst_num;
	private JTextField txtfd_;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btn_register;
	private JButton btn_cancel;
	private JLabel label;
	public GUI_SignUp_Ji_Ul_Ggeo_Im() {
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		
		JPanel backgrd_2 = new JPanel();
		backgrd_2.setLayout(null);
		backgrd_2.setBackground(new Color(25, 25, 112));
		backgrd_2.setBounds(14, 12, 472, 657);
		getContentPane().add(backgrd_2);
		
		JPanel backgrd_3 = new JPanel();
		backgrd_3.setLayout(null);
		backgrd_3.setBackground(Color.WHITE);
		backgrd_3.setBounds(14, 12, 442, 633);
		backgrd_2.add(backgrd_3);
		
		JLabel label_4 = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(new Color(72, 61, 139));
		label_4.setFont(new Font("경기천년제목 Bold", Font.BOLD, 50));
		label_4.setBounds(46, 60, 350, 79);
		backgrd_3.add(label_4);
		
		txtfd_ = new JTextField();
		txtfd_.setBounds(159, 360, 202, 24);
		backgrd_3.add(txtfd_);
		txtfd_.setColumns(10);
		
		JButton btn_doublecheck = new JButton("\uC911\uBCF5\uD655\uC778");
		btn_doublecheck.setBounds(289, 144, 89, 27);
		backgrd_3.add(btn_doublecheck);
		btn_doublecheck.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		
		textField_id = new JTextField();
		textField_id.setBounds(159, 145, 116, 24);
		backgrd_3.add(textField_id);
		textField_id.setColumns(10);
		
		txtfd_pw = new JTextField();
		txtfd_pw.setBounds(159, 181, 116, 24);
		backgrd_3.add(txtfd_pw);
		txtfd_pw.setColumns(10);
		
		txtfd_pw2 = new JTextField();
		txtfd_pw2.setBounds(159, 217, 116, 24);
		backgrd_3.add(txtfd_pw2);
		txtfd_pw2.setColumns(10);
		
		txtfd_name = new JTextField();
		txtfd_name.setBounds(159, 252, 116, 24);
		backgrd_3.add(txtfd_name);
		txtfd_name.setColumns(10);
		
		txtfd_rgst_num2 = new JTextField();
		txtfd_rgst_num2.setBounds(265, 288, 96, 24);
		backgrd_3.add(txtfd_rgst_num2);
		txtfd_rgst_num2.setColumns(10);
		
		JLabel label_1 = new JLabel("-");
		label_1.setBounds(251, 291, 8, 18);
		backgrd_3.add(label_1);
		
		txtfd_rgst_num1 = new JTextField();
		txtfd_rgst_num1.setBounds(159, 288, 89, 24);
		backgrd_3.add(txtfd_rgst_num1);
		txtfd_rgst_num1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(305, 324, 59, 24);
		backgrd_3.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_3 = new JLabel("-");
		label_3.setBounds(294, 327, 8, 18);
		backgrd_3.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(232, 324, 59, 24);
		backgrd_3.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("-");
		label_2.setBounds(221, 327, 8, 18);
		backgrd_3.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(159, 324, 59, 24);
		backgrd_3.add(textField);
		textField.setColumns(10);
		
		JLabel lbl_id = new JLabel("아이디 :");
		lbl_id.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_id.setBounds(83, 148, 62, 18);
		backgrd_3.add(lbl_id);
		lbl_id.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		
		lbl_pw1 = new JLabel("\uBE44\uBC00\uBC88\uD638 :");
		lbl_pw1.setBounds(56, 184, 89, 18);
		backgrd_3.add(lbl_pw1);
		lbl_pw1.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_pw1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lbl_pw2 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778 :");
		lbl_pw2.setBounds(46, 220, 99, 18);
		backgrd_3.add(lbl_pw2);
		lbl_pw2.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_pw2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lbl_name = new JLabel("\uC774\uB984 :");
		lbl_name.setBounds(83, 255, 62, 18);
		backgrd_3.add(lbl_name);
		lbl_name.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_name.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lbl_rgst_num = new JLabel("\uC8FC\uBBFC\uB4F1\uB85D\uBC88\uD638 :");
		lbl_rgst_num.setBounds(42, 291, 103, 18);
		backgrd_3.add(lbl_rgst_num);
		lbl_rgst_num.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_rgst_num.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lbl_phoneNum = new JLabel("\uC5F0\uB77D\uCC98 :");
		lbl_phoneNum.setBounds(83, 327, 62, 18);
		backgrd_3.add(lbl_phoneNum);
		lbl_phoneNum.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_phoneNum.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lbl_ = new JLabel("\uC8FC\uC18C :");
		lbl_.setBounds(83, 363, 62, 18);
		backgrd_3.add(lbl_);
		lbl_.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_.setHorizontalAlignment(SwingConstants.RIGHT);
		
		btn_register = new JButton("\uAC00\uC785\uD558\uAE30");
		btn_register.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_register.setBounds(115, 557, 89, 27);
		backgrd_3.add(btn_register);
		
		btn_cancel = new JButton("\uCDE8\uC18C");
		btn_cancel.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_cancel.setBounds(232, 557, 89, 27);
		backgrd_3.add(btn_cancel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\uC774\uC6A9\uC57D\uAD00 \uBC0F \uAC1C\uC778\uC815\uBCF4 \uC81C\uACF5\uC5D0 \uB3D9\uC758\uD569\uB2C8\uB2E4.");
		chckbxNewCheckBox.setFont(new Font("\uACBD\uAE30\uCC9C\uB144\uC81C\uBAA9 Light", chckbxNewCheckBox.getFont().getStyle(), chckbxNewCheckBox.getFont().getSize()));
		chckbxNewCheckBox.setBounds(83, 421, 263, 27);
		backgrd_3.add(chckbxNewCheckBox);
		
		label = new JLabel("\uC774\uC6A9\uC790");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(72, 61, 139));
		label.setFont(new Font("경기천년제목 Bold", Font.BOLD, 25));
		label.setBounds(159, 26, 116, 50);
		backgrd_3.add(label);
	}
}
