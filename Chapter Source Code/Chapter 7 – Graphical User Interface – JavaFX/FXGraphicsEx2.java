import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.Group;
import javafx.scene.paint.Color;

public class FXGraphicsEx2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group group;
        Scene scene;
        Line line;
        Polygon poly;

        group = new Group();
        scene = new Scene(group, 400, 300, Color.BLACK);

        // main ship body
        line = new Line(150,100,180,110);
        line.setStroke(Color.WHITE);
        group.getChildren().add(line);

        line = new Line(150,120,180,110);
        line.setStroke(Color.WHITE);
        group.getChildren().add(line);

        line = new Line(158,103,158,117);
        line.setStroke(Color.WHITE);
        group.getChildren().add(line);

        // jet boost
        line = new Line(153,107,145,110);
        line.setStroke(Color.WHITE);
        group.getChildren().add(line);

        line = new Line(153,113,145,110);
        line.setStroke(Color.WHITE);
        group.getChildren().add(line);

        // asteroid 1
        double[] poly1 = {280,90,280,130,300,130,290,150,320,160,350,160,350,140,370,120,360,100,360,90,330,70,300,70};
        poly = new Polygon(poly1);
        poly.setStroke(Color.WHITE);
        group.getChildren().add(poly);

        // asterpoid 2
        double[] poly2 = {90,160,90,173,100,186,120,177,123,180,130,176,120,167,130,163,132,156,120,150,103,150,110,160};
        poly = new Polygon(poly2);
        poly.setStroke(Color.WHITE);
        group.getChildren().add(poly);

        primaryStage.setTitle("FXGraphicsEx2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}
