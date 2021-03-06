package javafxEx01.loginservice;

import java.net.URL;

import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafxEx01.commonService.CommonService;


public class LoginController implements Initializable {

	private Parent root;
	
	public void setRoot(Parent root) {
		this.root = root;
		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
	
	public void memberCancel() {
		System.out.println("회원가입 취소버튼 눌림");
		CommonService.exit(root);
	}


	

}
