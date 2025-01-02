import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class SetTheScene1 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label label;
        TextField tf;
        Button button;
        VBox vbox;
        Scene scene;

        label = new Label("Label:");
        button = new Button("Button!");
        tf = new TextField("Text Field!");

        vbox = new VBox(label, tf, button);
        scene = new Scene(vbox, 300, 200);

        primaryStage.setTitle("A Simple Scene!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
