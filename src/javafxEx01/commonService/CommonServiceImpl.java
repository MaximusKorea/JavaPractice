package javafxEx01.commonService;

import java.util.ArrayList;
import java.util.List;

import javafxEx01.memberservice.MemberVO;

public class CommonServiceImpl implements CommonService {

	private static List<MemberVO> list = new ArrayList<>();

	public static List<MemberVO> getList() {
		return list;
	}

	public static void setList(List<MemberVO> list) {
		CommonServiceImpl.list = list;
	}
	
	
	
}
