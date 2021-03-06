package javafxEx01;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafxEx01.commonService.CommonService;
import javafxEx01.commonService.CommonServiceImpl;
import javafxEx01.loginservice.LoginService;
import javafxEx01.loginservice.LoginServiceImpl;
import javafxEx01.memberservice.MemberService;
import javafxEx01.memberservice.MemberServiceImpl;
import javafxEx01.memberservice.MemberVO;

public class Controller01 implements Initializable {

	private Parent root;
	private MemberService ms;
	private LoginService ls;
	List<MemberVO> list = CommonServiceImpl.getList();
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("컨트롤러 실행");
		ms = new MemberServiceImpl();
		ls = new LoginServiceImpl();
	}

	public void loginConfirm() {
		System.out.println("로그인 버튼이 클릭됨");
		TextField inputId = (TextField)root.lookup("#inputId");
		PasswordField inputPw = (PasswordField)root.lookup("#inputPw");
		String id = inputId.getText();
		String pw = inputPw.getText();
		
		if(id.isEmpty() || pw.isEmpty()) {
			CommonServiceImpl.showMessage("ID와 PW를 입력해주세요");
			inputId.requestFocus();
		}else {
		login(inputId,inputPw);
		}
		
	}
	
	public void loginCancel() {
		System.out.println("로그인 취소 버튼 클릭됨");
		CommonService.exit(root);
	}
	
	public void memberRegister() {
		System.out.println("회원가입 버튼 클릭됨");
		ms.memberShip();
	}
	
	public void login(TextField inputId, PasswordField inputPw) {
		String id = inputId.getText();
		String pw = inputPw.getText();
		int count = 0;
		int index = 0;
		for(int i=0;i<list.size();i++) {
			count = 0;
			if(list.get(i).getMemberId().equals(id)){
				count++;
				index = i;
			}
		}
		if(count == 1) {
			if(list.get(index).getMemberPw().equals(pw)) {
				CommonServiceImpl.showMessage("로그인 성공!");
				ls.loginManage(id);
			}else {
				CommonServiceImpl.showMessage("비밀번호가 틀렸습니다.!");
				inputId.clear();
				inputPw.clear();
				inputId.requestFocus();
			}
		}else {
			inputId.clear();
			inputPw.clear();
			inputId.requestFocus();
			CommonServiceImpl.showMessage("없는 아이디입니다.");
		}
		System.out.println(count);
		
	}
	
	
	
}
