package pr.Oracle.sgh.GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import pr.Oracle.sgh.test.GUITest;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

@SuppressWarnings("unused")
public class GUI_Frame_DEFEULT extends JFrame {
	
	
	public GUI_Frame_DEFEULT() {
		
		
		setBounds(100, 100, GUITest.SCREEN_WIDTH,GUITest.SCREEN_HEIGHT);
		setTitle("프로그램");
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
		
		JLabel label = new JLabel("\uC5EC\uC131\uD589\uBCF5\uADC0\uAC13\uAE38");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(72, 61, 139));
		label.setFont(new Font("Dialog", Font.BOLD, 50));
		label.setBounds(26, 144, 391, 79);
		panel_1.add(label);
	}
}
