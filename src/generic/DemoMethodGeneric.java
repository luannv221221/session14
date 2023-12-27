package generic;

public class DemoMethodGeneric {
    public static <T> void printArrayElement(T[] arr){
        for (T e : arr) {
            System.out.println(e);
        }
    }
}
