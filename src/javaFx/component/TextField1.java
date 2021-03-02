package javaFx.component;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextField1 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
VBox hbox = new VBox();
		
		TextField tf = new TextField();
		tf.setText("산골짜기");
		tf.setPrefSize(200, 50);
		Label label = new Label("아이디 수정 : ");
		
		PasswordField pf = new PasswordField();
		
		ComboBox<String> cb = new ComboBox<String>();
		cb.getItems().addAll("달리기","수영","자전거");
		cb.setValue("취미 선택");
		
		DatePicker dp = new DatePicker();
		
		TextArea ta = new TextArea();
		ta.setPrefSize(250, 50);
		
		hbox.getChildren().addAll(label,tf,pf,cb,ta,dp);
		hbox.setPrefSize(300, 200);
		
		stage.setScene(new Scene(hbox));
		stage.show();
		
	}

}
