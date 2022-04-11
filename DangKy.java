import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import java.awt.Panel;
import java.awt.SystemColor;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DangKy extends JFrame  {

	private JPanel contentPane;
	private JTextField txtFullname;
	private JTextField txtusername;
	private JTextField txtpwd;
	private JTextField txtemail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangKy frame = new DangKy();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DangKy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTER");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(189, 11, 473, 51);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblfullname = new JLabel("FullName:");
		lblfullname.setBounds(189, 94, 239, 31);
		lblfullname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblfullname.setToolTipText("Full Name\r\n");
		lblfullname.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblfullname);
		
		txtFullname = new JTextField();
		txtFullname.setBounds(347, 94, 287, 25);
		contentPane.add(txtFullname);
		txtFullname.setColumns(10);
		
		JLabel lblusername = new JLabel("UserName:");
		lblusername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblusername.setHorizontalAlignment(SwingConstants.CENTER);
		lblusername.setBounds(257, 136, 96, 25);
		contentPane.add(lblusername);
		
		txtusername = new JTextField();
		txtusername.setBounds(347, 136, 287, 24);
		contentPane.add(txtusername);
		txtusername.setColumns(10);
		
		JLabel lblpassword = new JLabel("PassWord:");
		lblpassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblpassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblpassword.setBounds(267, 172, 75, 25);
		contentPane.add(lblpassword);
		
		txtpwd = new JTextField();
		txtpwd.setBounds(347, 172, 287, 25);
		contentPane.add(txtpwd);
		txtpwd.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("EMail:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(277, 208, 65, 25);
		contentPane.add(lblNewLabel_4);
		
		txtemail = new JTextField();
		txtemail.setBounds(347, 208, 287, 24);
		contentPane.add(txtemail);
		txtemail.setColumns(10);
		
		JButton btndangky = new JButton("\u0110\u0103ng K\u00FD");
		
		btndangky.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event. ActionEvent e) {
				String fullname=txtFullname.getText();
				String username=txtusername.getText();
				String password=txtpwd.getText();
				String email=txtemail.getText();
				StringBuilder sb=new StringBuilder();
				if(fullname.equalsIgnoreCase(""))
				{
					sb.append("Try again");
					
					
				}
				else if(username.equalsIgnoreCase(""))
				{
				sb.append("Try again");	
				
				}
				else if(password.equalsIgnoreCase(""))
				{
					sb.append("Try again");
				}
				else if(email.equalsIgnoreCase(""))
				{
					sb.append("Try again");
				}
				if(sb.length()>0)
				{
					JOptionPane.showMessageDialog(null,"Vui long nhap lai","Thong Bao",JOptionPane.ERROR_MESSAGE);
					return;
				}
			  JOptionPane.showMessageDialog(null, "Dang Ky Thanh Cong","Thong Bao",JOptionPane.DEFAULT_OPTION);
			}	
			
		});
		btndangky.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btndangky.setBounds(347, 259, 89, 37);
		contentPane.add(btndangky);
		
		JButton btnthoat = new JButton("Tho\u00E1t");
		btnthoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ex=JOptionPane.showConfirmDialog(null, "Do You Want To Exit?",null,JOptionPane.YES_NO_CANCEL_OPTION);
				if(ex==JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
				
			}
		});
		btnthoat.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnthoat.setBounds(508, 259, 89, 34);
		contentPane.add(btnthoat);
		
		JPanel panel = new JPanel();
		panel.setBounds(-1, -1, 255, 452);
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\abc.jpg"));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 7;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\tdl1.jpg"));
		lblNewLabel_1.setBounds(267, 11, 395, 429);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(337, 398, 46, 14);
		contentPane.add(lblNewLabel_2);
	}
}
