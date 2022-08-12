import java.util.Arrays;
import java.util.List;

public class StreamForEach {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Bob", "Trevor", "Steve", "Gary"); // Initialise list of strings -> list to stream - > run forEach method

        names.stream().forEach(x -> System.out.println(x)); //.forEach method allows loop (Lambda)
    }
}
