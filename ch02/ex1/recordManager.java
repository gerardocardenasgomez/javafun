import java.io.*;

class recordManager {
    public static void main( String[] args ) {
        String filename = "data.txt";

        fileScanner myScanner = new fileScanner();

        if (myScanner.fileExists(filename)) {
            System.out.printf("Wow!! %s does exist\n", filename);
        } else {
            System.out.printf("Noe it does not exist");
        }
    }
}
