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
        Label l1, l2, l3;
        TextField tf1, tf2, tf3;
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane, 300, 200);

        l1 = new Label("Label 1");
        l2 = new Label("Label 2");
        l3 = new Label("Label 3");
        tf1 = new TextField("Text Field 1");
        tf2 = new TextField("Text Field 2");
        tf3 = new TextField("Text Field 3");

        pane.setHgap(10);
        pane.setVgap(10);
        pane.setAlignment(Pos.CENTER);

        pane.add(l1, 0, 0);
        pane.add(tf1, 1, 0);
        pane.add(l2, 0, 1);
        pane.add(tf2, 1, 1);
        pane.add(l3, 0, 2);
        pane.add(tf3, 1, 2);

        System.out.println(pane);
        primaryStage.setTitle("GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
