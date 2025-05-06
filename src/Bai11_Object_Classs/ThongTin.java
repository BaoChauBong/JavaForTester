package Bai11_Object_Classs;

public class ThongTin {
    float vat = 10;
    double hocphi = 1500000;

    public double getVat(){
        return vat;
    }

    public double getHocphi(){
        return hocphi;
    }

    public static void main(String[] args) {
        Student sv1 = new Student(); // Khai báo và khởi tạo giá trị cho 1 lớp
        sv1.displayInfo();

        new Student().displayInfo(); // Khai báo kiểu Anonymous
        new Student(); // Khởi tạo gtr cho class Student ( nếu có hàm xây dựng )

        ThongTin tt1 = new ThongTin();
        tt1.getHocphi();

        ThongTin tt2 = new ThongTin();
        tt2.getVat();
    }
}
