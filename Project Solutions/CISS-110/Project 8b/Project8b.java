import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.TextAlignment;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.HPos;


public class Project8b extends Application //implements EventHandler{

    public static int cel2far(int c) {
        return c * 9 / 5 + 32;
    }

    public static int far2cel(int f) {
        return ( f - 32 ) * 5 / 9;
    }

    @Override
    public void start(Stage primaryStage) {
        Label l1, l2;
        TextField tf1, tf2;
        RadioButton rb1, rb2;
        ToggleGroup tg;
        Button b1;
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane, 500, 200);

        l1 = new Label("Temperature:");
        l2 = new Label("Results:");
        tg = new ToggleGroup();
        rb1 = new RadioButton("Celsius to Fahrenheit");
        rb1.setToggleGroup(tg);
        rb2 = new RadioButton("Fahrenheit to Celsius");
        rb2.setToggleGroup(tg);
        b1 = new Button("Calculate!");
        tf1 = new TextField("0");
        tf1.setMaxWidth(200);
        tf2 = new TextField();
        tf2.setMaxWidth(200);

        pane.setHgap(10);
        pane.setVgap(10);
        pane.setAlignment(Pos.CENTER);
        pane.setHalignment(b1, HPos.CENTER);
        pane.setHalignment(l1, HPos.CENTER);
        pane.setHalignment(l2, HPos.CENTER);

        pane.add(l1, 0, 0);
        pane.add(tf1, 1, 0);
        pane.add(rb1, 0, 1);
        pane.add(rb2, 1, 1);
        pane.add(l2, 0, 2);
        pane.add(tf2, 1, 2);
        pane.add(b1, 0, 3, 2, 1);
        tf2.setEditable(false);

        b1.setOnAction( event -> {
            try {
                //System.out.println(event);
                if (tg.getSelectedToggle() == rb1) {
                    int c = Integer.parseInt(tf1.getText());
                    tf2.setText(c + " Celsius is " + cel2far(c) + " Fahrenheit.");
                } else if (tg.getSelectedToggle() == rb2) {
                    int c = Integer.parseInt(tf1.getText());
                    tf2.setText(c + " Fahrenheit is " + far2cel(c) + " Celsius.");
                }
            } catch (Exception e) {
                tf2.setText("Not a valid number!");
            }
        });

        System.out.println(pane);
        primaryStage.setTitle("Temperature Conversion");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}