package Bai8_Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoColllectionSet {
    public static void main(String[] args) {
        // Set
        // Khai báo kiểu Set với loại HashSet
        // Ko có sắp xếp được

        System.out.println("======HASH SET======");
        Set <String> stringSet = new HashSet<>();
        stringSet.add("KHDJDKJH25344");
        stringSet.add("HJKGKGJDFGIU23565");

        System.out.println(stringSet.size());
        System.out.println(stringSet.contains("KHDJDKJH25344"));
        for (String value : stringSet){
            System.out.println(value);
        }

        System.out.println("======TREE SET======"); // có sắp xếp
        Set <String> treeSet = new TreeSet<>();
        treeSet.add("2sgdsgsdfg3");
        treeSet.add("3fgsdfhjg823456834");
        treeSet.add("23543dfhdsh");

        for (String value : treeSet){
            System.out.println(value);
        }    }
}
