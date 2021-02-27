package javaFx.listview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ListView01 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		AnchorPane pane = new AnchorPane();
		ListView<String> listView = new ListView<>();
		listView.getItems().addAll("item1","item2","item3");
		listView.setPrefSize(100, 70);
		listView.setLayoutX(50.0);
		listView.setLayoutY(50.0);
		
		pane.getChildren().add(listView);
		stage.setScene(new Scene(pane,300,200));
		stage.show();

	}

}
