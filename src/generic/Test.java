package generic;

public class Test {
    public static void main(String[] args) {

        Demo<String> demo = new Demo<>();
        demo.setT("Hihi");
        System.out.println(demo.getT());

        Demo<Integer> demo2 = new Demo<>();
        demo2.setT(1);

        Dictionary<String,String> dictionary = new Dictionary<>("Study","Hoc");
        String en = dictionary.getKey();
        String vi = dictionary.getValue();
        System.out.println(en + ":" +vi);

        String[] arr = {"A","B","C"};
        DemoMethodGeneric.printArrayElement(arr);
        Integer[] arr2 = {1,2,3};
        DemoMethodGeneric.printArrayElement(arr2);
    }
}
