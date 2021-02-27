package javaFx.gridpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPane02 extends Application {

	public static void main(String[] args) {

		launch(args);
		
	}

	@Override
	public void start(Stage stage) throws Exception {
		//pane 내부의 영역에 여러가지 버튼 혹은 라벨을 넣고 싶다면 pane을 또 만들어 pane내부에 pane을 넣어줘야한다.
		//즉, pane의 중첩이 있어야한다.
		
		//flowpane의 경우에는 getChildren().add() 나 getChildren().allAll()을 통해서 요소를 pane내에 삽입한다.
		//gridpane의 경우에는 .add(요소,x위치,y위치) 로도 가능하고 getChildren().addAll()로도 가능한데 이때는 위치 지정을 따로 해주어야한다.
		
		System.out.println("javaFx가 실행중입니다.");
		
		GridPane gridpane = new GridPane();
		Button button = new Button("button");
		
		gridpane.setPadding(new Insets(20));// 위,오른쪽,아래쪽, 왼쪽 모두 공간을 준다.
		gridpane.setHgap(50); 
		gridpane.setVgap(10);
		
		GridPane.setColumnIndex(button, 0);
		GridPane.setRowIndex(button, 0);
		
		Label label = new Label("label");
		Label newLabel = new Label("new label");
		
		FlowPane fp = new FlowPane();
		fp.getChildren().addAll(label,newLabel);
		GridPane.setConstraints(fp, 1, 1);
		
		gridpane.add(new Button("1,0"), 1, 0);
		gridpane.add(new Label("0,1"), 0, 1);
		
		gridpane.getChildren().addAll(button,fp);
		
		FlowPane canvas = new FlowPane();
		canvas.getChildren().add(new Button("merge col(0), row(2)"));
		canvas.setAlignment(Pos.CENTER);
		canvas.setStyle("-fx-background-color:black");
		gridpane.add(canvas, 0, 2,2,1);
		
		stage.setResizable(false);
		stage.setScene(new Scene(gridpane,300,300));
		stage.show();
		
	}

}
