package bo;

import java.util.ArrayList;

import bean.gioHangbean;

public class gioHangbo {
   public ArrayList<gioHangbean> ds=new ArrayList<gioHangbean>();
   
    public void Them(String magiay, String tengiay, long soluong, long gia,  String anh) {
    for(gioHangbean g: ds)
    	if(g.getMagiay().equals(magiay)) {
    		g.setSoluong(soluong+ g.getSoluong());
    		return;
    	}
    ds.add(
    new gioHangbean());
    }
    
    public void xoa(String magiay) {
    	int n = ds.size();
    	
    	if(magiay !=null) {
    		for(gioHangbean g: ds) {
    			if(g.getMagiay().equals(magiay)) {
    				ds.remove(g);
    				break;
    			}
    		}
    	}
    }
    public long TongTien() {
    	long s=0;
    	  for(gioHangbean g: ds)
    		  s=s+g.getThanhtien();
    	  return s;
    } 
}

