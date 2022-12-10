package bo;

import java.util.ArrayList;

import bean.lichSubean;
import dao.lichSudao;

public class lichSubo {
	lichSudao lsbo = new lichSudao();
	public ArrayList<lichSubean> getlichSu(long maKh){
		return lsbo.getlichSu(maKh);
	}
}
