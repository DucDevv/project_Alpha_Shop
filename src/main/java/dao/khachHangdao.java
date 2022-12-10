package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.khachHangbean;

public class khachHangdao {
	public khachHangbean ktDN(String tenDn, String Pass) {
		try {
			CoSodao cs= new CoSodao();
			cs.KetNoi();
			String sql="select * from KhachHang where tenDn=? and Pass=?";
			PreparedStatement cmd= cs.cn.prepareStatement(sql);
			cmd.setString(1, tenDn);
			cmd.setString(2, Pass);
			ResultSet rs= cmd.executeQuery();
			khachHangbean kh=null;
			if(rs.next()) {//Dang nhap thanh cong
				long maKh=rs.getLong("maKh");
				String hoTen=rs.getString("hoTen");
				String diaChi=rs.getString("diaChi");
				String soDt=rs.getString("soDt");
//				String tenDn=rs.getString("tenDn");
//				String Pass=rs.getString("Pass");
				kh=new khachHangbean(maKh, hoTen, diaChi, soDt, tenDn, Pass);
			} 
			rs.close(); cs.cn.close();
			return kh;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void main(String[] args) {
		khachHangdao khdao=new  khachHangdao();
		khachHangbean kh=khdao.ktDN("nkchung", "1234");
		System.out.println(kh.getMaKh());

	}
}
