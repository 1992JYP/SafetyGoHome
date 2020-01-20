package pr.Oracle.sgh.GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import muti_network.MultiClient;
import pr.Oracle.sgh.model.MemberDAO;
import pr.Oracle.sgh.model.MemberDTO;
import pr.Oracle.sgh.test.GUITest;
import javax.swing.JPanel;
import java.awt.Cursor;

public class GUI_Main_New extends JFrame {

	private JTextField txtfd_id = null;
	private JTextField txtfd_pw = null;
	public static MemberDAO dao = new MemberDAO();
	public static MemberDTO user = null;

	public GUI_Main_New() {

		setTitle("프로그램");
		setSize(GUITest.SCREEN_WIDTH, GUITest.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 472, 657);
		getContentPane().add(panel);
		panel.setLayout(null);

		JButton btn_lookforidpw = new JButton("");
		btn_lookforidpw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			      JFrame.setDefaultLookAndFeelDecorated(true);
			      MultiClient cc = new MultiClient();
			      try {
					cc.init();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btn_lookforidpw.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_lookforidpw.setBorderPainted(false);
		btn_lookforidpw.setBorder(null);
		btn_lookforidpw.setBounds(116, 542, 243, 35);
		panel.add(btn_lookforidpw);
		btn_lookforidpw.setMnemonic(KeyEvent.VK_ENTER);
		btn_lookforidpw.setContentAreaFilled(false);

		JButton btn_join = new JButton("");
		btn_join.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_join.setOpaque(false);
		btn_join.setFocusPainted(false);
		btn_join.setBorderPainted(false);
		btn_join.setBorder(null);
		btn_join.setBounds(238, 471, 143, 43);
		panel.add(btn_join);
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				new GUI_SignUp();
				dispose();

			}
		});
		btn_join.setContentAreaFilled(false);
		btn_join.setIcon(new ImageIcon("C:\\\uB85C\uADF8\uC778\\\uB85C\uADF8\uC778\uCC3D.png"));

		JButton btn_login = new JButton("");
		btn_login.setFocusPainted(false);
		btn_login.setBorder(null);
		btn_login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_login.setBounds(92, 471, 143, 43);
		panel.add(btn_login);
		btn_login.setContentAreaFilled(false);
		btn_login.setBorderPainted(false);
		btn_login.setOpaque(false);
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				user = dao.Login(txtfd_id.getText(), txtfd_pw.getText());
				if (user != null) {
					JOptionPane.showMessageDialog(null, user.getName() + "님 환영합니다.  (^v^)bb");
					if (user.getType() == 1) {
						dispose();
						new GUI_User_standBy();
					} else if (user.getType() == 2) {
						dispose();
						new GUI_Watcher_standBy();
					} else if (user.getType() == 3) {
						dispose();
						new GUI_Scout_standBy();
					}
				} else {
					JOptionPane.showMessageDialog(null, "로그인 실패", "로그인 실패", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btn_login.setBackground(new Color(255, 255, 255));
		btn_login.setIcon(new ImageIcon("C:\\\uB85C\uADF8\uC778\\\uCCB4\uD06C\uBC15\uC2A4.png"));

		txtfd_id = new JTextField();
		txtfd_id.setBounds(127, 240, 270, 52);
		txtfd_id.setBorder(null);
		txtfd_id.setOpaque(false);
		panel.add(txtfd_id);
		txtfd_id.setColumns(10);

		txtfd_pw = new JTextField();
		txtfd_pw.setBounds(127, 331, 270, 52);
		txtfd_pw.setBorder(null);
		txtfd_pw.setOpaque(false);
		panel.add(txtfd_pw);
		txtfd_pw.setColumns(10);

		JLabel lbl_login = new JLabel("");
		lbl_login.setBounds(0, 0, 472, 657);
		panel.add(lbl_login);
		lbl_login.setIcon(new ImageIcon("C:\\\uB85C\uADF8\uC778\\\uB85C\uADF8\uC778\uBC30\uACBD.png"));
	}
}