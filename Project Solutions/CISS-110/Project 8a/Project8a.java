import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.HPos;

public class Project8a extends Application {

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
        Button b1, b2;
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane, 500, 200);

        l1 = new Label("Temperature:");
        l2 = new Label("Results:");
        b1 = new Button("Celsius to Fahrenheit");
        b2 = new Button("Fahrenheit to Celsius");
        tf1 = new TextField("0");
        tf1.setMaxWidth(200);
        tf2 = new TextField();
        tf2.setMinWidth(200);

        pane.setHgap(10);
        pane.setVgap(10);
        pane.setAlignment(Pos.CENTER);
        pane.setHalignment(b2, HPos.RIGHT);
        pane.setHalignment(l1, HPos.CENTER);
        pane.setHalignment(l2, HPos.CENTER);

        pane.add(l1, 0, 0);
        pane.add(tf1, 1, 0);
        pane.add(b1, 0, 1);
        pane.add(b2, 1, 1);
        pane.add(l2, 0, 2);
        pane.add(tf2, 1, 2);
        tf2.setEditable(false);

        b1.setOnAction( event -> {
            try {
                int c = Integer.parseInt(tf1.getText());
                tf2.setText(c + " Celsius is " + cel2far(c) + " Fahrenheit.");
            } catch (Exception e) {
                tf2.setText("Not a valid number!");
            }
        });

        b2.setOnAction ( event -> {
            try {
                int f = Integer.parseInt(tf1.getText());
                tf2.setText(f + " Fahrenheit is " + far2cel(f) + " Celsius.");
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