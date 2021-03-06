package javafxEx01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafxEx01.commonService.CommonService;

public class Controller01 implements Initializable {

	private Parent root;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("컨트롤러 실행");
	}

	public void loginConfirm() {
		System.out.println("로그인 버튼이 클릭됨");
	}
	
	public void loginCancel() {
		System.out.println("로그인 취소 버튼 클릭됨");
		CommonService.exit(root);
	}
	
	public void memberRegister() {
		System.out.println("회원가입 버튼 클릭됨");
	}
	
	
}
