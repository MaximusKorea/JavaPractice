package javaFx.gridpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPane01 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("GridPane을 테스트 합니다.");
		GridPane gridpane = new GridPane();
		Button button = new Button("Button");
		
		gridpane.setRowIndex(button, 0); //gridpane의 경우 참조변수를 통한 메서드 호출을 하기보다 클래스명으로 메서드 호출하는 것이 좋다
		gridpane.setColumnIndex(button, 0); //그 이유는 해당 메서드가 static 메서드이기 때문이다.
		
		Label label = new Label("Label");
		Label label02 = new Label("Label02");
		
		GridPane.setRowIndex(label02, 1);
		GridPane.setColumnIndex(label02, 1);
		
		GridPane.setConstraints(label,0,2);
		
		gridpane.getChildren().addAll(button,label,label02);
		primaryStage.setScene(new Scene(gridpane,300,100));
		primaryStage.setTitle("gridpane");
		primaryStage.show();
		
	}

}
