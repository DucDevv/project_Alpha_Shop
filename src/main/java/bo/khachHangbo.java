package bo;

import bean.khachHangbean;
import dao.khachHangdao;

public class khachHangbo {
	khachHangdao khdao= new khachHangdao();
    public khachHangbean ktDN(String tenDn, String Pass) {
    	return khdao.ktDN(tenDn, Pass);
    }
}
