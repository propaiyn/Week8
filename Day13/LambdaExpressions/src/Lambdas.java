import java.util.ArrayList;

public class Lambdas {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        arrayList.forEach(n -> System.out.println(n)); //iTERATION
        arrayList.forEach(n -> {if (n % 2 == 0) System.out.println(n);}); // logic

    }}




// HOW TO WRITE A LAMBDA
// (arg1, arg2) -> {System.out.println("Two arguments " + arg1 + " and " + arg2);}

// Lambdas are similar to interfaces EXCEPT
    // Lambdas allow us to just pass in a specific implementation of a method
       // as the parameter (no object)

// Dont need access level, name of method (Just what it does), dont need the return type

// Function which dont need class
// Can be passed as if it was an object