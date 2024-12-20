import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class LitePegButton extends Button {

    private static final Color[] COLORS = {Color.black,Color.purple,Color.blue,Color.lawngreen,Color.yellow,Color.orange,Color.red,Color.pink,Color.white};
    private int colorIndex = 0;

    public LitePegButton() {
        setPrefSize(25,25);
        setStyle(COLORS[colorIndex].getBackground());
        setOnAction(this::changeColor);
    }

    public Color getColor() {
        return COLORS[colorIndex];
    }

    public void resetColor() {
        colorIndex = 0;
        setStyle(COLORS[colorIndex].getBackground());
    }

    public void changeColor(ActionEvent event) {
        if (colorIndex < COLORS.length-1) {
            colorIndex++;
            setStyle(COLORS[colorIndex].getBackground());
        } else {
            resetColor();
        }
    }
}
