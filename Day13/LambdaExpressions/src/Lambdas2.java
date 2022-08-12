public class Lambdas2 {

    interface FuncInterface { // functional interface with one method
        int operation(int a, int b);
    }

    private int operate(int a, int b, FuncInterface funcObj) {
        return funcObj.operation(a, b); //private method takes two ints and a funcinterface value/obj
    }

    public static void main(String[] args) {
        FuncInterface add = (int x, int y) -> x + y;

        Lambdas2 lambda = new Lambdas2(); //object creation
        System.out.println(lambda.operate(5, 7, add));
    }
}