import java.io.FileReader;
import java.io.BufferedReader;


public class BRExample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader( //DO NOT NAME THE CLASS BUFFERED READER
                    new FileReader("/Users/Hassan/Desktop/Day14/InputOutput/output.txt"));
            String str;
            //loop through each line and print
            while ((str = reader.readLine()) != null) { //Reads each line of text until file end, at end returns null
                //While not = null, read, THEN print out
                System.out.println(str);
            }
            reader.close();

        }catch(Exception e) {
            return;
        }
    }
}