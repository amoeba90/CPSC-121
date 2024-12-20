import javafx.application.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * Represents a LiteBrite game board GUI. 
 *
 * @author CPSC 121 Instructors
 */
public class LiteBrite extends Application {
	/**
	 * Creates a Scene and adds the main Pane to the Scene and finally the Scene to the Stage.
	 * @param primaryStage the primary Stage used for the app
	 */
	public void start(Stage primaryStage) {
		Scene scene = new Scene(new LiteBritePane(20, 20));

		primaryStage.setTitle("Lite Brite");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
		/**
	 * Launches the JavaFX application.
	 * @param args (passed through to the launch() method)
	 */
	public static void main(String[] args) {
		launch(args);
	}
		
}
