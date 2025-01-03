import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class BasicStage extends Application {

    @Override
    public void start(Stage primaryStage) {
        // code goes here!
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("JavaFX Template");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        // we still use main(), but it's only to call launch().
        launch(args);
    }
}
