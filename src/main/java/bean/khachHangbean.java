package bean;

public class khachHangbean {
	private long maKh;
	  private String hoTen;
	  private String diaChi;
	  private String soDt;
	  private String tenDn;
	  private String Pass;
public khachHangbean() {
	super();
	// TODO Auto-generated constructor stub
}
public khachHangbean(long maKh, String hoTen, String diaChi, String soDt, String tenDn, String pass) {
	super();
	this.maKh = maKh;
	this.hoTen = hoTen;
	this.diaChi = diaChi;
	this.soDt = soDt;
	this.tenDn = tenDn;
	Pass = pass;
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
public String getDiaChi() {
	return diaChi;
}
public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
}
public String getSoDt() {
	return soDt;
}
public void setSoDt(String soDt) {
	this.soDt = soDt;
}
public String getTenDn() {
	return tenDn;
}
public void setTenDn(String tenDn) {
	this.tenDn = tenDn;
}
public String getPass() {
	return Pass;
}
public void setPass(String pass) {
	Pass = pass;
}

}
