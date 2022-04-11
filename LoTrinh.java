

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.*;
import javax.swing.JTable;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.GridLayout;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class LoTrinh extends JFrame  {
	private Color bg_menu = new Color(30, 101, 21);
	private Color bg_menu_item = new Color(41, 169, 78);
	static private JPanel temp = null;


	private JPanel contentPane;
	private JTextField IDLoTrinh;
	private JTextField NgayDi;
	private JTextField GioDi;
	private JTextField NgayVe;
	private JTextField DiemDi;
	private JTextField GioVe;
	private JTextField DiemDen;
	private JButton btnThem;
	private JButton btnXoaKh;
	private JButton btnSuaKH;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public LoTrinh()
	{
		initialize();
		Connect();
		table_load();
	}
	private Connection con=null;
	private static PreparedStatement pst;
	private static ResultSet rs;
	private JTable tableLoTrinh;
	private JTextField LT;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoTrinh frame = new LoTrinh();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void Connect()
	{
	
		try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				String conurl="jdbc:sqlserver://DESKTOP-UOLK6O3\\\\SQLEXPRESS01:1433;databaseName=DoAnTourDuLich;user=sa;password=sa";
			   con=DriverManager.getConnection(conurl);
			 
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				
			}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	

	}
	public void table_load()
	{
		try {
			pst=con.prepareStatement("select *from LoTrinh");
			rs=pst.executeQuery();
			tableLoTrinh.setModel(DbUtils.resultSetToTableModel(rs));
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	private void initialize() {
		
	
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Downloads\\Parasolb1.png"));
		setLocationByPlatform(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 952, 726);
		contentPane = new JPanel();
		contentPane.setBackground(Color.white);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0};
		gbl_contentPane.columnWeights = new double[]{0.1, 1.0};
		gbl_contentPane.rowWeights = new double[]{1.0};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(bg_menu);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0};
		gbl_panel.rowWeights = new double[]{1.2, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 1.5};
		panel.setLayout(gbl_panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(bg_menu);
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 0, 0);
		gbc_panel_2.gridheight = 2;
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 0;
		panel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0};
		gbl_panel_2.rowHeights = new int[]{0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0};
		gbl_panel_2.rowWeights = new double[]{1.0, 1.0};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblTieuDe = new JLabel("KĐT's Tourist");
		lblTieuDe.setForeground(Color.CYAN);
		lblTieuDe.setFont(new Font("Tahoma", Font.BOLD, 30));
		GridBagConstraints gbc_lblTieuDe = new GridBagConstraints();
		gbc_lblTieuDe.anchor = GridBagConstraints.WEST;
		gbc_lblTieuDe.insets = new Insets(10, 10, 0, 0);
		gbc_lblTieuDe.gridx = 0;
		gbc_lblTieuDe.gridy = 0;
		panel_2.add(lblTieuDe, gbc_lblTieuDe);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator.insets = new Insets(0, 40, 0, 0);
		gbc_separator.anchor = GridBagConstraints.NORTH;
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 1;
		panel_2.add(separator, gbc_separator);
		
		JPanel panel_Khachhang = new JPanel();
		panel_Khachhang.setBackground(bg_menu);
		GridBagConstraints gbc_panel_Khachhang = new GridBagConstraints();
		gbc_panel_Khachhang.insets = new Insets(0, 0, 0, 0);
		gbc_panel_Khachhang.fill = GridBagConstraints.BOTH;
		gbc_panel_Khachhang.gridx = 0;
		gbc_panel_Khachhang.gridy = 2;
		panel.add(panel_Khachhang, gbc_panel_Khachhang);
		GridBagLayout gbl_panel_Khachhang = new GridBagLayout();
		gbl_panel_Khachhang.columnWidths = new int[]{0, 0};
		gbl_panel_Khachhang.rowHeights = new int[]{0};
		gbl_panel_Khachhang.columnWeights = new double[]{0.5, 1.0};
		gbl_panel_Khachhang.rowWeights = new double[]{1.0};
		panel_Khachhang.setLayout(gbl_panel_Khachhang);
		
		JPanel panel_14 = new JPanel();
		GridBagConstraints gbc_panel_14 = new GridBagConstraints();
		gbc_panel_14.insets = new Insets(0, 10, 0, 0);
		gbc_panel_14.fill = GridBagConstraints.BOTH;
		gbc_panel_14.gridx = 0;
		gbc_panel_14.gridy = 0;
		panel_Khachhang.add(panel_14, gbc_panel_14);
		panel_14.setBackground(new Color(192, 192, 192));
		
		JLabel lblNewLabel = new JLabel("Khách hàng");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		panel_Khachhang.add(lblNewLabel, gbc_lblNewLabel);
		
		JPanel panel_NhanVien = new JPanel();
		panel_NhanVien.setBackground(bg_menu);
		GridBagConstraints gbc_panel_NhanVien = new GridBagConstraints();
		gbc_panel_NhanVien.insets = new Insets(0, 0, 0, 0);
		gbc_panel_NhanVien.fill = GridBagConstraints.BOTH;
		gbc_panel_NhanVien.gridx = 0;
		gbc_panel_NhanVien.gridy = 3;
		panel.add(panel_NhanVien, gbc_panel_NhanVien);
		GridBagLayout gbl_panel_NhanVien = new GridBagLayout();
		gbl_panel_NhanVien.columnWidths = new int[]{0, 0};
		gbl_panel_NhanVien.rowHeights = new int[]{0};
		gbl_panel_NhanVien.columnWeights = new double[]{0.5, 1.0};
		gbl_panel_NhanVien.rowWeights = new double[]{1.0};
		panel_NhanVien.setLayout(gbl_panel_NhanVien);
		
		JPanel panel_15 = new JPanel();
		GridBagConstraints gbc_panel_15 = new GridBagConstraints();
		gbc_panel_15.insets = new Insets(0, 10, 0, 5);
		gbc_panel_15.fill = GridBagConstraints.BOTH;
		gbc_panel_15.gridx = 0;
		gbc_panel_15.gridy = 0;
		panel_NhanVien.add(panel_15, gbc_panel_15);
		
		JLabel lblNewLabel_1 = new JLabel("Nhân viên");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 0;
		panel_NhanVien.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JPanel panel_Nguoidung = new JPanel();
		panel_Nguoidung.setBackground(bg_menu);
		GridBagConstraints gbc_panel_Nguoidung = new GridBagConstraints();
		gbc_panel_Nguoidung.insets = new Insets(0, 0, 0, 0);
		gbc_panel_Nguoidung.fill = GridBagConstraints.BOTH;
		gbc_panel_Nguoidung.gridx = 0;
		gbc_panel_Nguoidung.gridy = 4;
		panel.add(panel_Nguoidung, gbc_panel_Nguoidung);
		GridBagLayout gbl_panel_Nguoidung = new GridBagLayout();
		gbl_panel_Nguoidung.columnWidths = new int[]{0, 0};
		gbl_panel_Nguoidung.rowHeights = new int[]{0};
		gbl_panel_Nguoidung.columnWeights = new double[]{0.5, 1.0};
		gbl_panel_Nguoidung.rowWeights = new double[]{1.0};
		panel_Nguoidung.setLayout(gbl_panel_Nguoidung);
		
		JPanel panel_16 = new JPanel();
		GridBagConstraints gbc_panel_16 = new GridBagConstraints();
		gbc_panel_16.insets = new Insets(0, 10, 0, 5);
		gbc_panel_16.fill = GridBagConstraints.BOTH;
		gbc_panel_16.gridx = 0;
		gbc_panel_16.gridy = 0;
		panel_Nguoidung.add(panel_16, gbc_panel_16);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Người dùng");
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_2_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_2.gridx = 1;
		gbc_lblNewLabel_2_1_2.gridy = 0;
		panel_Nguoidung.add(lblNewLabel_2_1_2, gbc_lblNewLabel_2_1_2);
		
		JPanel panel_DichVu = new JPanel();
		panel_DichVu.setBackground(bg_menu);
		GridBagConstraints gbc_panel_DichVu = new GridBagConstraints();
		gbc_panel_DichVu.insets = new Insets(0, 0, 0, 0);
		gbc_panel_DichVu.fill = GridBagConstraints.BOTH;
		gbc_panel_DichVu.gridx = 0;
		gbc_panel_DichVu.gridy = 5;
		panel.add(panel_DichVu, gbc_panel_DichVu);
		GridBagLayout gbl_panel_DichVu = new GridBagLayout();
		gbl_panel_DichVu.columnWidths = new int[]{0, 0};
		gbl_panel_DichVu.rowHeights = new int[]{0};
		gbl_panel_DichVu.columnWeights = new double[]{0.5, 1.0};
		gbl_panel_DichVu.rowWeights = new double[]{1.0};
		panel_DichVu.setLayout(gbl_panel_DichVu);
		
		JPanel panel_16_1 = new JPanel();
		GridBagConstraints gbc_panel_16_1 = new GridBagConstraints();
		gbc_panel_16_1.insets = new Insets(0, 10, 0, 5);
		gbc_panel_16_1.fill = GridBagConstraints.BOTH;
		gbc_panel_16_1.gridx = 0;
		gbc_panel_16_1.gridy = 0;
		panel_DichVu.add(panel_16_1, gbc_panel_16_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Dịch vụ");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_2_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_1.gridx = 1;
		gbc_lblNewLabel_2_1_1.gridy = 0;
		panel_DichVu.add(lblNewLabel_2_1_1, gbc_lblNewLabel_2_1_1);
		
		JPanel panel_LoTrinh = new JPanel();
		panel_LoTrinh.setBackground(bg_menu);
		GridBagConstraints gbc_panel_LoTrinh = new GridBagConstraints();
		gbc_panel_LoTrinh.insets = new Insets(0, 0, 0, 0);
		gbc_panel_LoTrinh.fill = GridBagConstraints.BOTH;
		gbc_panel_LoTrinh.gridx = 0;
		gbc_panel_LoTrinh.gridy = 6;
		panel.add(panel_LoTrinh, gbc_panel_LoTrinh);
		GridBagLayout gbl_panel_LoTrinh = new GridBagLayout();
		gbl_panel_LoTrinh.columnWidths = new int[]{0, 0};
		gbl_panel_LoTrinh.rowHeights = new int[]{0};
		gbl_panel_LoTrinh.columnWeights = new double[]{0.5, 1.0};
		gbl_panel_LoTrinh.rowWeights = new double[]{1.0};
		panel_LoTrinh.setLayout(gbl_panel_LoTrinh);
		
		JPanel panel_16_2 = new JPanel();
		GridBagConstraints gbc_panel_16_2 = new GridBagConstraints();
		gbc_panel_16_2.insets = new Insets(0, 10, 0, 5);
		gbc_panel_16_2.fill = GridBagConstraints.BOTH;
		gbc_panel_16_2.gridx = 0;
		gbc_panel_16_2.gridy = 0;
		panel_LoTrinh.add(panel_16_2, gbc_panel_16_2);
		
		JLabel lblNewLabel_2 = new JLabel("Lộ trình");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 0;
		panel_LoTrinh.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JPanel panel_Ve = new JPanel();
		panel_Ve.setBackground(bg_menu);
		GridBagConstraints gbc_panel_Ve = new GridBagConstraints();
		gbc_panel_Ve.insets = new Insets(0, 0, 0, 0);
		gbc_panel_Ve.fill = GridBagConstraints.BOTH;
		gbc_panel_Ve.gridx = 0;
		gbc_panel_Ve.gridy = 7;
		panel.add(panel_Ve, gbc_panel_Ve);
		GridBagLayout gbl_panel_Ve = new GridBagLayout();
		gbl_panel_Ve.columnWidths = new int[]{0, 0};
		gbl_panel_Ve.rowHeights = new int[]{0};
		gbl_panel_Ve.columnWeights = new double[]{0.5, 1.0};
		gbl_panel_Ve.rowWeights = new double[]{1.0};
		panel_Ve.setLayout(gbl_panel_Ve);
		
		JPanel panel_16_3 = new JPanel();
		GridBagConstraints gbc_panel_16_3 = new GridBagConstraints();
		gbc_panel_16_3.insets = new Insets(0, 10, 0, 5);
		gbc_panel_16_3.fill = GridBagConstraints.BOTH;
		gbc_panel_16_3.gridx = 0;
		gbc_panel_16_3.gridy = 0;
		panel_Ve.add(panel_16_3, gbc_panel_16_3);
		
		JLabel lblNewLabel_2_2 = new JLabel("Vé");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_2_2 = new GridBagConstraints();
		gbc_lblNewLabel_2_2.gridx = 1;
		gbc_lblNewLabel_2_2.gridy = 0;
		panel_Ve.add(lblNewLabel_2_2, gbc_lblNewLabel_2_2);
		
		JPanel panel_DoanhThu = new JPanel();
		panel_DoanhThu.setBackground(bg_menu);
		GridBagConstraints gbc_panel_DoanhThu = new GridBagConstraints();
		gbc_panel_DoanhThu.insets = new Insets(0, 0, 0, 0);
		gbc_panel_DoanhThu.fill = GridBagConstraints.BOTH;
		gbc_panel_DoanhThu.gridx = 0;
		gbc_panel_DoanhThu.gridy = 8;
		panel.add(panel_DoanhThu, gbc_panel_DoanhThu);
		GridBagLayout gbl_panel_DoanhThu = new GridBagLayout();
		gbl_panel_DoanhThu.columnWidths = new int[]{0, 0};
		gbl_panel_DoanhThu.rowHeights = new int[]{0};
		gbl_panel_DoanhThu.columnWeights = new double[]{0.5, 1.0};
		gbl_panel_DoanhThu.rowWeights = new double[]{1.0};
		panel_DoanhThu.setLayout(gbl_panel_DoanhThu);
		
		JPanel panel_16_4 = new JPanel();
		GridBagConstraints gbc_panel_16_4 = new GridBagConstraints();
		gbc_panel_16_4.insets = new Insets(0, 10, 0, 5);
		gbc_panel_16_4.fill = GridBagConstraints.BOTH;
		gbc_panel_16_4.gridx = 0;
		gbc_panel_16_4.gridy = 0;
		panel_DoanhThu.add(panel_16_4, gbc_panel_16_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("Doanh thu");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1.gridx = 1;
		gbc_lblNewLabel_2_1.gridy = 0;
		panel_DoanhThu.add(lblNewLabel_2_1, gbc_lblNewLabel_2_1);
		
		JPanel panel_KhachSan = new JPanel();
		panel_KhachSan.setBackground(bg_menu);
		GridBagConstraints gbc_panel_KhachSan = new GridBagConstraints();
		gbc_panel_KhachSan.insets = new Insets(0, 0, 0, 0);
		gbc_panel_KhachSan.fill = GridBagConstraints.BOTH;
		gbc_panel_KhachSan.gridx = 0;
		gbc_panel_KhachSan.gridy = 9;
		panel.add(panel_KhachSan, gbc_panel_KhachSan);
		GridBagLayout gbl_panel_KhachSan = new GridBagLayout();
		gbl_panel_KhachSan.columnWidths = new int[]{0, 0};
		gbl_panel_KhachSan.rowHeights = new int[]{0};
		gbl_panel_KhachSan.columnWeights = new double[]{0.5, 1.0};
		gbl_panel_KhachSan.rowWeights = new double[]{1.0};
		panel_KhachSan.setLayout(gbl_panel_KhachSan);
		
		JPanel panel_16_5 = new JPanel();
		GridBagConstraints gbc_panel_16_5 = new GridBagConstraints();
		gbc_panel_16_5.insets = new Insets(0, 10, 0, 5);
		gbc_panel_16_5.fill = GridBagConstraints.BOTH;
		gbc_panel_16_5.gridx = 0;
		gbc_panel_16_5.gridy = 0;
		panel_KhachSan.add(panel_16_5, gbc_panel_16_5);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Khách sạn");
		lblNewLabel_2_1_3.setForeground(Color.WHITE);
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_2_1_3 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_3.gridx = 1;
		gbc_lblNewLabel_2_1_3.gridy = 0;
		panel_KhachSan.add(lblNewLabel_2_1_3, gbc_lblNewLabel_2_1_3);
		
		JPanel panel_NhaHang = new JPanel();
		panel_NhaHang.setBackground(bg_menu);
		GridBagConstraints gbc_panel_NhaHang = new GridBagConstraints();
		gbc_panel_NhaHang.insets = new Insets(0, 0, 0, 0);
		gbc_panel_NhaHang.fill = GridBagConstraints.BOTH;
		gbc_panel_NhaHang.gridx = 0;
		gbc_panel_NhaHang.gridy = 10;
		panel.add(panel_NhaHang, gbc_panel_NhaHang);
		GridBagLayout gbl_panel_NhaHang = new GridBagLayout();
		gbl_panel_NhaHang.columnWidths = new int[]{0, 0};
		gbl_panel_NhaHang.rowHeights = new int[]{0};
		gbl_panel_NhaHang.columnWeights = new double[]{0.5, 1.0};
		gbl_panel_NhaHang.rowWeights = new double[]{1.0};
		panel_NhaHang.setLayout(gbl_panel_NhaHang);
		
		JPanel panel_16_6 = new JPanel();
		GridBagConstraints gbc_panel_16_6 = new GridBagConstraints();
		gbc_panel_16_6.insets = new Insets(0, 10, 0, 5);
		gbc_panel_16_6.fill = GridBagConstraints.BOTH;
		gbc_panel_16_6.gridx = 0;
		gbc_panel_16_6.gridy = 0;
		panel_NhaHang.add(panel_16_6, gbc_panel_16_6);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Nhà hàng");
		lblNewLabel_2_1_4.setForeground(Color.WHITE);
		lblNewLabel_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_2_1_4 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_4.gridx = 1;
		gbc_lblNewLabel_2_1_4.gridy = 0;
		panel_NhaHang.add(lblNewLabel_2_1_4, gbc_lblNewLabel_2_1_4);
		
		JPanel panel_NhacungCap = new JPanel();
		panel_NhacungCap.setBackground(bg_menu);
		GridBagConstraints gbc_panel_NhacungCap = new GridBagConstraints();
		gbc_panel_NhacungCap.insets = new Insets(0, 0, 0, 0);
		gbc_panel_NhacungCap.fill = GridBagConstraints.BOTH;
		gbc_panel_NhacungCap.gridx = 0;
		gbc_panel_NhacungCap.gridy = 11;
		panel.add(panel_NhacungCap, gbc_panel_NhacungCap);
		GridBagLayout gbl_panel_NhacungCap = new GridBagLayout();
		gbl_panel_NhacungCap.columnWidths = new int[]{0, 0};
		gbl_panel_NhacungCap.rowHeights = new int[]{0};
		gbl_panel_NhacungCap.columnWeights = new double[]{0.5, 1.0};
		gbl_panel_NhacungCap.rowWeights = new double[]{1.0};
		panel_NhacungCap.setLayout(gbl_panel_NhacungCap);
		
		JPanel panel_16_7 = new JPanel();
		GridBagConstraints gbc_panel_16_7 = new GridBagConstraints();
		gbc_panel_16_7.insets = new Insets(0, 10, 0, 5);
		gbc_panel_16_7.fill = GridBagConstraints.BOTH;
		gbc_panel_16_7.gridx = 0;
		gbc_panel_16_7.gridy = 0;
		panel_NhacungCap.add(panel_16_7, gbc_panel_16_7);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Nhà cung cấp");
		lblNewLabel_2_1_5.setForeground(Color.WHITE);
		lblNewLabel_2_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_2_1_5 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_5.gridx = 1;
		gbc_lblNewLabel_2_1_5.gridy = 0;
		panel_NhacungCap.add(lblNewLabel_2_1_5, gbc_lblNewLabel_2_1_5);
		
		JPanel panel_Thoat = new JPanel();
		panel_Thoat.setBackground(bg_menu);
		GridBagConstraints gbc_panel_Thoat = new GridBagConstraints();
		gbc_panel_Thoat.insets = new Insets(0, 0, 0, 0);
		gbc_panel_Thoat.fill = GridBagConstraints.BOTH;
		gbc_panel_Thoat.gridx = 0;
		gbc_panel_Thoat.gridy = 12;
		panel.add(panel_Thoat, gbc_panel_Thoat);
		GridBagLayout gbl_panel_Thoat = new GridBagLayout();
		gbl_panel_Thoat.columnWidths = new int[]{0, 0};
		gbl_panel_Thoat.rowHeights = new int[]{0};
		gbl_panel_Thoat.columnWeights = new double[]{0.5, 1.0};
		gbl_panel_Thoat.rowWeights = new double[]{1.0};
		panel_Thoat.setLayout(gbl_panel_Thoat);
		
		JPanel panel_16_8 = new JPanel();
		GridBagConstraints gbc_panel_16_8 = new GridBagConstraints();
		gbc_panel_16_8.insets = new Insets(0, 10, 0, 5);
		gbc_panel_16_8.fill = GridBagConstraints.BOTH;
		gbc_panel_16_8.gridx = 0;
		gbc_panel_16_8.gridy = 0;
		panel_Thoat.add(panel_16_8, gbc_panel_16_8);
		
		JLabel lblNewLabel_2_1_6 = new JLabel("Thoát/Nghỉ");
		lblNewLabel_2_1_6.setForeground(Color.WHITE);
		lblNewLabel_2_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_2_1_6 = new GridBagConstraints();
		gbc_lblNewLabel_2_1_6.gridx = 1;
		gbc_lblNewLabel_2_1_6.gridy = 0;
		panel_Thoat.add(lblNewLabel_2_1_6, gbc_lblNewLabel_2_1_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.white);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		contentPane.add(panel_1, gbc_panel_1);
		
		temp = panel;
		
		JPanel panel_17 = new JPanel();
		GridBagConstraints gbc_panel_17 = new GridBagConstraints();
		gbc_panel_17.fill = GridBagConstraints.BOTH;
		gbc_panel_17.gridx = 1;
		gbc_panel_17.gridy = 0;
		contentPane.add(panel_17, gbc_panel_17);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\halong.jpg"));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.GREEN);
		
		JLabel lblNewLabel_3_1 = new JLabel("Quản Lý Lộ Trình");
		lblNewLabel_3_1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(new Color(34, 139, 34));
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 16));
		
		JLabel lblNewLabel_4 = new JLabel("Mã Tour:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(new Color(46, 139, 87));
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblNewLabel_4_1 = new JLabel("Ngày Đi");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setForeground(new Color(46, 139, 87));
		lblNewLabel_4_1.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblNewLabel_4_2 = new JLabel("Giờ Đi");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setForeground(new Color(46, 139, 87));
		lblNewLabel_4_2.setFont(new Font("Arial", Font.BOLD, 12));
	
		
		JLabel lblNewLabel_4_3 = new JLabel("Ngày Về");
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setForeground(new Color(46, 139, 87));
		lblNewLabel_4_3.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblNewLabel_4_4 = new JLabel("Giờ về");
		lblNewLabel_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_4.setForeground(new Color(46, 139, 87));
		lblNewLabel_4_4.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblNewLabel_4_5 = new JLabel("Điểm Đi:");
		lblNewLabel_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5.setForeground(new Color(46, 139, 87));
		lblNewLabel_4_5.setFont(new Font("Arial", Font.BOLD, 12));
		
		IDLoTrinh = new JTextField();
		IDLoTrinh.setColumns(10);
		
		NgayDi = new JTextField();
		NgayDi.setColumns(10);
		
		GioDi = new JTextField();
		GioDi.setColumns(10);
		
		NgayVe = new JTextField();
		NgayVe.setColumns(10);
		
		DiemDi = new JTextField();
		DiemDi.setColumns(10);
		GioVe = new JTextField();
		GioVe.setColumns(10);
		
		DiemDen = new JTextField();
		DiemDen.setColumns(10);
		
		 btnThem = new JButton("Thêm Lộ Trình");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String malt=IDLoTrinh.getText();
				String giodi=GioDi.getText();
				String giove=GioVe.getText();
				String ngaydi=NgayDi.getText();
				String ngayve=NgayVe.getText();
				String diemdi=DiemDi.getText();
				String diemden=DiemDen.getText();
				
			
				try {
					pst=con.prepareStatement("insert into LoTrinh(IDLoTrinh,GioDi,GioVe,NgayDi,NgayVe,DiemDi,DiemDen) values(?,?,?,?,?,?,?)");
					pst.setString(1, malt);
					pst.setString(2, giodi);
					pst.setString(3, giove);
					pst.setString(4, ngaydi);
					pst.setString(5, ngayve);
					pst.setString(6, diemdi);
					pst.setString(7, diemden);
					int i=pst.executeUpdate();
					table_load();
					IDLoTrinh.setText("");
					GioDi.setText("");
					GioVe.setText("");
					NgayDi.setText("");
					NgayVe.setText("");
					DiemDi.setText("");
					DiemDen.setText("");
					IDLoTrinh.requestFocus();
					pst.close();
					
					
				}catch(SQLException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnThem.setForeground(new Color(34, 139, 34));
		btnThem.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnThem.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
	    btnXoaKh = new JButton("Xóa Lộ Trình");
	    btnXoaKh.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String MaID=LT.getText();
	    		try{
	    			pst=con.prepareStatement("delete from LoTrinh where IDLoTrinh=?");
	    			pst.setString(1, MaID);
	    			pst.executeUpdate();
	    			JOptionPane.showMessageDialog(null, "Xoa Thanh Cong");
	    			table_load();
	    			IDLoTrinh.setText("");
					GioDi.setText("");
					GioVe.setText("");
					NgayDi.setText("");
					NgayVe.setText("");
					DiemDi.setText("");
					DiemDen.setText("");
					pst.close();
	    			
	    		}catch(SQLException e1)
	    		{
	    			e1.printStackTrace();
	    		}
	    	}
	    });
		btnXoaKh.setForeground(new Color(34, 139, 34));
		btnXoaKh.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnXoaKh.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
	    btnSuaKH = new JButton("Sửa Lộ trình");
	    btnSuaKH.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String malt,giodi,giove,ngaydi,ngayve,diemdi,diemden;
	    		malt = IDLoTrinh.getText();
	    		giodi = GioDi.getText();
	    		giove = GioVe.getText();
	    		ngaydi  = NgayDi.getText();
	    		ngayve=NgayVe.getText();
	    		diemdi=DiemDi.getText();
	    		diemden=DiemDen.getText();
	    		try {
	    		pst = con.prepareStatement("update LoTrinh set IDLoTrinh= ?,GioDi=?,GioVe=?,NgayDi=?,NgayVe=?,DiemDi=?,DiemDen=? where IDLoTrinh =?");
	    		pst.setString(1, malt);
	    		            pst.setString(2, giodi);
	    		            pst.setString(3, giove);
	    		            pst.setString(4, ngaydi);
	    		            pst.setString(5, ngayve);
	    		            pst.setString(6, diemdi);
	    		            pst.setString(7, diemden);
	    		            pst.executeUpdate();
	    		            JOptionPane.showMessageDialog(null, "Record Update!!!!!");
	    		            table_load();
	    		          
	    		            IDLoTrinh.setText("");
	    		            GioDi.setText("");
	    		            GioVe.setText("");
	    		             NgayDi.setText("");
	    		             NgayVe.setText("");
	    		             DiemDi.setText("");
	    		             DiemDen.setText("");
	    		             pst.close();
	    		             
	    		}
	    		 
	    		            catch (SQLException e1) {
	    		e1.printStackTrace();
	    		}
	    		
	    		
	    	}
	    });
		btnSuaKH.setForeground(new Color(34, 139, 34));
		btnSuaKH.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSuaKH.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		GroupLayout gl_panel_17 = new GroupLayout(panel_17);
		gl_panel_17.setHorizontalGroup(
			gl_panel_17.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_17.createSequentialGroup()
					.addComponent(panel_1_1, GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
		);
		gl_panel_17.setVerticalGroup(
			gl_panel_17.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_17.createSequentialGroup()
					.addGroup(gl_panel_17.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_17.createSequentialGroup()
							.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, 685, GroupLayout.PREFERRED_SIZE)
							.addGap(11))
						.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE))
					.addGap(0))
		);
		
		
		
		JLabel lblNewLabel_4_5_1 = new JLabel("Điểm Đến:");
		lblNewLabel_4_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_1.setForeground(new Color(46, 139, 87));
		lblNewLabel_4_5_1.setFont(new Font("Arial", Font.BOLD, 12));
		
		JPanel panel_3 = new JPanel();
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "T\u00ECm Ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBackground(Color.GREEN);
		GroupLayout gl_panel_1_1 = new GroupLayout(panel_1_1);
		gl_panel_1_1.setHorizontalGroup(
			gl_panel_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_1.createSequentialGroup()
					.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1_1.createSequentialGroup()
							.addGap(150)
							.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1_1.createSequentialGroup()
							.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1_1.createSequentialGroup()
									.addContainerGap()
									.addComponent(btnThem, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
									.addGap(74)
									.addComponent(btnXoaKh, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
									.addGap(83))
								.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING, false)
									.addGroup(gl_panel_1_1.createSequentialGroup()
										.addContainerGap()
										.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(IDLoTrinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(10)
										.addComponent(lblNewLabel_4_3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(NgayVe, 0, 0, Short.MAX_VALUE))
									.addGroup(gl_panel_1_1.createSequentialGroup()
										.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_panel_1_1.createSequentialGroup()
												.addGap(7)
												.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_panel_1_1.createSequentialGroup()
												.addContainerGap()
												.addComponent(lblNewLabel_4_2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)))
										.addGap(6)
										.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING, false)
											.addGroup(gl_panel_1_1.createSequentialGroup()
												.addGap(3)
												.addComponent(NgayDi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblNewLabel_4_4, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(GioVe))
											.addGroup(gl_panel_1_1.createSequentialGroup()
												.addGap(5)
												.addGroup(gl_panel_1_1.createParallelGroup(Alignment.TRAILING)
													.addGroup(gl_panel_1_1.createSequentialGroup()
														.addComponent(GioDi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addGap(14)
														.addComponent(lblNewLabel_4_5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
													.addComponent(lblNewLabel_4_5_1))
												.addGap(18)
												.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING)
													.addComponent(DiemDen, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
													.addComponent(DiemDi)))))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1_1.createSequentialGroup()
									.addGap(9)
									.addComponent(btnSuaKH, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
								.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE))))
					.addGap(44))
				.addGroup(gl_panel_1_1.createSequentialGroup()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 634, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(80, Short.MAX_VALUE))
		);
		gl_panel_1_1.setVerticalGroup(
			gl_panel_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_1.createSequentialGroup()
					.addGroup(gl_panel_1_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1_1.createSequentialGroup()
							.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1_1.createSequentialGroup()
									.addGap(61)
									.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
									.addGap(38)
									.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING)
										.addComponent(IDLoTrinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel_1_1.createSequentialGroup()
											.addGap(5)
											.addComponent(lblNewLabel_4_3))
										.addComponent(NgayVe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(Alignment.TRAILING, gl_panel_1_1.createSequentialGroup()
									.addGap(131)
									.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(9)))
							.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1_1.createSequentialGroup()
									.addGap(16)
									.addComponent(lblNewLabel_4_1))
								.addGroup(gl_panel_1_1.createSequentialGroup()
									.addGap(13)
									.addComponent(NgayDi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1_1.createSequentialGroup()
									.addGap(17)
									.addGroup(gl_panel_1_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_4_4)
										.addComponent(GioVe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_panel_1_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1_1.createSequentialGroup()
									.addGap(1)
									.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1_1.createSequentialGroup()
											.addGap(18)
											.addComponent(lblNewLabel_4_2))
										.addGroup(gl_panel_1_1.createSequentialGroup()
											.addGap(12)
											.addComponent(GioDi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_panel_1_1.createSequentialGroup()
									.addGap(12)
									.addComponent(DiemDi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1_1.createSequentialGroup()
									.addGap(19)
									.addComponent(lblNewLabel_4_5)))
							.addGap(11)
							.addGroup(gl_panel_1_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(DiemDen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4_5_1))
							.addGap(13)
							.addGroup(gl_panel_1_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnThem, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnXoaKh, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1_1.createSequentialGroup()
							.addGap(77)
							.addComponent(btnSuaKH, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(26)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 372, GroupLayout.PREFERRED_SIZE))
		);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4_6 = new JLabel("Mã Tour:");
		lblNewLabel_4_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_6.setForeground(new Color(46, 139, 87));
		lblNewLabel_4_6.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_4_6.setBounds(16, 30, 55, 14);
		panel_4.add(lblNewLabel_4_6);
		
		LT = new JTextField();
		LT.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					String Ma=LT.getText();
					pst=con.prepareStatement("select IDLoTrinh,GioDi,GioVe,NgayDi,NgayVe,DiemDi,DiemDen from LoTrinh where IDLoTrinh=?");
					pst.setString(1, Ma);
					ResultSet rs=pst.executeQuery();
					if(rs.next()==true)
					{
						String malt=rs.getString(1);
						String giodi=rs.getString(2);
						String giove=rs.getString(3);
						String ngaydi=rs.getString(4);
						String ngayve=rs.getString(5);
						String diemdi=rs.getString(6);
						String diemden=rs.getString(7);
						IDLoTrinh.setText(malt);
						GioDi.setText(giodi);
						GioVe.setText(giove);
						NgayDi.setText(ngaydi);
						NgayVe.setText(ngayve);
						DiemDi.setText(diemdi);
						DiemDen.setText(diemden);
					}
					else {
						IDLoTrinh.setText("");
						GioDi.setText("");
						GioVe.setText("");
						NgayDi.setText("");
						NgayVe.setText("");
						DiemDi.setText("");
						DiemDen.setText("");
					}
					
				}catch(SQLException ex)
				{
					ex.printStackTrace();
				}
				
				
			}
		});
		LT.setColumns(10);
		LT.setBounds(81, 26, 119, 20);
		panel_4.add(LT);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_3.add(scrollPane);
		
		tableLoTrinh = new JTable();
		scrollPane.setViewportView(tableLoTrinh);
		panel_1_1.setLayout(gl_panel_1_1);
		panel_17.setLayout(gl_panel_17);
	
		
		panel_Khachhang.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_Khachhang.setBackground(bg_menu_item);
				if (temp != panel_Khachhang)
					temp.setBackground(bg_menu);
				temp = panel_Khachhang;
			}
		});
		
		panel_NhanVien.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_NhanVien.setBackground(bg_menu_item);
				if (temp != panel_NhanVien)
				temp.setBackground(bg_menu);
				temp = panel_NhanVien;
			}
		});
		
		panel_Nguoidung.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_Nguoidung.setBackground(bg_menu_item);
				if (temp != panel_Nguoidung)
				temp.setBackground(bg_menu);
				temp = panel_Nguoidung;
			}
		});
		
		panel_DichVu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_DichVu.setBackground(bg_menu_item);
				if (temp != panel_DichVu)
				temp.setBackground(bg_menu);
				temp = panel_DichVu;
			}
		});
		
		panel_LoTrinh.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_LoTrinh.setBackground(bg_menu_item);
				if (temp != panel_LoTrinh)
				temp.setBackground(bg_menu);
				temp = panel_LoTrinh;
			}
		});
		
		panel_Ve.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_Ve.setBackground(bg_menu_item);
				if (temp != panel_Ve)
				temp.setBackground(bg_menu);
				temp = panel_Ve;
			}
		});
		
		
		panel_DoanhThu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_DoanhThu.setBackground(bg_menu_item);
				if (temp != panel_DoanhThu)
				temp.setBackground(bg_menu);
				temp = panel_DoanhThu;
			}
		});
		
		panel_KhachSan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_KhachSan.setBackground(bg_menu_item);
				if (temp != panel_KhachSan)
				temp.setBackground(bg_menu);
				temp = panel_KhachSan;
			}
		});
		
		panel_NhaHang.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_NhaHang.setBackground(bg_menu_item);
				if (temp != panel_NhaHang)
				temp.setBackground(bg_menu);
				temp = panel_NhaHang;
			}
		});
		
		panel_NhacungCap.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_NhacungCap.setBackground(bg_menu_item);
				if (temp != panel_NhacungCap)
				temp.setBackground(bg_menu);
				temp = panel_NhacungCap;
			}
		});
	
		
		panel_Thoat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_Thoat.setBackground(bg_menu_item);
				if (temp != panel_Thoat)
				temp.setBackground(bg_menu);
				temp = panel_Thoat;
			}
		});
	}
}
