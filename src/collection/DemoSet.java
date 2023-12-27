package collection;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Yến");
        stringSet.add("Hằng");
        stringSet.add("Yến");

        for (String s : stringSet) {
            System.out.println(s);
        }
    }
}
