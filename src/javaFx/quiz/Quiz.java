package javaFx.quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Quiz extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		//BorderPane의 각각의 영역에 색이 들어가려면 각 영역에 pane이 들어가야한다.
		BorderPane bp = new BorderPane();
		
		FlowPane flowTop = new FlowPane();
		FlowPane flowRight = new FlowPane();
		FlowPane flowBottom = new FlowPane();
		FlowPane flowLeft = new FlowPane();
		FlowPane flowCenter = new FlowPane();
		
		flowTop.setStyle("-fx-background-color:#FAE0D4");
		flowRight.setStyle("-fx-background-color:#FAF4C0");
        flowBottom.setStyle("-fx-background-color:#CCA63D");
        flowLeft.setStyle("-fx-background-color:#00D8FF");
        flowCenter.setStyle("-fx-background-color:#CEF279");
		
        flowTop.setPrefSize(500, 30);
        flowRight.setPrefSize(200, 240);
        flowBottom.setPrefSize(500, 30);
        flowLeft.setPrefSize(100, 240);
        flowCenter.setPrefSize(200, 240);
        
        bp.setTop(flowTop);
        bp.setLeft(flowLeft);
        bp.setRight(flowRight);
        bp.setBottom(flowBottom);
        bp.setCenter(flowCenter);
        
        Label label1 = new Label("메뉴");
        Label label2 = new Label("홈");
        Label label3 = new Label("로그인");
        flowTop.getChildren().addAll(label1,label2,label3);
        flowTop.setAlignment(Pos.CENTER_RIGHT);
        flowTop.setPadding(new Insets(0,50,0,0));
        flowTop.setHgap(30);
        
        Button btnL = new Button("메뉴나열");
        Button btnB = new Button("바닥글 들어가는 곳");
        Button btnC = new Button("내용 들어가는 곳");
        
        flowLeft.getChildren().add(btnL);
        flowBottom.getChildren().add(btnB);
        flowCenter.getChildren().add(btnC);
        
        flowBottom.setAlignment(Pos.CENTER);
        
        FlowPane defaultPan = new FlowPane();
        FlowPane left = new FlowPane(Orientation.VERTICAL);
        FlowPane right = new FlowPane();
        
        Button idBtn = new Button("아이디 입력");
        Button pwdBtn = new Button("비밀번호 입력");
        Button loginBtn = new Button("로그인");
        left.setPrefSize(100, 50);
        idBtn.setPrefSize(100, 25);
        loginBtn.setPrefSize(70, 51);
        pwdBtn.setPrefSize(100, 25);
        left.getChildren().addAll(idBtn,pwdBtn);
        right.getChildren().add(loginBtn);
        right.setPrefSize(50, 50);
        
        defaultPan.setPrefSize(170, 50);
        defaultPan.setStyle("-fx-background-color:red");
        defaultPan.getChildren().addAll(left,right);
        
        flowRight.setAlignment(Pos.TOP_CENTER);
        flowRight.getChildren().add(defaultPan);
        flowRight.setPadding(new Insets(10));
        
        
		stage.setScene(new Scene(bp,500,300));
		stage.show();
	}

}
