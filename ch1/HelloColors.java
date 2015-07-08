class HelloColors {
    int colorsIndex = 0;
    String colorsArray[] = { "Blue", "Yellow", "Green", "Red", "Black", "White" };
    String currentColor = null;

    public String getColor() {
        setColor();
        return currentColor;
    }

    public void nextColor() {
        if (++colorsIndex == colorsArray.length) {
            colorsIndex = 0;
        }

        setColor();
    }

    public void setColor() {
        currentColor = colorsArray[colorsIndex];
    }
}
