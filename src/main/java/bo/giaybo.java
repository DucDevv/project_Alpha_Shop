package bo;

import java.util.ArrayList;

import bean.giaybean;
import dao.giaydao;

public class giaybo {
	giaydao gdao = new giaydao();
	ArrayList<giaybean> ds;
	
	public ArrayList<giaybean> getgiay(){
		ds = gdao.getgiay();
		return ds;
	}
	
	public ArrayList<giaybean> TimMa(String maloaigiay){
		ArrayList<giaybean> tam= new ArrayList<giaybean>();
		for(giaybean s: ds)
			if(s.getMaloaigiay().equals(maloaigiay))
				tam.add(s);
		return tam;
	}
	
	public ArrayList<giaybean> TimMaGiay(String magiay){
		ArrayList<giaybean> tam = new ArrayList<giaybean>();
		for(giaybean x: ds)
			if(x.getMagiay().equals(magiay))
				tam.add(x);
		return tam;
	}
	
	public ArrayList<giaybean> Tim(String key){
		ArrayList<giaybean> tam= new ArrayList<giaybean>();
		for(giaybean s: ds) {
			if(s.getTengiay().toLowerCase().trim().contains(key.toLowerCase().trim()) ||
			s.getMaloaigiay().toLowerCase().trim().contains(key.toLowerCase().trim())
			) {
				tam.add(s);
			}
		}
		return tam;
	}
}
