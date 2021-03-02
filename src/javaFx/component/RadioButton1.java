package javaFx.component;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RadioButton1 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		HBox hbox = new HBox(10);
		RadioButton rd1 = new RadioButton("10대");
		RadioButton rd2 = new RadioButton("20대");
		RadioButton rd3 = new RadioButton("30대");
		
		ToggleGroup tg = new ToggleGroup();
		rd1.setToggleGroup(tg);
		rd2.setToggleGroup(tg);
		rd3.setToggleGroup(tg);
		
		rd2.setSelected(true);
		
		hbox.getChildren().addAll(rd1,rd2,rd3);
		stage.setScene(new Scene(hbox,300,200));
		stage.show();
		
	}

}
