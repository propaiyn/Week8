import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        // CREATE STREAMS
        List<Integer> number = Arrays.asList(2, 3, 4, 5); // collection to put into stream
        Stream<Integer> square = number.stream(); //Declare a stream of same type (Integer) = collection .stream(); method
        System.out.println(square.toString());
    }
}
// Streams API used to process collections of objects

// Stream = object sequence which supports various methods which can be pipelined
// to produce a desired result

// THEY ARE NOT DATA STRUCTURES and take input from
    //Collections
    //Arrays
    //IO Channels

// Streams support 2 kinds of operation = Intermediate and Terminal
    // Intermediate = returns a stream
    // Terminal = void/non stream return type