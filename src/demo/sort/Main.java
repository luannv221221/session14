package demo.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(0);
//        list.add(10);
//        list.add(9);
        List<String> list = new ArrayList<>();
        list.add("B");
        list.add("C");
        list.add("A");
        for (String i : list) {
            System.out.println(i);
        }

        Collections.sort(list);
        System.out.println("sau khi sắp xếp");
        for (String i : list) {
            System.out.println(i);
        }
    }
}
