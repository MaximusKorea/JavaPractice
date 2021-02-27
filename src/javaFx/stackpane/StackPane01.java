package javaFx.stackpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StackPane01 extends Application{

	public static void main(String[] args) {

		launch(args);
		
	}

	@Override
	public void start(Stage stage) throws Exception {
		//stackpane : 중첩해서 쌓을 수 있는 pane이다.
		StackPane stack = new StackPane();
		Rectangle rect = new Rectangle(100,100,Color.RED);
		Label label = new Label("Go");
		stack.getChildren().addAll(rect,label);
		
		StackPane.setAlignment(label, Pos.TOP_LEFT);
		StackPane.setAlignment(rect, Pos.BOTTOM_RIGHT);
		//margin은 밖으로 공간을 두는 것. padding은 안으로 공간을 두는 것
		StackPane.setMargin(label, new Insets(100,8,8,8));
		StackPane.setMargin(rect, new Insets(100,8,8,8));
		
		stage.setScene(new Scene(stack,300,250));
		stage.show();
	}

}
