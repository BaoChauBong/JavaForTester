package Bai8_Collections;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // CÀch khai bÀo th÷ 2
        ArrayList<String> arrayList = new ArrayList<>();

        // phó thuèc vªo jDK
        var arrayList2 = new ArrayList<>();
        arrayList2.add(2);
        arrayList2.add("Bao Chau");
        arrayList2.add(3.6);

        for (Object value : arrayList2){
            System.out.println(value);   
        }
    }
}
