import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Bob", "John", "Steve"); //initialising list with the value of array as a list storing names

        List<String> result = // Second list with the value the stream returns

                names.stream() // put list into stream

                        .filter(str -> str.startsWith("S")) // Returns values starting with an S

                        .collect(Collectors.toList()); // Returns the seperate list of all those beginning with S

        System.out.println(result);
    }
}
