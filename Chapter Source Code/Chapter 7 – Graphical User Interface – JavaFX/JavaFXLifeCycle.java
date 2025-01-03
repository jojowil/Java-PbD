import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class JavaFXLifeCycle extends Application {


    /**
     * JavaFX Init routine. This is called before start().
     */
    @Override
    public void init() {
        System.out.printf("init() called on thread %s%n",
                Thread.currentThread());
    }

    /**
     * Start is where your code goes in a typical application.
     * @param primaryStage the main stage provided by JavaFX
     */
    @Override
    public void start(Stage primaryStage) {
        System.out.printf("start() called on thread %s%n",
                Thread.currentThread());
        Platform.exit(); // the stop() will be called.
    }

    /**
     * We're done. Do any necessary cleanup.
     */
    @Override
    public void stop() {
        System.out.printf("stop() called on thread %s%n",
                Thread.currentThread());
    }
}
