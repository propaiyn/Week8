import java.io.*;

public class BufferedWriter {
    public static void main(String[] args) {
        try{ //Need try block to handle exception
            java.io.BufferedWriter bw = new java.io.BufferedWriter(//need to pass in file writer object

                new FileWriter("/Users/Hassan/Desktop/Day14/InputOutput/output.txt")); // enter file pat
                //Optionally add a new file name at the end
                //Unhandled exception as it could through an error THUS...

            bw.write("Hassan"); //How to write to file
            bw.write(" Mommicron\n"); //new line
            bw.write("Rubina\n");
            bw.write(" G-large\n"); // Pre-spaced
            bw.close(); //Best practice to close after use

            // file will be overwritten

            }catch (IOException e) {
            return;
        }

    }
}
