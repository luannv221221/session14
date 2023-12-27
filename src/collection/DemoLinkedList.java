package collection;

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        // thêm vào
        linkedList.addFirst("Hằng");
        linkedList.addFirst("Nga");
        linkedList.addLast("Yến");
        linkedList.add(1,"Tài");
        linkedList.removeLast();
        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}
