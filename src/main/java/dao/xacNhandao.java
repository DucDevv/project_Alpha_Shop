package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import bean.xacNhanbean;

public class xacNhandao {
	public ArrayList<xacNhanbean> getdanhsach() {
		try {
			//B1: Ket noi vao csdl
	 		CoSodao cs=new CoSodao();
	 		cs.KetNoi();
	 		//B2: Lay du lieu ve
	 		ArrayList<xacNhanbean> ds= new ArrayList<xacNhanbean>();
	 		String sql="select * from VxacNhan";
	 		PreparedStatement cmd= cs.cn.prepareStatement(sql);
	 		ResultSet rs=cmd.executeQuery();
	 		//B3: Duyet qua tap du lieu lay ve
	 		while(rs.next()) {	 			  
	 			long MaChiTietHD=rs.getLong("MaChiTietHD");
	 	 		long MaHoaDon=rs.getLong("MaHoaDon");
	 			long maKh=rs.getLong("maKh");
				String hoTen=rs.getString("hoTen");; 
	 			String tengiay=rs.getString("tengiay");
	 			Date ngayMua=rs.getDate("NgayMua");
	 			long soLuongMua=rs.getLong("SoLuongMua");
	 			long gia=rs.getLong("gia");
	 			long thanhTien=rs.getLong("ThanhTien");
	 			boolean damua=rs.getBoolean("damua");
	 			ds.add(new xacNhanbean(MaChiTietHD, MaHoaDon, maKh, hoTen, tengiay, soLuongMua, gia, thanhTien, ngayMua, damua));
	 		   }
	 		//b4: Dong rs va cn
	 		  rs.close();cs.cn.close();
	 		  return ds;
		} catch (Exception e) {
			e.printStackTrace();return null;
		}
	}
}
