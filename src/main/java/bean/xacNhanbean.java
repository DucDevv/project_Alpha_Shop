package bean;

import java.util.Date;

public class xacNhanbean {
	private long MaChiTietHD;
	private long MaHoaDon;
	private long maKh;
	private String hoTen;
	private String tengiay;
	private long SoLuongMua;
	private long gia;
	private long ThanhTien;
	private Date NgayMua;
	private boolean damua;
public xacNhanbean() {
		super();
		// TODO Auto-generated constructor stub
}
public xacNhanbean(long maChiTietHD, long maHoaDon, long maKh, String hoTen, String tengiay, long soLuongMua, long gia,
		long thanhTien, Date ngayMua, boolean damua) {
	super();
	MaChiTietHD = maChiTietHD;
	MaHoaDon = maHoaDon;
	this.maKh = maKh;
	this.hoTen = hoTen;
	this.tengiay = tengiay;
	SoLuongMua = soLuongMua;
	this.gia = gia;
	ThanhTien = thanhTien;
	NgayMua = ngayMua;
	this.damua = damua;
}
public long getMaChiTietHD() {
	return MaChiTietHD;
}
public void setMaChiTietHD(long maChiTietHD) {
	MaChiTietHD = maChiTietHD;
}
public long getMaHoaDon() {
	return MaHoaDon;
}
public void setMaHoaDon(long maHoaDon) {
	MaHoaDon = maHoaDon;
}
public long getMaKh() {
	return maKh;
}
public void setMaKh(long maKh) {
	this.maKh = maKh;
}
public String getHoTen() {
	return hoTen;
}
public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}
public String getTengiay() {
	return tengiay;
}
public void setTengiay(String tengiay) {
	this.tengiay = tengiay;
}
public long getSoLuongMua() {
	return SoLuongMua;
}
public void setSoLuongMua(long soLuongMua) {
	SoLuongMua = soLuongMua;
}
public long getGia() {
	return gia;
}
public void setGia(long gia) {
	this.gia = gia;
}
public long getThanhTien() {
	return ThanhTien;
}
public void setThanhTien(long thanhTien) {
	ThanhTien = thanhTien;
}
public Date getNgayMua() {
	return NgayMua;
}
public void setNgayMua(Date ngayMua) {
	NgayMua = ngayMua;
}
public boolean isDamua() {
	return damua;
}
public void setDamua(boolean damua) {
	this.damua = damua;
}

}
