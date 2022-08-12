import java.util.Arrays;
import java.util.List;

public class StreamReduce {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,3,4,5);

        int even =
                number.stream() // Number variable array as list of integers put into stream

                        .filter(x -> x % 2 == 0)// Filter for values that are even

                        .reduce((a,b) -> a+b) // takes values within the stream and reduces them to single value
                        /* .reduce method only takes 2 parameters */

                        // Above, two parameters are passed in and added together to reduce

                        // Reduce does above until one value left which is then returned

                        .get(); // Get method is called as stream returns an optional
    }
}
// In essence, streams STREAMLINE the process