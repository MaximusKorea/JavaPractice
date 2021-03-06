package javafxEx01.memberservice;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
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
		List<CheckBox> checkbox = new ArrayList<>();
		checkbox.add(reading);
		checkbox.add(exercise);
		checkbox.add(love);
		checkbox.add(car);
		checkbox.add(realestate);
		checkbox.add(stock);
		//-----------------------------------------------------------------------------
		String name =memberName.getText();
		String id = memberId.getText();
		String pw1 = memberPw1.getText();
		String pw2 = memberPw2.getText();
		String gender = genderValue(genderM,genderF);
		String interest = interestValue(checkbox);
		MemberVO vo = null;
		if(id.isEmpty() || pw1.isEmpty() || pw2.isEmpty() || gender.isEmpty() || interest.isEmpty()) {
			CommonServiceImpl.showMessage("모든 값을 입력해주세요");
			memberName.requestFocus();
			
		}else {
		if(!idConfirm(id)) {
			if(pwConfirm(pw1,pw2)) {
				vo = new MemberVO(name,id,pw1,interest,gender);
				list.add(vo);
				CommonServiceImpl.showMessage("회원가입이 완료 되었습니다.");
				
				CommonService.exit(root);
				
			}else {
				CommonServiceImpl.showMessage("비밀번호가 일치하지 않습니다.");
			}
			
		}else {
			
			CommonServiceImpl.showMessage("이미 존재하는 아이디입니다.");
			
			
		}
		}
		
	}
	public boolean pwConfirm(String pw1, String pw2) {
		boolean flag = false;
		if(pw1.equals(pw2)) {
			flag = true;
		}else {
			flag = false;
		}
		return flag;
	}
	public boolean idConfirm(String id) {
		List<MemberVO> list = CommonServiceImpl.getList();
		boolean flag = false;
		int count = 0;
		if(list.isEmpty()) {
			flag = false;
		}else {
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getMemberId().equals(id)) {
					count++;
				}
			}
			if(count == 0) {
				flag = false;
			}else {
				flag = true;
			}
		}
		
		return flag;
	}
	
	public String genderValue(RadioButton b1,RadioButton b2) {
		String gender = null;
		if(b1.isSelected()) {
			gender = "남";
		}else {
			gender = "여";
		}
		
		return gender;
	}
	
	public String interestValue(List<CheckBox> checkbox) {
		StringBuffer buff = new StringBuffer();
		String interest = null;
		int index = 0;
		for(int i=0;i<checkbox.size();i++) {
			if(checkbox.get(i).isSelected()) {
				index = i;
			}
		}
		for(int i=0;i<=index;i++) {
			String item = checkbox.get(i).getText();
			if(i<index) {
				buff.append(item);
				buff.append("&");
			}else {
				buff.append(item);
			}
		}
//		String item = checkbox.get(i).getText();
//		System.out.println(item+"\t");
//		if(i<checkbox.size()-2) {
//			buff.append(item);
//			buff.append("&");
//		}else {
//			buff.append(item);
//		}
		interest = buff.toString();
		
		return interest;
	}
	
}
