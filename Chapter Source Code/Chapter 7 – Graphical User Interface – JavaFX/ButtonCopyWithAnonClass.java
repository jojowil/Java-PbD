import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.TextAlignment;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.geometry.HPos;

public class ButtonCopyWithAnonClass extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label lsrc, ldst;
        TextField tfsrc, tfdst;
        Button btn;
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane, 500, 200);

        lsrc = new Label("Source:");
        ldst = new Label("Destination:");
        btn = new Button("Perform the COPY");
        tfsrc = new TextField();
        tfsrc.setMinWidth(200);
        tfdst = new TextField();
        tfdst.setMinWidth(200);

        pane.setHgap(10);
        pane.setVgap(10);
        pane.setAlignment(Pos.CENTER);
        GridPane.setHalignment(btn, HPos.LEFT);
        GridPane.setHalignment(lsrc, HPos.CENTER);
        GridPane.setHalignment(ldst, HPos.CENTER);

        pane.add(lsrc, 0, 0);
        pane.add(tfsrc, 1, 0);
        pane.add(ldst, 0, 1);
        pane.add(tfdst, 1, 1);
        pane.add(btn, 1, 2);
        tfdst.setEditable(false);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String s;

                s = tfsrc.getText();
                tfdst.setText(s);
            }
        });

        System.out.println(pane);
        primaryStage.setTitle("Button Event Inner Class");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
