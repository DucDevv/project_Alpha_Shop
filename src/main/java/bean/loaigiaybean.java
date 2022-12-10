package bean;

public class loaigiaybean {
	private String tenloaigiay;
	private String maloaigiay;
	public loaigiaybean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public loaigiaybean(String tenloaigiay, String maloaigiay) {
		super();
		this.tenloaigiay = tenloaigiay;
		this.maloaigiay = maloaigiay;
	}
	public String getTenloaigiay() {
		return tenloaigiay;
	}
	public void setTenloaigiay(String tenloaigiay) {
		this.tenloaigiay = tenloaigiay;
	}
	public String getMaloaigiay() {
		return maloaigiay;
	}
	public void setMaloaigiay(String maloaigiay) {
		this.maloaigiay = maloaigiay;
	}
	
}
