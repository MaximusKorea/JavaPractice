package javaFx.flowpane;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPane01 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("실행중입니다.");
		//FlowPane flowPane = new FlowPane(); //생성자에 아무것도 들어가지 않으면 가로로 순차적으로 배치해준다. 생성자의 인자로 Orientation.VERTICAL을 넣어주면
		FlowPane flowPane = new FlowPane(Orientation.VERTICAL);
		//세로로 순차적으로  정렬한다.(옵션)
		flowPane.setColumnHalignment(HPos.CENTER);
		flowPane.setPadding(new Insets(50,50,50,50));
		
//		Button btn01 = new Button("버튼01");
//		Button btn02 = new Button("버튼02");
//		Button btn03 = new Button("버튼03");
//		flowPane.getChildren().add(btn01);
//		flowPane.getChildren().add(btn02);
//		flowPane.getChildren().add(btn03);
		
		for(int i=1; i<15; i++) {
			flowPane.getChildren().add(new Button("버튼0"+i*i*i*i*i*10));
		}
		flowPane.setVgap(30);// 행과 행사이의 거리
		flowPane.setHgap(100);//열과 열사이의 거리
		
		Scene scene = new Scene(flowPane,300,250);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
