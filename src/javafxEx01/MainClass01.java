package javafxEx01;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafxEx01.memberservice.MemberVO;

public class MainClass01 extends Application {

	private static List<MemberVO> list = new ArrayList<>();
	
	public static void main(String[] args) {
		launch(args);
		
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Event01.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		
		Controller01 controller = loader.getController();
		controller.setRoot(root);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	

	
	
}
