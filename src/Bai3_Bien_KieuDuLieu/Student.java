package Bai3_Bien_KieuDuLieu;

public class Student {

    public static int a = 20; // Đây là biến toàn cục ( instance )
    public String ten = "Bao Chau";

    public static void sayHello() {
        int b = 10;                     // Đây là biến cục bộ ( local )
        b = b + tinhLaiSuat();
        System.out.println("Gia tri cua n la: " + b);
    }

    public static int tinhLaiSuat(){
        int laiSuat = 100000000;
        return laiSuat;
    }
    public static void main(String[] args) {
        String name  = "Bao Chau Bong";
        int c = 15;
        int number; // Khai báo biến nhưng chưa có gtr khởi tạo
        System.out.println(name);

        Student student = new Student();
        System.out.println(student.ten);
        System.out.println(a);
    }
}
