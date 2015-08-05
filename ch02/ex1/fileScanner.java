import java.io.*;
import java.io.File;

public class fileScanner {
    public boolean fileExists( String file_name ) {
        //System.out.printf("Yes, %s does exist.\n", file_name);
        File f = new File(file_name);
        
        if( f.exists() && !f.isDirectory() ) {
            return true;
        } else {
            return false;
        }
    }


    public void readFile( String file_name ) {
        // Insert code to read file here

    }
}
