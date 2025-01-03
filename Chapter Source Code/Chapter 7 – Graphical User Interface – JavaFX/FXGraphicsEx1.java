import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;
import javafx.scene.paint.Color;

public class FXGraphicsEx1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group group;
        Scene scene;
        Line line;
        Rectangle rect;
        Circle cir;

        group = new Group();
        scene = new Scene(group, 400, 400, Color.LIGHTGRAY);

        line = new Line(10, 20, 100, 40);
        group.getChildren().add(line);

        line = new Line(390, 20, 290, 40);
        group.getChildren().add(line);

        rect = new Rectangle(100, 100, 50, 50);
        rect.setStroke(Color.RED);
        rect.setFill(Color.TRANSPARENT);
        group.getChildren().add(rect);

        cir = new Circle(275, 125, 25,Color.TRANSPARENT);
        cir.setStroke(Color.RED);
        group.getChildren().add(cir);

        cir = new Circle(125, 185, 25,Color.TRANSPARENT);
        cir.setStroke(Color.YELLOW);
        group.getChildren().add(cir);

        rect = new Rectangle(250, 160, 50, 50);
        rect.setStroke(Color.YELLOW);
        rect.setFill(Color.TRANSPARENT);
        rect.setArcWidth(10);
        rect.setArcHeight(10);
        group.getChildren().add(rect);

        rect = new Rectangle(100, 220, 50, 50);
        group.getChildren().add(rect);

        cir = new Circle(275, 245, 25);
        group.getChildren().add(cir);

        cir = new Circle(125, 305, 25, Color.BLUE);
        group.getChildren().add(cir);

        rect = new Rectangle(250, 280, 50, 50);
        rect.setFill(Color.BLUE);
        rect.setArcWidth(10);
        rect.setArcHeight(10);
        group.getChildren().add(rect);

        primaryStage.setTitle("FXGraphicsEx1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
