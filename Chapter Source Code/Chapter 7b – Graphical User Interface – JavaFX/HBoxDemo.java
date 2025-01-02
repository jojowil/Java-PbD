import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HBoxDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        HBox hb = new HBox(10, new Label("First Name:"), new TextField());
        Scene scene = new Scene(hb, 550, 70);

        hb.getChildren().addAll(new Label("Last Name:"), new TextField());
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
