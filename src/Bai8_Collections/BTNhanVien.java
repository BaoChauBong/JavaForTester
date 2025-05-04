package Bai8_Collections;

import java.util.ArrayList;

public class BTNhanVien {
    public static void main(String[] args) {
        ArrayList  <String> NhanVien =  new ArrayList<>();

        NhanVien.add("Bao Chau");
        NhanVien.add("Level ");
        NhanVien.add("24");
        for (String nv : NhanVien) {
            System.out.println(nv);
        }
    }
}
