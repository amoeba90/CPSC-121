import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class TrafficLightButton extends Button {
    
    private static final Color[] COLORS = {Color.lawngreen, Color.yellow, Color.red};
    private int colorIndex = 0;
    // private Button button;
    
    public TrafficLightButton() {
        // button = new Button();
        setPrefSize(200,200);
        setStyle(COLORS[colorIndex].getBackground());
        setOnAction(this::cycleColor);

    }

    private void cycleColor(ActionEvent event) {
        if (colorIndex < 2) {
            colorIndex++;
        } else {
            colorIndex = 0;
        }
        setStyle(COLORS[colorIndex].getBackground());

    }

}
