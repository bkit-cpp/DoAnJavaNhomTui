import java.util.Scanner;
import java.util.*;
public class QLKhachHang {
private String MaKhachHang;
private String TenKhachHang;
private String CMND;
private String SDT;
private String DiaChi;
public QLKhachHang() {
	
}
public QLKhachHang(String MaKhachHang,String TenKhachHang,String CMND,String SDT,String DiaChi)
{
this.MaKhachHang=MaKhachHang;
this.TenKhachHang=TenKhachHang;
this.CMND=CMND;
this.SDT=SDT;
this.DiaChi=DiaChi;
}
public String getmakhachhang()
{
	return MaKhachHang;
}
public String gettenkhachhang()
{
	return TenKhachHang;
}
public String getCMND()
{
	return CMND;
}
public String getSDT()
{
	return CMND;
}
public String getDiaChi()
{
	return DiaChi;
}
public void  setmakhachhang()
{
	this.MaKhachHang=MaKhachHang;
}
public void  settenkhachhang()
{
	this.TenKhachHang=TenKhachHang;
}
public void setCMND()
{
	this.CMND=CMND;
}
public void setSDT()
{
	this.SDT=SDT;
}
public void setDiaChi()
{
	this.DiaChi=DiaChi;
}
public String ToString()
{
	return this.MaKhachHang+" "+this.TenKhachHang+this.CMND+this.DiaChi;
}
}
