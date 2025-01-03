import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;

public class GridPaneDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        // all the things we need.
        Label l1, l2, l3;
        TextField tf1, tf2, tf3;
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane, 300, 200);

        // create the labels and text fields
        l1 = new Label("Label 1");
        l2 = new Label("Label 2");
        l3 = new Label("Label 3");
        tf1 = new TextField("Text Field 1");
        tf2 = new TextField("Text Field 2");
        tf3 = new TextField("Text Field 3");

        // set pane object gaps and alignment
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setAlignment(Pos.CENTER);

        // remember that column is first then row!
        pane.add(l1, 0, 0);
        pane.add(tf1, 1, 0);
        pane.add(l2, 0, 1);
        pane.add(tf2, 1, 1);
        pane.add(l3, 0, 2);
        pane.add(tf3, 1, 2);

        // and go!
        primaryStage.setTitle("GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
