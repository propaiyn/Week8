package AppliedGenerics;

public class NumberFns <T extends Number> { //  class number has children -> integer, number and float

    T ob1;

    public NumberFns(T ob1) {
        this.ob1 = ob1;
    }

    int square() {
        return ob1.intValue() * ob1.intValue(); //Operators cannot be applied to T (ONLY NUMERICS)
                          //To fix this, we can bound the type of generics ^^^
    }
}
