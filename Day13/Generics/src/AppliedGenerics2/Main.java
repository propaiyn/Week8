package AppliedGenerics2;

public class Main {

    public static void main(String[] args) {
        NumberFns<Integer> n = new NumberFns<Integer>(4);
        NumberFns<Double> o = new NumberFns<Double>(4.0);

        System.out.println(n.absEqual(o)); //wouldn't work with a double as it expects an integer
    }

}
