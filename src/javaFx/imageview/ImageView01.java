package javaFx.imageview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ImageView01 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		//HBox 컨테이너 : 컨트롤의 높이를 확장하고 컨트롤의 폭은 유지한다.
		//VBox 컨테이너 : 컨트롤의 높이는 유지하고 컨트롤의 폭은 확장한다.
		HBox hb = new HBox();
		ImageView iv = new ImageView("resources/img/smileReRe.png");
		hb.getChildren().add(iv);
		
		iv.setFitHeight(100);
		iv.setFitWidth(100);
		iv.setRotate(30);
		
		stage.setScene(new Scene(hb,300,200));
		stage.show();
	}

}
