//Write text to a .txt file using BufferedOutputStream

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class BufferedOutputStream1 {
    public static void main(String[] args) {

        String data = "This is a line of text inside the file";

        try {
            // Creates a FileOutputStream
            FileOutputStream file = new FileOutputStream("output.txt");

            // Creates a BufferedOutputStream
            BufferedOutputStream output = new BufferedOutputStream(file);

            byte[] array = data.getBytes();

            // Writes data to the output stream
            output.write(array);
            output.close();
	    System.out.println("success...");
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}