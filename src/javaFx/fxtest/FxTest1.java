package javaFx.fxtest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class FxTest1 extends Application{
/*
 - Application을 상속해야한다.
 - main에서 launch를 호출하면 start메서드가 호출이된다.
 - start는 추상메서드이며 오버라이딩을 통해 내용을 담아낸다.
 - GUI에서의 포함관계는 대략 다음과 같다 
 - label,button과 같은 각 요소 ⊂ pane(종류가 다양하다.) ⊂  scene ⊂ primaryStage 
 
 
 */
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("실행 되었습니다!!!");
		Label label = new Label("Hello");
		label.setFont(new Font(20));
		
		Scene scene = new Scene(label,200,50); // (Label,가로,세로)을 생성자의 인자로 전달한다.
		primaryStage.setScene(scene);
		primaryStage.setTitle("연습중");
		primaryStage.show();
	}
	

}
