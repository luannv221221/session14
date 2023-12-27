package collection;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Nguyễn Văn A");
        map.put(3,"Nguyễn Văn B");
        map.put(4,"Nguyễn Thị C");

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
