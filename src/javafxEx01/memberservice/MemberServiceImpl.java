package javafxEx01.memberservice;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MemberServiceImpl implements MemberService {

	@Override
	public void memberShip() {
		System.out.println("멤버 클래스 동작");
		Stage memberStage = new Stage();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("membership.fxml"));
		Parent root = null;
		
		try {
			root = loader.load();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Scene scene = new Scene(root);
		
		MemberController controller = loader.getController();
		controller.setRoot(root);
		
		memberStage.setScene(scene);
		memberStage.show();
		
	}

}
