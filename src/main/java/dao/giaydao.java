package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.giaybean;

public class giaydao {
	public ArrayList<giaybean> getgiay(){
		ArrayList<giaybean> dsgiay = new ArrayList<giaybean>();
		try {
			//B1: Ket noi vao csdl
		    CoSodao cs = new CoSodao();
		    cs.KetNoi();
		    //b2: Lay du lieu ve
		    String sql = "select * from giay";
		    PreparedStatement cmd = cs.cn.prepareStatement(sql);
		    ResultSet rs =cmd.executeQuery();
		    //b3: Duyet qua tap du lieu lay ve
		    while(rs.next()) {
		    	String magiay = rs.getString("magiay");
		    	String tengiay = rs.getString("tengiay"); 
		    	long soluong = rs.getLong("soluong");
		    	long gia= rs.getLong("gia");
		    	String anh= rs.getString("anh"); 
		    	String maloaigiay= rs.getString("maloaigiay");
		    	dsgiay.add(new giaybean(magiay, tengiay, soluong, maloaigiay, gia, anh));
		    }
		  //b4: Dong rs va cn
		    rs.close(); cs.cn.close();
		    return dsgiay;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<giaybean> TimMa(String maloaigiay){
		   ArrayList<giaybean> tam =new ArrayList<giaybean>();
		   ArrayList<giaybean> ds = getgiay();
		   for(giaybean s: ds)
			   if(s.getMaloaigiay().equals(maloaigiay))
				   tam.add(s);
		   return tam;
	}
	
	public ArrayList<giaybean> Tim(String key){
		   ArrayList<giaybean> tam =new ArrayList<giaybean>();
		   ArrayList<giaybean> ds = getgiay();
		   for(giaybean s: ds)
			   if(s.getTengiay().toLowerCase().trim().contains(key.toLowerCase().trim())||
					   s.getMaloaigiay().toLowerCase().trim().contains(key.toLowerCase().trim())
					   )
				   tam.add(s);
		   return tam;
	   }
}
