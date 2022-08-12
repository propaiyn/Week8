import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2,3,4,5); //instantiating list, with the value of an array as a list of integers

        List<Integer> square =  // second list = to the value of return from stream

                number.stream() // puts numbers list into stream

                        .map(x -> x*x) // takes each value and squares it

                        .collect(Collectors.toList()); // returns stream of squared numbers which were put into a list (reference variable square)

        System.out.println(square);
    }
}
