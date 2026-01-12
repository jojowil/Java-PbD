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
        // all the things
        Label label;
        TextField tf;
        Button button;
        VBox vbox;
        Scene scene;

        // create some objects
        label = new Label("Label:");
        button = new Button("Button!");
        tf = new TextField("Text Field!");

        // creat the VBox and add them in order
        vbox = new VBox(label, tf, button);
        scene = new Scene(vbox, 300, 200);

        // and go!
        primaryStage.setTitle("A Simple Scene!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
