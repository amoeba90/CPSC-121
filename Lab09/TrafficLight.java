import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TrafficLight extends Application {
    
    public void start(Stage stage) {
        
        TrafficLightButton button = new TrafficLightButton();
        
        Scene scene = new Scene(button,200,200);

        stage.setTitle("Traffic Light");
        stage.setScene(scene);
        stage.show();

    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
