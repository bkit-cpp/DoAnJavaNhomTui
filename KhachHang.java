import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Insets;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Component;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JYearChooser;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class KhachHang extends JFrame {

	private JPanel contentPane;
	private JTextField ID;
	private JTextField Name;
	private JTextField CMND;
	private JTextField Address;
	private JTextField SDT;
	private JButton btnThem;
	private JButton btnXoaKh;
	private JButton btnSuaKH;
	DefaultTableModel model;
	private JTable table;
	private JScrollPane scrollPane;
	private Color bg_menu = new Color(30, 101, 21);
	private Color bg_menu_item = new Color(41, 169, 78);
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KhachHang frame = new KhachHang();
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
	public KhachHang() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(30, 101, 21));
		panel_2.setBounds(0, 0, 264, 131);
		panel.add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblTieuDe = new JLabel("K\u0110T's Tourist");
		lblTieuDe.setForeground(Color.CYAN);
		lblTieuDe.setFont(new Font("Tahoma", Font.BOLD, 30));
		GridBagConstraints gbc_lblTieuDe = new GridBagConstraints();
		gbc_lblTieuDe.anchor = GridBagConstraints.WEST;
		gbc_lblTieuDe.insets = new Insets(10, 10, 5, 0);
		gbc_lblTieuDe.gridx = 0;
		gbc_lblTieuDe.gridy = 0;
		panel_2.add(lblTieuDe, gbc_lblTieuDe);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 40, 0, 0);
		gbc_separator.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator.anchor = GridBagConstraints.NORTH;
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 1;
		panel_2.add(separator, gbc_separator);
		
		JPanel panel_Khachhang = new JPanel();
		panel_Khachhang.setBackground(new Color(30, 101, 21));
		panel_Khachhang.setBounds(0, 127, 264, 41);
		panel.add(panel_Khachhang);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel = new JLabel("Khách hàng");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout gl_panel_Khachhang = new GroupLayout(panel_Khachhang);
		gl_panel_Khachhang.setHorizontalGroup(
			gl_panel_Khachhang.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Khachhang.createSequentialGroup()
					.addGap(10)
					.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(57)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(53))
		);
		gl_panel_Khachhang.setVerticalGroup(
			gl_panel_Khachhang.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel_Khachhang.createSequentialGroup()
					.addGap(12)
					.addComponent(lblNewLabel))
		);
		panel_Khachhang.setLayout(gl_panel_Khachhang);
		
		JPanel panel_NhanVien = new JPanel();
		panel_NhanVien.setBackground(new Color(30, 101, 21));
		panel_NhanVien.setBounds(0, 168, 264, 41);
		panel.add(panel_NhanVien);
		
		JPanel panel_15 = new JPanel();
		
		JLabel lblNewLabel_1 = new JLabel("Nhân viên");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout gl_panel_NhanVien = new GroupLayout(panel_NhanVien);
		gl_panel_NhanVien.setHorizontalGroup(
			gl_panel_NhanVien.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_NhanVien.createSequentialGroup()
					.addGap(10)
					.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(61)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(58))
		);
		gl_panel_NhanVien.setVerticalGroup(
			gl_panel_NhanVien.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel_NhanVien.createSequentialGroup()
					.addGap(12)
					.addComponent(lblNewLabel_1))
		);
		panel_NhanVien.setLayout(gl_panel_NhanVien);
		
		JPanel panel_Nguoidung = new JPanel();
		panel_Nguoidung.setBackground(new Color(30, 101, 21));
		panel_Nguoidung.setBounds(0, 210, 264, 41);
		panel.add(panel_Nguoidung);
		
		JPanel panel_16 = new JPanel();
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Người dùng");
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout gl_panel_Nguoidung = new GroupLayout(panel_Nguoidung);
		gl_panel_Nguoidung.setHorizontalGroup(
			gl_panel_Nguoidung.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Nguoidung.createSequentialGroup()
					.addGap(10)
					.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(57)
					.addComponent(lblNewLabel_2_1_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(53))
		);
		gl_panel_Nguoidung.setVerticalGroup(
			gl_panel_Nguoidung.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel_Nguoidung.createSequentialGroup()
					.addGap(12)
					.addComponent(lblNewLabel_2_1_2))
		);
		panel_Nguoidung.setLayout(gl_panel_Nguoidung);
		
		JPanel panel_DichVu = new JPanel();
		panel_DichVu.setBackground(new Color(30, 101, 21));
		panel_DichVu.setBounds(0, 249, 264, 41);
		panel.add(panel_DichVu);
		
		JPanel panel_16_1 = new JPanel();
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Dịch vụ");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout gl_panel_DichVu = new GroupLayout(panel_DichVu);
		gl_panel_DichVu.setHorizontalGroup(
			gl_panel_DichVu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_DichVu.createSequentialGroup()
					.addGap(10)
					.addComponent(panel_16_1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addGap(68)
					.addComponent(lblNewLabel_2_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(63))
		);
		gl_panel_DichVu.setVerticalGroup(
			gl_panel_DichVu.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_16_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel_DichVu.createSequentialGroup()
					.addGap(12)
					.addComponent(lblNewLabel_2_1_1))
		);
		panel_DichVu.setLayout(gl_panel_DichVu);
		
		JPanel panel_LoTrinh = new JPanel();
		panel_LoTrinh.setBackground(new Color(30, 101, 21));
		panel_LoTrinh.setBounds(0, 291, 264, 41);
		panel.add(panel_LoTrinh);
		
		JPanel panel_16_2 = new JPanel();
		
		JLabel lblNewLabel_2 = new JLabel("Lộ trình");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout gl_panel_LoTrinh = new GroupLayout(panel_LoTrinh);
		gl_panel_LoTrinh.setHorizontalGroup(
			gl_panel_LoTrinh.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_LoTrinh.createSequentialGroup()
					.addGap(10)
					.addComponent(panel_16_2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addGap(66)
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(63))
		);
		gl_panel_LoTrinh.setVerticalGroup(
			gl_panel_LoTrinh.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_16_2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel_LoTrinh.createSequentialGroup()
					.addGap(12)
					.addComponent(lblNewLabel_2))
		);
		panel_LoTrinh.setLayout(gl_panel_LoTrinh);
		
		JPanel panel_Ve = new JPanel();
		panel_Ve.setBackground(new Color(30, 101, 21));
		panel_Ve.setBounds(-1, 333, 264, 41);
		panel.add(panel_Ve);
		GridBagLayout gbl_panel_Ve = new GridBagLayout();
		gbl_panel_Ve.columnWidths = new int[]{0, 0, 0};
		gbl_panel_Ve.rowHeights = new int[]{0, 0};
		gbl_panel_Ve.columnWeights = new double[]{0.5, 1.0, Double.MIN_VALUE};
		gbl_panel_Ve.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_Ve.setLayout(gbl_panel_Ve);
		
		JPanel panel_16_3 = new JPanel();
		GridBagConstraints gbc_panel_16_3 = new GridBagConstraints();
		gbc_panel_16_3.fill = GridBagConstraints.BOTH;
		gbc_panel_16_3.insets = new Insets(0, 10, 0, 5);
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
		panel_DoanhThu.setBackground(new Color(30, 101, 21));
		panel_DoanhThu.setBounds(1, 375, 264, 41);
		panel.add(panel_DoanhThu);
		GridBagLayout gbl_panel_DoanhThu = new GridBagLayout();
		gbl_panel_DoanhThu.columnWidths = new int[]{0, 0, 0};
		gbl_panel_DoanhThu.rowHeights = new int[]{0, 0};
		gbl_panel_DoanhThu.columnWeights = new double[]{0.5, 1.0, Double.MIN_VALUE};
		gbl_panel_DoanhThu.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_DoanhThu.setLayout(gbl_panel_DoanhThu);
		
		JPanel panel_16_4 = new JPanel();
		GridBagConstraints gbc_panel_16_4 = new GridBagConstraints();
		gbc_panel_16_4.fill = GridBagConstraints.BOTH;
		gbc_panel_16_4.insets = new Insets(0, 10, 0, 5);
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
		panel_KhachSan.setBackground(new Color(30, 101, 21));
		panel_KhachSan.setBounds(-1, 418, 264, 41);
		panel.add(panel_KhachSan);
		GridBagLayout gbl_panel_KhachSan = new GridBagLayout();
		gbl_panel_KhachSan.columnWidths = new int[]{0, 0, 0};
		gbl_panel_KhachSan.rowHeights = new int[]{0, 0};
		gbl_panel_KhachSan.columnWeights = new double[]{0.5, 1.0, Double.MIN_VALUE};
		gbl_panel_KhachSan.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_KhachSan.setLayout(gbl_panel_KhachSan);
		
		JPanel panel_16_5 = new JPanel();
		GridBagConstraints gbc_panel_16_5 = new GridBagConstraints();
		gbc_panel_16_5.fill = GridBagConstraints.BOTH;
		gbc_panel_16_5.insets = new Insets(0, 10, 0, 5);
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
		panel_NhaHang.setBackground(new Color(30, 101, 21));
		panel_NhaHang.setBounds(-1, 461, 264, 41);
		panel.add(panel_NhaHang);
		GridBagLayout gbl_panel_NhaHang = new GridBagLayout();
		gbl_panel_NhaHang.columnWidths = new int[]{0, 0, 0};
		gbl_panel_NhaHang.rowHeights = new int[]{0, 0};
		gbl_panel_NhaHang.columnWeights = new double[]{0.5, 1.0, Double.MIN_VALUE};
		gbl_panel_NhaHang.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_NhaHang.setLayout(gbl_panel_NhaHang);
		
		JPanel panel_16_6 = new JPanel();
		GridBagConstraints gbc_panel_16_6 = new GridBagConstraints();
		gbc_panel_16_6.fill = GridBagConstraints.BOTH;
		gbc_panel_16_6.insets = new Insets(0, 10, 0, 5);
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
		panel_NhacungCap.setBackground(new Color(30, 101, 21));
		panel_NhacungCap.setBounds(-1, 503, 264, 41);
		panel.add(panel_NhacungCap);
		GridBagLayout gbl_panel_NhacungCap = new GridBagLayout();
		gbl_panel_NhacungCap.columnWidths = new int[]{0, 0, 0};
		gbl_panel_NhacungCap.rowHeights = new int[]{0, 0};
		gbl_panel_NhacungCap.columnWeights = new double[]{0.5, 1.0, Double.MIN_VALUE};
		gbl_panel_NhacungCap.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_NhacungCap.setLayout(gbl_panel_NhacungCap);
		
		JPanel panel_16_7 = new JPanel();
		GridBagConstraints gbc_panel_16_7 = new GridBagConstraints();
		gbc_panel_16_7.fill = GridBagConstraints.BOTH;
		gbc_panel_16_7.insets = new Insets(0, 10, 0, 5);
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
		panel_Thoat.setBackground(new Color(30, 101, 21));
		panel_Thoat.setBounds(-1, 545, 264, 41);
		panel.add(panel_Thoat);
		GridBagLayout gbl_panel_Thoat = new GridBagLayout();
		gbl_panel_Thoat.columnWidths = new int[]{0, 0, 0};
		gbl_panel_Thoat.rowHeights = new int[]{0, 0};
		gbl_panel_Thoat.columnWeights = new double[]{0.5, 1.0, Double.MIN_VALUE};
		gbl_panel_Thoat.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_Thoat.setLayout(gbl_panel_Thoat);
		
		JPanel panel_16_8 = new JPanel();
		GridBagConstraints gbc_panel_16_8 = new GridBagConstraints();
		gbc_panel_16_8.fill = GridBagConstraints.BOTH;
		gbc_panel_16_8.insets = new Insets(0, 10, 0, 5);
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
		panel_1.setBackground(new Color(0, 255, 0));
		panel_1.setBounds(265, 0, 432, 586);
		panel.add(panel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Quản Lý Khách Hàng");
		lblNewLabel_3.setForeground(new Color(34, 139, 34));
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_4 = new JLabel("Mã KH:");
		lblNewLabel_4.setForeground(new Color(46, 139, 87));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblNewLabel_4_1 = new JLabel("Tên  KH:");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setForeground(new Color(46, 139, 87));
		lblNewLabel_4_1.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblNewLabel_4_2 = new JLabel("CMND:");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setForeground(new Color(46, 139, 87));
		lblNewLabel_4_2.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblNewLabel_4_3 = new JLabel("Địa Chỉ:");
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setForeground(new Color(46, 139, 87));
		lblNewLabel_4_3.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblNewLabel_4_4 = new JLabel("Năm Sinh:");
		lblNewLabel_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_4.setForeground(new Color(46, 139, 87));
		lblNewLabel_4_4.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblNewLabel_4_5 = new JLabel("SDT:");
		lblNewLabel_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5.setForeground(new Color(46, 139, 87));
		lblNewLabel_4_5.setFont(new Font("Arial", Font.BOLD, 12));
		
		ID = new JTextField();
		ID.setColumns(10);
		
		Name = new JTextField();
		Name.setColumns(10);
		
		CMND = new JTextField();
		CMND.setColumns(10);
		
		Address = new JTextField();
		Address.setColumns(10);
		
		SDT = new JTextField();
		SDT.setColumns(10);
		
		JButton btnThem = new JButton("Thêm KH");
		
		btnThem.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnThem.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnThem.setForeground(new Color(34, 139, 34));
		
		JButton btnXoaKh = new JButton("Xóa KH");
		btnXoaKh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int i=table.getSelectedRow();
			if(i>=0)
			{
				model.removeRow(i);
				JOptionPane.showMessageDialog(null, "Xóa Thành Công");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Vui Lòng Chọn cái cần xóa");
			}
				
			}
		});
		btnXoaKh.setForeground(new Color(34, 139, 34));
		btnXoaKh.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnXoaKh.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));

		JComboBox cboNamSinh = new JComboBox();
		cboNamSinh.setModel(new DefaultComboBoxModel(new String[] {"Lựa Chọn", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980"}));
		JButton btnSuaKH = new JButton("Sửa KH");
		btnSuaKH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				if(i>=0)
				{
					model.setValueAt(ID.getText(), i, 0);
					model.setValueAt(Name.getText(), i, 1);
					model.setValueAt(cboNamSinh.getSelectedItem(), i, 2);
					model.setValueAt(CMND.getText(), i, 3);
					model.setValueAt(SDT.getText(), i, 4);
					model.setValueAt(Address.getText(), i, 5);
					JOptionPane.showMessageDialog(null, "Chỉnh Sửa Thành Công");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Vui lòng chọn dòng cần sửa");
				}
			}
		});
		btnSuaKH.setForeground(new Color(34, 139, 34));
		btnSuaKH.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSuaKH.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		JScrollPane scrollPane = new JScrollPane();
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();
				ID.setText(model.getValueAt(i, 0).toString());
				Name.setText(model.getValueAt(i, 1).toString());
				cboNamSinh.setComponentPopupMenu(null);
				CMND.setText(model.getValueAt(i, 3).toString());
				SDT.setText(model.getValueAt(i, 4).toString());
				Address.setText(model.getValueAt(i, 5).toString());
			}
		});
		
		model=new DefaultTableModel();
		Object[] column= {"ID","Name","Year","CMND","SDT","Address"};
		 Object[] row=new Object[6];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton btnTmKiemKh = new JButton("Tìm Kiếm KH");
		btnTmKiemKh.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int a=table.getRowCount();
				for(int i=0;i<a;i++)
					
					if(table.getValueAt(i,a).toString().equals(ID.getText()))
					{
						JOptionPane.showMessageDialog(null, "Tim thay ket qua");
						break;
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Khong Co Ket Qua");
						break;
					}
				
				
			}
		});
		btnTmKiemKh.setForeground(new Color(34, 139, 34));
		btnTmKiemKh.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTmKiemKh.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(150)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(19)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addComponent(ID)
					.addGap(10)
					.addComponent(lblNewLabel_4_3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(Address, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
					.addGap(130))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(51)
							.addComponent(Name)))
					.addGap(4)
					.addComponent(lblNewLabel_4_4, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(cboNamSinh, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addGap(117))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(19)
					.addComponent(lblNewLabel_4_2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(3)
					.addComponent(CMND, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
					.addGap(7)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_4_5, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(42)
							.addComponent(SDT)))
					.addGap(143))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(btnThem, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(btnXoaKh, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(17)
					.addComponent(btnSuaKH, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addComponent(btnTmKiemKh, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 432, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(61)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(47)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(5)
							.addComponent(lblNewLabel_4))
						.addComponent(ID)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(5)
							.addComponent(lblNewLabel_4_3))
						.addComponent(Address))
					.addGap(12)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(3)
									.addComponent(lblNewLabel_4_1))
								.addComponent(Name))
							.addGap(1))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(4)
							.addComponent(lblNewLabel_4_4))
						.addComponent(cboNamSinh, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(6)
							.addComponent(lblNewLabel_4_2))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(CMND)
							.addGap(1))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(5)
									.addComponent(lblNewLabel_4_5))
								.addComponent(SDT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(31)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(btnThem, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(btnXoaKh, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(btnSuaKH, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnTmKiemKh, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE)
					.addGap(3))
		);
		panel_1.setLayout(gl_panel_1);
		
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ID.getText().equals("")||Name.getText().equals("")||
						CMND.getText().equals("")||SDT.getText().equals("")||Address.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin");
				}
				else {
				row[0]=ID.getText();
				row[1]=Name.getText();
				row[2]=cboNamSinh.getSelectedItem();
				row[3]=CMND.getText();
				row[4]=SDT.getText();
				row[5]=Address.getText();
				
				model.addRow(row);
				ID.setText("");
				Name.setText("");
				cboNamSinh.resetKeyboardActions();
				CMND.setText("");
				SDT.setText("");
				Address.setText("");
				
				}
					}
		});
	}
}
