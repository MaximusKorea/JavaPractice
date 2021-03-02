package javaFx.component;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBox1 extends Application{

	public static void main(String[] args) {
		
		launch(args);
		
	}

	@Override
	public void start(Stage stage) throws Exception {
		VBox vbox = new VBox(10);
		CheckBox chk1 = new CheckBox("선택1");
		CheckBox chk2 = new CheckBox("선택2");
		
		//체크된 체로 열림
		chk2.setSelected(true);
		chk1.setText("게임");
		
		vbox.getChildren().addAll(chk1, chk2);
		
		stage.setScene(new Scene(vbox,300,200));
		stage.show();
		
	}

}
