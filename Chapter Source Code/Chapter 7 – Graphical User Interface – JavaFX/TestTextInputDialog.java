import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import java.util.Optional;

public class TestTextInputDialog extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextInputDialog dialog = new TextInputDialog("default name");
        dialog.setTitle("Text Input Dialog");
        dialog.setHeaderText("We need a little more information.");
        dialog.setContentText("Please enter your name:");

        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()){
            System.out.println("Your name: " + result.get());
        }

    }
}
