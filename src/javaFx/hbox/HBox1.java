package javaFx.hbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HBox1 extends Application {

	
	
	public static void main(String[] args) {

		launch(args);
		
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		VBox hbox = new VBox();
		
		hbox.setSpacing(100);
		
		Pane canvas1 = new Pane();
		canvas1.setStyle("-fx-background-color:blue");
		canvas1.setPrefSize(200, 150);
		
		Pane canvas2 = new Pane();
		canvas2.setStyle("-fx-background-color:red");
		canvas2.setPrefSize(200, 150);
		
		
		hbox.getChildren().addAll(canvas1,canvas2);
		stage.setScene(new Scene(hbox));
		stage.show();
	}

}
