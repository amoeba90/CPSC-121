import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class LiteBritePane extends HBox {
	private LiteBriteBoardPane board;
	/**
	 * Creates a new LiteBrite GUI with specified columns and rows.
	 * @param columns The number of pegs in the horizontal axis.
	 * @param rows The number of pegs in the vertical axis.
	 */
	public LiteBritePane(int rows, int columns) {
		// Style the HBox
		setStyle(Color.cyan.getBackground());
		setAlignment(Pos.CENTER);
		setSpacing(2);

		// Create new LiteBriteBoardPane with specified dimensions
		board = new LiteBriteBoardPane(this::processPegClick, rows, columns);

		// Create reset button and add event handler to it.
		Button resetButton = new Button("Reset");
		resetButton.setOnAction(this::processResetClick);

		// Add sub-components to this main panel.
		getChildren().addAll(board, resetButton);
	}
	
	/**
	 * TODO: Implement the event handler for the button representing a peg.
	 * Changes the color of the peg when the button is clicked.
	 * -- Should be named: processPegClick
	 */
	private void processPegClick(ActionEvent event) {
		LitePegButton peg = (LitePegButton) event.getSource();
		peg.changeColor(event);
	}	

	/**
	 * The event handler for the button to reset the game.
	 */
	private void processResetClick(ActionEvent event) {
		board.reset();
	}
}
