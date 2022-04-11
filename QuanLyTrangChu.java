

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
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class QuanLyTrangChu extends JFrame {
	
	private Color bg_menu = new Color(30, 101, 21);
	private Color bg_menu_item = new Color(41, 169, 78);
	static private JPanel temp = null;


	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyTrangChu frame = new QuanLyTrangChu();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuanLyTrangChu() {
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
		panel_17.setLayout(null);
		GridBagConstraints gbc_panel_17 = new GridBagConstraints();
		gbc_panel_17.fill = GridBagConstraints.BOTH;
		gbc_panel_17.gridx = 1;
		gbc_panel_17.gridy = 0;
		contentPane.add(panel_17, gbc_panel_17);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\halong.jpg"));
		lblNewLabel_3.setBounds(0, 0, 666, 687);
		panel_17.add(lblNewLabel_3);
		
		
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
