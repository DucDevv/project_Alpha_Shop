package bo;

import java.util.ArrayList;

import bean.xacNhanbean;
import dao.xacNhandao;

public class xacNhanbo {
	xacNhandao xndao = new xacNhandao();
	public ArrayList<xacNhanbean> getdanhsach(){
		return xndao.getdanhsach();
	}
}
