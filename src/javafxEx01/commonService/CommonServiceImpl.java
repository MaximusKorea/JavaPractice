package javafxEx01.commonService;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafxEx01.memberservice.MemberVO;

public class CommonServiceImpl implements CommonService {

	private static List<MemberVO> list = new ArrayList<>();

	public static List<MemberVO> getList() {
		return list;
	}

	public static void setList(List<MemberVO> list) {
		CommonServiceImpl.list = list;
	}
	
	public static void showMessage(String s) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(s);
		alert.show();
	}
	
	
	
}
