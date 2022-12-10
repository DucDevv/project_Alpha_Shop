package bean;

import java.util.Date;

public class lichSubean {
	private String magiay;
	private String tengiay;
	private Date NgayMua;
	private long SoLuongMua;
	private long gia;
	private long ThanhTien;
	private boolean daMua;
	private long maKh;
public lichSubean() {
		super();
		// TODO Auto-generated constructor stub
}
public lichSubean(String magiay, String tengiay, Date ngayMua, long soLuongMua, long gia, long thanhTien, boolean daMua,
		long maKh) {
	super();
	this.magiay = magiay;
	this.tengiay = tengiay;
	NgayMua = ngayMua;
	SoLuongMua = soLuongMua;
	this.gia = gia;
	ThanhTien = thanhTien;
	this.daMua = daMua;
	this.maKh = maKh;
}
public String getMagiay() {
	return magiay;
}
public void setMagiay(String magiay) {
	this.magiay = magiay;
}
public String getTengiay() {
	return tengiay;
}
public void setTengiay(String tengiay) {
	this.tengiay = tengiay;
}
public Date getNgayMua() {
	return NgayMua;
}
public void setNgayMua(Date ngayMua) {
	NgayMua = ngayMua;
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
public boolean isDaMua() {
	return daMua;
}
public void setDaMua(boolean daMua) {
	this.daMua = daMua;
}
public long getMaKh() {
	return maKh;
}
public void setMaKh(long maKh) {
	this.maKh = maKh;
}
}
