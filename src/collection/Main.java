package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hải Yến");
        list.add("Trần Hằng");

        //list.remove("Trần Hằng");
        //list.remove(1);

        // sửa theo vị trị
        list.set(1,"Hằng Nga");
        for (String s : list) {
            System.out.println(s);
        }

        Collection<String> collections = new ArrayList<>();
        collections.add("Hải Yến");
        collections.add("Trần Hằng");

        for (String collection : collections) {
            System.out.println(collection);
        }
        // xoa tat ca phần tử hin có
//        collections.clear();
        // kiểm tra trong list co chua 1 phan tu "Hai Yen"
        System.out.println(list.contains("Hải Yến"));
        System.out.println(list.equals(collections));
    }
}
