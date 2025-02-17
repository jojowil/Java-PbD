import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import java.util.Optional;

public class TestTextInputDialog extends Application {

    @Override
    public void start(Stage primaryStage) {
        // create dialog with default text
        TextInputDialog dialog = new TextInputDialog("default name");
        dialog.setTitle("Text Input Dialog");
        dialog.setHeaderText("We need a little more information.");
        dialog.setContentText("Please enter your name:");

        // prompt and get choice.
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()){
            System.out.println("Your name: " + result.get());
        }
    }
}
