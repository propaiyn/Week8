import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob", "Trevor", "Steve", "Gary");

        List<String> result = // Second list equal to the value returned by stream

                names.stream() // insert names into a stream
                        .sorted() // Alphabetically sorted names
                        .collect(Collectors.toList()); // return separate list of ordered names

        System.out.println(result);
    }

}
