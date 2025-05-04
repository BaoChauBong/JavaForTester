package Bai8_Collections;

import java.util.ArrayList;
import java.util.List;

public class DemoCollectionList {
    public static void main(String[] args) {
        List<Integer> listNumber =  new ArrayList<>();
        listNumber.add(23);
        listNumber.add(244);
        listNumber.add(246);
        listNumber.add(24444);

        System.out.println("===== TRUY XUẤT ĐỒNG LOẠT HẾT CÁC GIÁ TRỊ KHÔNG THÔNG QUA VỊ TRÍ ====");
        for (int value : listNumber){
            System.out.println(value);
        }

        listNumber.remove(1);
        System.out.println(listNumber.size());
        System.out.println(listNumber.isEmpty());
        System.out.println(listNumber.indexOf(246));
        System.out.println(listNumber.contains(24444));

        System.out.println("===== TRUY XUẤT THÔNG QUA VỊ TRÍ CỤ THỂ ====");
        System.out.println(listNumber.get(2));
    }
}
