package javaFx.component;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ToggleButton1 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		HBox hbox = new HBox(10); //생성자에 전달된 인자 : 각 요소간에 spacing 
		ToggleButton toggleBtn = new ToggleButton("Toggle Btn1");
		ToggleButton toggleBtn2 = new ToggleButton("Toggle Btn2");
		ToggleButton toggleBtn3 = new ToggleButton("Toggle Btn3");
		ToggleGroup tg = new ToggleGroup();
		toggleBtn.setToggleGroup(tg);
		toggleBtn2.setToggleGroup(tg);
		toggleBtn3.setToggleGroup(tg);
		hbox.getChildren().addAll(toggleBtn, toggleBtn2, toggleBtn3);
		hbox.setPrefSize(200, 100);
		stage.setScene(new Scene(hbox));
		stage.show();
	}

}
