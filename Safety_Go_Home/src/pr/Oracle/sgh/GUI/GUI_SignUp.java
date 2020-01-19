package pr.Oracle.sgh.GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import pr.Oracle.sgh.model.MemberDAO;
import pr.Oracle.sgh.test.GUITest;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_SignUp extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtfd_id;
	private JTextField txtfd_pw;
	private JTextField txtfd_double_ck_pw;
	private JTextField txtfd_name;
	private JTextField txtfd_registerNum_second;
	private JTextField txtfd_registerNum_first;
	private JTextField txtfd_phoneNum_third;
	private JTextField txtfd_phoneNum_second;
	private JTextField txtfd_phoneNum_first;
	private MemberDAO dao = new MemberDAO();
	private boolean nameCheck = false;
	private boolean idCheck = false;
	public GUI_SignUp() {		
		
		
		setTitle("프로그램");
		setSize(GUITest.SCREEN_WIDTH, GUITest.SCREEN_HEIGHT);
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

		JLabel lbl_signUp = new JLabel("\uD68C\uC6D0\uAC00\uC785");
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

		JButton btn_double_ck_id = new JButton("\uC911\uBCF5\uD655\uC778");
		btn_double_ck_id.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(dao.checkId(txtfd_id.getText()));
			}
		});
		btn_double_ck_id.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_double_ck_id.setBounds(289, 144, 89, 27);
		panel_1.add(btn_double_ck_id);

		txtfd_id = new JTextField();
		txtfd_id.setColumns(10);
		txtfd_id.setBounds(159, 145, 116, 24);
		panel_1.add(txtfd_id);

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

		txtfd_name = new JTextField();
		txtfd_name.setColumns(10);
		txtfd_name.setBounds(159, 252, 116, 24);
		panel_1.add(txtfd_name);

		JLabel lbl_registerNum = new JLabel("\uC8FC\uBBFC\uB4F1\uB85D\uBC88\uD638 :");
		lbl_registerNum.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_registerNum.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_registerNum.setBounds(42, 291, 103, 18);
		panel_1.add(lbl_registerNum);

		txtfd_registerNum_first = new JTextField();
		txtfd_registerNum_first.setColumns(10);
		txtfd_registerNum_first.setBounds(159, 288, 72, 24);
		panel_1.add(txtfd_registerNum_first);

		JLabel lbl_hyphen_registerNum = new JLabel("-");
		lbl_hyphen_registerNum.setBounds(235, 291, 8, 18);
		panel_1.add(lbl_hyphen_registerNum);

		txtfd_registerNum_second = new JTextField();
		txtfd_registerNum_second.setColumns(10);
		txtfd_registerNum_second.setBounds(248, 288, 82, 24);
		panel_1.add(txtfd_registerNum_second);

		JButton btn_ck_registerNum = new JButton("\uC2E4\uBA85\uD655\uC778");
		btn_ck_registerNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_ck_registerNum.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_ck_registerNum.setBounds(339, 287, 89, 27);
		panel_1.add(btn_ck_registerNum);

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

		JRadioButton radioBtn_Female = new JRadioButton("\uC5EC\uC790");
		radioBtn_Female.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		radioBtn_Female.setBackground(new Color(176, 224, 230));
		radioBtn_Female.setBounds(159, 358, 73, 28);
		panel_1.add(radioBtn_Female);

		JRadioButton radioBtn_Male = new JRadioButton("\uB0A8\uC790");
		radioBtn_Male.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		radioBtn_Male.setBackground(new Color(176, 224, 230));
		radioBtn_Male.setBounds(251, 358, 73, 28);
		panel_1.add(radioBtn_Male);

		JLabel lbl_type = new JLabel("\uAC00\uC785\uC720\uD615 :");
		lbl_type.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_type.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_type.setBounds(83, 398, 62, 18);
		panel_1.add(lbl_type);

		JRadioButton radioBtn_user = new JRadioButton("\uC774\uC6A9\uC790");
		radioBtn_user.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		radioBtn_user.setBackground(new Color(176, 224, 230));
		radioBtn_user.setBounds(159, 393, 73, 28);
		panel_1.add(radioBtn_user);

		JRadioButton radioBtn_watcher = new JRadioButton("\uAC10\uC2DC\uC790");
		radioBtn_watcher.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		radioBtn_watcher.setBackground(new Color(176, 224, 230));
		radioBtn_watcher.setBounds(251, 393, 73, 28);
		panel_1.add(radioBtn_watcher);

		JCheckBox checkBox = new JCheckBox(
				"\uC774\uC6A9\uC57D\uAD00 \uBC0F \uAC1C\uC778\uC815\uBCF4 \uC81C\uACF5\uC5D0 \uB3D9\uC758\uD569\uB2C8\uB2E4.");
		checkBox.setFont(new Font("\uACBD\uAE30\uCC9C\uB144\uC81C\uBAA9 Light", checkBox.getFont().getStyle(),
				checkBox.getFont().getSize()));
		checkBox.setHorizontalAlignment(SwingConstants.LEFT);
		checkBox.setBounds(94, 449, 263, 27);
		panel_1.add(checkBox);

		JButton btn_signUp = new JButton("\uAC00\uC785\uD558\uAE30");
		btn_signUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender = null;
				int type = 0;
				if(radioBtn_Female.isEnabled()) {
					gender ="F";
				}
				else {
					gender="M";
				}
				if(radioBtn_user.isEnabled()) {
					type =1;
				}
				else {
					type =2;
				}
				if(1==dao.join(txtfd_id.getText(), txtfd_pw.getText(), txtfd_name.getText(),
						txtfd_registerNum_first.getText()+"-"+txtfd_registerNum_second.getText(),
						gender, txtfd_phoneNum_first.getText()+"-"+txtfd_phoneNum_second.getText()+"-"+txtfd_phoneNum_third.getText(), type)) {
					JOptionPane.showMessageDialog(null,	txtfd_name.getText()+"님 환영합니다.  (^v^)bb");
				}else {
					JOptionPane.showMessageDialog(null, "회원가입 실패 (-ㄴ-)","회원가입",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btn_signUp.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_signUp.setBounds(115, 557, 89, 27);
		panel_1.add(btn_signUp);

		JButton btn_cancel = new JButton("\uCDE8\uC18C");
		btn_cancel.setFont(new Font("경기천년제목 Bold", Font.PLAIN, 15));
		btn_cancel.setBounds(232, 557, 89, 27);
		panel_1.add(btn_cancel);
	}
}
