import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VBoxDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox vb = new VBox(10, new Label("First Name:"), new TextField());
        Scene scene = new Scene(vb, 300, 150);

        vb.getChildren().addAll(new Label("Last Name:"), new TextField());
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
