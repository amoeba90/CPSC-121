public enum Color {
	red, orange, yellow, lawngreen, blue, pink, black, cyan, purple, white;

	public String getBackground() {
		return "-fx-background-color: " + this;
	}

}
