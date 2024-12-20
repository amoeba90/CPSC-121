import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;

public class LiteBriteBoardPane extends GridPane {
    
    private LitePegButton[][] pegs;

    public LiteBriteBoardPane(EventHandler<ActionEvent> handler,int rows,int columns) {
        pegs = new LitePegButton[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                LitePegButton peg = new LitePegButton();
                peg.setOnAction(handler);
                pegs[row][col] = peg;
                add(peg, col, row);
            }    
        }
    }

    public void reset() {
        for (LitePegButton[] row : pegs) {
            for (LitePegButton peg : row) {
                peg.resetColor();
            }
        }
    }
    
}
