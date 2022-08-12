public class Main {

    public static void main(String[] args) {

        MyClass<String, Integer> obj = new MyClass<>("Hassan", 2); /*T takes on the form of a string*/
        MyClass<Integer, Integer> obj2 = new MyClass<>(2, 2); /*T takes on the form of an integer*/

        //What gets passed into class NEEDS TO BE AN OBJECT TYPE (not primitive)

        obj.showType();
        obj2.showType();
    }

}
