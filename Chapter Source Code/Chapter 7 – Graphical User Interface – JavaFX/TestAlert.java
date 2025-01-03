import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class TestAlert extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error Dialog");
        alert.setHeaderText("Unrecoverable error!");
        alert.setContentText("The application needs to close.");

        alert.showAndWait();

    }
}
