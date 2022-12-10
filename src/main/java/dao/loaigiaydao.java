package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.loaigiaybean;

public class loaigiaydao {
	public ArrayList<loaigiaybean> getloaigiay(){
		try {
			ArrayList<loaigiaybean> dsloaigiay= new ArrayList<loaigiaybean>();
			//B1: Ket noi vao csdl
		    CoSodao cs = new CoSodao();
		    cs.KetNoi();
		    //b2: Lay du lieu ve
		    String sql = "select * from loaigiay";
		    PreparedStatement cmd = cs.cn.prepareStatement(sql);
		    ResultSet rs =cmd.executeQuery();
		    //b3: Duyet qua tap du lieu lay ve
		    while(rs.next()) {
		    	 String maloaigiay = rs.getString("maloaigiay");
		         String tenloaigiay = rs.getString("tenloaigiay");
		         dsloaigiay.add(new loaigiaybean(maloaigiay, tenloaigiay));
		    }
		    //b4: Dong rs va cn
		    rs.close(); 
		    cs.cn.close();
		    return dsloaigiay;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
