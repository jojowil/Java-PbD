import javafx.application.Application;
import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;
import java.util.Optional;

public class TestChoiceDialog extends Application {

    @Override
    public void start(Stage primaryStage) {
        // array of choices
        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday" };

        // populate the dialog options with Monday as the default.
        ChoiceDialog<String> dialog = new ChoiceDialog<>(days[1], days);
        dialog.setTitle("Choice Dialog");
        dialog.setHeaderText("Which day would you prefer delivery?");
        dialog.setContentText("Choose the day:");

        // prompt and get choice.
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent())
            System.out.println("Your choice: " + result.get());
    }
}
