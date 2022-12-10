package bean;

public class gioHangbean {
	 private String magiay;
	 private String tengiay;
	 private long soluong;
	 private long gia;
	 private long thanhtien;
	 private String anh;
	 public gioHangbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public gioHangbean(String magiay, String tengiay, long soluong, long gia, long thanhtien, String anh) {
		super();
		this.magiay = magiay;
		this.tengiay = tengiay;
		this.soluong = soluong;
		this.gia = gia;
		this.thanhtien = thanhtien;
		this.anh = anh;
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
	public long getSoluong() {
		return soluong;
	}
	public void setSoluong(long soluong) {
		this.soluong = soluong;
	}
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public long getThanhtien() {
		return thanhtien;
	}
	public void setThanhtien(long thanhtien) {
		this.thanhtien = thanhtien;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	
}
