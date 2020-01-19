package pr.Oracle.sgh.GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.Choice;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;

public class GUI_Scout_Request_View extends JFrame {
	private JTextField txtfd_startSpot;
	private JTextField txtfd_goalSpot;
	public GUI_Scout_Request_View() {
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
		
		JLabel label = new JLabel("\uB3D9\uD589\uC694\uCCAD\uC11C");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(72, 61, 139));
		label.setFont(new Font("경기천년제목 Bold", Font.BOLD, 50));
		label.setBounds(32, 30, 379, 79);
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(53, 121, 340, 484);
		panel_1.add(panel_2);
		
		txtfd_startSpot = new JTextField();
		txtfd_startSpot.setColumns(10);
		txtfd_startSpot.setBounds(83, 27, 183, 24);
		panel_2.add(txtfd_startSpot);
		
		JLabel label_1 = new JLabel("\uCD9C\uBC1C\uC9C0 :");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		label_1.setBounds(14, 30, 62, 18);
		panel_2.add(label_1);
		
		txtfd_goalSpot = new JTextField();
		txtfd_goalSpot.setColumns(10);
		txtfd_goalSpot.setBounds(83, 72, 183, 24);
		panel_2.add(txtfd_goalSpot);
		
		JLabel label_3 = new JLabel("\uB3C4\uCC29\uC9C0 :");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		label_3.setBounds(14, 75, 62, 18);
		panel_2.add(label_3);
		
		Choice choice_accompany_time = new Choice();
		choice_accompany_time.setBounds(83, 116, 183, 24);
		panel_2.add(choice_accompany_time);
		
		JLabel lbl_accompany_time = new JLabel("\uB3D9\uD589\uC2DC\uAC04 :");
		lbl_accompany_time.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_accompany_time.setFont(new Font("경기천년제목 Light", Font.PLAIN, 15));
		lbl_accompany_time.setBounds(14, 116, 62, 18);
		panel_2.add(lbl_accompany_time);
		
		JPanel pnl_map1 = new JPanel();
		pnl_map1.setBackground(new Color(255, 222, 173));
		pnl_map1.setBounds(14, 155, 142, 276);
		panel_2.add(pnl_map1);
		
		JPanel pnl_map2 = new JPanel();
		pnl_map2.setBackground(new Color(255, 222, 173));
		pnl_map2.setBounds(184, 155, 142, 276);
		panel_2.add(pnl_map2);
		
		JButton btn_matching = new JButton("\uC694\uCCAD \uC218\uB77D");
		btn_matching.setFont(new Font("경기천년제목 Light", Font.BOLD, 15));
		btn_matching.setBounds(83, 443, 183, 29);
		panel_2.add(btn_matching);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
