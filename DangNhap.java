

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JProgressBar;
public class DangNhap extends JFrame {

	private JPanel contentPane;
	private JTextField txtTaiKhoan;
	private JButton button;
	private JButton btnNewButton;
	private JPasswordField txtPassword;
	private JLabel label;
	private JLabel label_1;
	private JPanel panel_1;
	static Color backgroundColor = new Color(255, 255, 255);
	private JLabel lblNewLabel_3;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangNhap frame = new DangNhap();
					frame.setLocationRelativeTo(null); 
					frame.setTitle("Du lịch Tour");
					frame.getContentPane().setBackground(backgroundColor);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public DangNhap() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		setSize(700, 450);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{120, 100};
		gbl_contentPane.rowHeights = new int[]{0, 100};
		gbl_contentPane.columnWeights = new double[]{1.2, 1.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0};
		contentPane.setLayout(gbl_contentPane);
		ImageIcon icon = new ImageIcon("C:\\Users\\user\\Downloads\\dulich5.png");
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		
		JButton btnNewButton_1 = new JButton("  X  ");
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(backgroundColor);

		btnNewButton_1.setBorder(null);
		btnNewButton_1.setFocusable(false);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 0;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(13, 225, 195));
		panel_1.setLayout(null);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 2;
		gbc_panel_1.insets = new Insets(0, 0, 0, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		contentPane.add(panel_1, gbc_panel_1);
		
		JLabelAmination lblNewLabel_1 = new JLabelAmination();
		lblNewLabel_1.setBounds(64, 124, 224, 201);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(scaledIcon);
		
		JLabel lblNewLabel_2 = new JLabel("Liên hệ: 0999999999");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_2.setBounds(258, 415, 95, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Bản quyền thuộc nhóm chúng tôi!");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_2_1.setBounds(10, 415, 158, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(backgroundColor);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(20, 0, 20, 20);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);
		
		
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{100};
		gbl_panel.rowHeights = new int[]{100, 50, 70, 50, 70, 70, 70};
		gbl_panel.columnWeights = new double[]{1.0};
		gbl_panel.rowWeights = new double[]{1.0, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Đăng nhập");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 22));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(10, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		label = new JLabel("Tài khoản:");
		label.setFont(new Font("Serif", Font.BOLD, 14));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 30, 5, 0);
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		panel.add(label, gbc_label);
		
		txtTaiKhoan = new TextFielAmination();
		txtTaiKhoan.setText("");
		txtTaiKhoan.setFont(new Font("Serif", Font.PLAIN, 14));
		GridBagConstraints gbc_txtTaiKhoan = new GridBagConstraints();
		gbc_txtTaiKhoan.fill = GridBagConstraints.BOTH;
		gbc_txtTaiKhoan.insets = new Insets(10, 30, 10, 30);
		gbc_txtTaiKhoan.gridx = 0;
		gbc_txtTaiKhoan.gridy = 2;
		panel.add(txtTaiKhoan, gbc_txtTaiKhoan);
		
		label_1 = new JLabel("Mật khẩu:");
		label_1.setFont(new Font("Serif", Font.BOLD, 14));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.WEST;
		gbc_label_1.insets = new Insets(0, 30, 5, 0);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 3;
		panel.add(label_1, gbc_label_1);
		
		txtPassword = new PassWordFielAmination();
		GridBagConstraints gbc_txtPassword = new GridBagConstraints();
		gbc_txtPassword.insets = new Insets(10, 30, 10, 30);
		gbc_txtPassword.fill = GridBagConstraints.BOTH;
		gbc_txtPassword.gridx = 0;
		gbc_txtPassword.gridy = 4;
		panel.add(txtPassword, gbc_txtPassword);
		
		ButtonAmination btnDangNhap =  new ButtonAmination();
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tendangnhap=txtTaiKhoan.getText();
				String pass=txtPassword.getText();
				StringBuilder sb=new StringBuilder();
				if(tendangnhap.equalsIgnoreCase(""))
				{
					sb.append("Try again, please");
				}
				if(pass.equalsIgnoreCase(""))
				{
					sb.append("Try again, please");
				}
				if(sb.length()>0)
				{
					JOptionPane.showMessageDialog(null,"Mù à Nhập cho đủ chứ", "Thông Báo",JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(tendangnhap!="AAAA"&&pass!="1234")
				{
				JOptionPane.showMessageDialog(null,"Đăng Nhập Thành Công", "Thông Báo",JOptionPane.DEFAULT_OPTION);
				new FormLoading().setVisible(true);
				}
				else 
				{
					JOptionPane.showMessageDialog(null,"Sai CMNR", "Thông Báo",JOptionPane.ERROR_MESSAGE);
					txtTaiKhoan.setText("");
					txtPassword.setText("");					
				}
			
			}
		});
		btnDangNhap.setText("Đăng nhập");
		GridBagConstraints gbc_btnDangNhap = new GridBagConstraints();
		gbc_btnDangNhap.fill = GridBagConstraints.BOTH;
		gbc_btnDangNhap.insets = new Insets(15, 18, 5, 18);
		gbc_btnDangNhap.gridx = 0;
		gbc_btnDangNhap.gridy = 5;
		panel.add(btnDangNhap, gbc_btnDangNhap);
		
		lblNewLabel_3 = new JLabel("Liên hệ: 0999999999");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 6;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
	}
}
