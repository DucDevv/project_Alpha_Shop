package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import bean.lichSubean;

public class lichSudao {
	public ArrayList<lichSubean> getlichSu(long maKh){
		try {
			//B1: Ket noi vao csdl
	 		  CoSodao cs=new CoSodao();
	 		  cs.KetNoi();
	 		//B2: Lay du lieu ve
	  		  ArrayList<lichSubean> ds= new ArrayList<lichSubean>();
	  		  String sql="select * from VlichSu";
	  		  PreparedStatement cmd= cs.cn.prepareStatement(sql);
	  		  ResultSet rs=cmd.executeQuery();
	  		 //B3: Duyet qua tap du lieu lay ve
	 		   while(rs.next()) {
	 			  String magiay=rs.getString("magiay");
	 			  String tengiay=rs.getString("tengiay");
	 			  Date ngayMua=rs.getDate("NgayMua");
	 			  long soLuongMua=rs.getLong("SoLuongMua");
	 			  long gia=rs.getLong("gia");
	 			  long thanhTien=rs.getLong("ThanhTien");
	 			  boolean damua=rs.getBoolean("damua");
	 			  ds.add(new lichSubean(magiay, tengiay, ngayMua, soLuongMua, gia, thanhTien, damua, maKh));
	 		   }
	 		//b4: Dong rs va cn
	 		   rs.close();cs.cn.close();
	 		   return ds;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
