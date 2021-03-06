package javafxEx01.commonService;

import javafx.scene.Parent;
import javafx.stage.Stage;

public interface CommonService {
	public static void exit(Parent root) {
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
	}
}
