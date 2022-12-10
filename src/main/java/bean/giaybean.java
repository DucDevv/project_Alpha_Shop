package bean;

public class giaybean {
	private String magiay;
	private String tengiay;
	private long soluong;
	private String maloaigiay;
	private long gia;
	private String anh;
	public giaybean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public giaybean(String magiay, String tengiay, long soluong, String maloaigiay, long gia,
			String anh) {
		super();
		this.magiay = magiay;
		this.tengiay = tengiay;
		this.soluong = soluong;
		this.maloaigiay = maloaigiay;
		this.gia = gia;
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
	public String getMaloaigiay() {
		return maloaigiay;
	}
	public void setMaloaigiay(String maloaigiay) {
		this.maloaigiay = maloaigiay;
	}
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	
}
