package javafxEx01.loginservice;

import java.util.List;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafxEx01.commonService.CommonService;
import javafxEx01.commonService.CommonServiceImpl;
import javafxEx01.memberservice.MemberController;
import javafxEx01.memberservice.MemberVO;

public class LoginServiceImpl implements LoginService {

	@Override
	public void loginManage(String id) {
		System.out.println("로그인 클래스 동작");
		Stage loginStage = new Stage();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
		Parent root = null;
		
		try {
			root = loader.load();
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		
		MemberVO vo = showInfo(id);
		
		
		TextField resultId = (TextField)root.lookup("#resultId");
		resultId.setText(vo.getMemberId());
		TextField resultName = (TextField)root.lookup("#resultName");
		resultName.setText(vo.getMemberName());
		TextField resultGender = (TextField)root.lookup("#resultGender");
		resultGender.setText(vo.getMemberGender());
		TextField resultInterest = (TextField)root.lookup("#resultInterest");
		resultInterest.setText(vo.getMemberInterest());
		
		LoginController controller = loader.getController();
		controller.setRoot(root);
		
		Scene scene = new Scene(root);
		loginStage.setScene(scene);
		loginStage.show();
		
	}
	
	public MemberVO showInfo(String id){
		List<MemberVO> list = CommonServiceImpl.getList();
		MemberVO vo = null;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getMemberId().equals(id)) {
				vo = list.get(i);
			}
		}
		
		return vo;
	}
			

}
