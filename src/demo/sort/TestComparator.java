package demo.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"A", 1.5F));
        products.add(new Product(3,"C", 5F));
        products.add(new Product(2,"F", 4F));

        // sắp xép danh sách sản pẩm theo prodyuctCode tăng dần
//        Collections.sort(products, new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return o1.getProductCode() - o2.getProductCode();
//            }
//        });
//        System.out.println("Să[s xếp theo productCode");
//        for (Product product : products) {
//            System.out.println(product.toString());
//        }
//        System.out.println("Sắp theo gia");
//        Collections.sort(products, new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return (int) (o1.getPrice() - o2.getPrice());
//            }
//        });
//        System.out.println("Să[s xếp theo giá");
//        for (Product product : products) {
//            System.out.println(product.toString());
//        }
        System.out.println("Săp theo ten ");
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getProductName().compareTo(o2.getProductName());
            }
        });
        for (Product product : products) {
            System.out.println(product.toString());
        }
        products.sort((o1, o2) -> o1.getProductName().compareTo(o2.getProductName()));
    }
}
