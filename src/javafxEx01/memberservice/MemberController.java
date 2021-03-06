package javafxEx01.memberservice;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafxEx01.commonService.CommonService;
import javafxEx01.commonService.CommonServiceImpl;

public class MemberController implements Initializable {

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

	public void memberRegister() {
		List<MemberVO> list = CommonServiceImpl.getList();
		
		TextField memberName = (TextField)root.lookup("#memberName");
		TextField memberId = (TextField)root.lookup("#memberId");
		PasswordField memberPw1 = (PasswordField)root.lookup("#memberPw1");
		PasswordField memberPw2 = (PasswordField)root.lookup("#memberPw2");
		RadioButton genderM = (RadioButton)root.lookup("#genderM");
		RadioButton genderF = (RadioButton)root.lookup("#genderF");
		CheckBox reading = (CheckBox)root.lookup("#chkReading");
		CheckBox exercise = (CheckBox)root.lookup("#chkExercise");
		CheckBox love = (CheckBox)root.lookup("#chkLove");
		CheckBox car = (CheckBox)root.lookup("#chkCar");
		CheckBox realestate = (CheckBox)root.lookup("#chkRealestate");
		CheckBox stock = (CheckBox)root.lookup("#chkStock");
		
		
		
		
		
		
		System.out.println("회원가입 확인버튼 눌림");
	}
	
	
	
}
