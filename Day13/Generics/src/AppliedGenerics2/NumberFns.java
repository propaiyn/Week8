package AppliedGenerics2;

public class NumberFns<T extends Number> { //  class number has children -> integer, number and float

    T num;

    public NumberFns(T ob) {
        this.num = ob;
    }

    boolean absEqual(NumberFns<?> ob) { //passes in parameter of type numberFns, checks if absolute value of param is same as class number
        if(Math.abs(num.doubleValue())==Math.abs(ob.num.doubleValue())){
            return true;}else{
        return false;
    }}} //The main method expects an int and gets a double, to solve this use wildcard^^
