package bo;

import java.util.ArrayList;

import bean.loaigiaybean;
import dao.loaigiaydao;

public class loaigiaybo {
	loaigiaydao lgdao = new loaigiaydao();
	ArrayList<loaigiaybean> ds;
	  public ArrayList<loaigiaybean> getloaigiay(){
		  ds=lgdao.getloaigiay();
		  return ds;
	  }
}
