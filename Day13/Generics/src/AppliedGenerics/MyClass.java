package AppliedGenerics;

public class MyClass <T, U> { // Common practice to notate as T
                           // Can add variables: MyClass <T, U, V...>
    T ob; //initialising a variable of type T
    U ob2;
    // int i ; can also use parameters
    public MyClass(T ob, U ob2) { //add U ob2
        this.ob = ob;
        this.ob2 = ob2;
    }

    void showType() {
        System.out.println(ob.getClass().getName()); // shows type of the object
    }

    //Dont need to create a new class for every variable type we need to use/test




}
