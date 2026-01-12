import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;

public class CommonUIControls extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label, pwl;
        TextField tf;
        Button button;
        PasswordField pwf;
        RadioButton rb1, rb2, rb3;
        CheckBox cb1, cb2;
        ToggleButton tb1, tb2;
        ToggleGroup tg1, tg2;
        VBox vbox;
        Scene scene;

        //Basic controls
        label = new Label("Label:");
        button = new Button("Button!");
        tf = new TextField("Text Field!");
        tf.setMaxWidth(200);

        // PasswordField
        pwl = new Label("Password:");
        pwf = new PasswordField();
        pwf.setMaxWidth(150);

        // RadioButton code
        rb1 = new RadioButton("Choice A");
        rb2 = new RadioButton("Choice 2");
        rb3 = new RadioButton("Choice D");
        tg1 = new ToggleGroup();
        rb1.setToggleGroup(tg1);
        rb2.setToggleGroup(tg1);
        rb3.setToggleGroup(tg1);

        // CheckBox code
        cb1 = new CheckBox("Fries");
        cb2 = new CheckBox("Baguette");

        // ToggleButton Code
        tb1 = new ToggleButton("Nap for 2 hours.");
        tb2 = new ToggleButton("Nap until tomorrow.");
        tg2 = new ToggleGroup();
        tb1.setToggleGroup(tg2);
        tb2.setToggleGroup(tg2);

        // load up the VBox!
        vbox = new VBox(label, tf, button, pwl, pwf, rb1, rb2, rb3, cb1, cb2, tb1, tb2);
        vbox.setSpacing(20);
        vbox.setAlignment(Pos.CENTER);
        scene = new Scene(vbox, 300, 500);

        // and go!
        primaryStage.setTitle("The Kitchen Sink!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
