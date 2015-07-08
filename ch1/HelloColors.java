class HelloColors implements Runnable {
    int colorsIndex = 0;
    String colorsArray[] = { "Blue", "Yellow", "Green", "Red", "Black", "White" };
    String currentColor = null;

    public HelloColors() {
        setColor();
        Thread t = new Thread(this);
        t.start();    
    }   

    synchronized public String getColor() {
        setColor();
        return currentColor;
    }   

    synchronized public void nextColor() {
        if (++colorsIndex == colorsArray.length) {
            colorsIndex = 0;
        }   

        setColor();
    }   

    public void setColor() {
        currentColor = colorsArray[colorsIndex];
    }   

    public void run() {
        try {
            boolean goOn = true;
            int counter = 0;
            while (goOn) {
                if (counter > 10) {
                    goOn = false;
                }   

                System.out.printf("Color is %s\n", getColor());
                nextColor();
                counter++;
                Thread.sleep(300);
            }   
        } catch (InterruptedException ie) {}
    }   
}
