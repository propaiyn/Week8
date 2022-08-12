import java.io.*;

public class InputOutputStream {

    public static void copy(String inFile, String outFile) throws IOException {

        try (FileInputStream fileInputStream = new FileInputStream("/Users/Hassan/Desktop/Day14/InputOutput/2869886.jpg"); // File we want to copy

             FileOutputStream fileOutputStream = new FileOutputStream("/Users/Hassan/Desktop/Day14/InputOutput/rain.jpg");) { // New file

            //^^^^ Copy image in a folder and give it a new filename

            int numberOfBytesRead; // Store the number of bytes read in the loop

            byte[] bytesArray = new byte[128];

            while ((numberOfBytesRead = fileInputStream.read(bytesArray)) != -1) {
                //Numver of bytes read from bytesArray = numberOfBytesRead

                fileOutputStream.write(bytesArray, 0, numberOfBytesRead);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        copy("/Users/Hassan/Desktop/Day14/InputOutput/2869886.jpg", "/Users/Hassan/Desktop/Day14/InputOutput/rain.jpg" );
    }
}