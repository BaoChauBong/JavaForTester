package Bai10_ThuocTinh_PhuongThuc;

public class DemoHamThamSo {

    // Khai báo hàm có 2 tham số với kiểu đữ liệu tương ứng
    public static int congHaiSoNguyen(int num1, int num2) {
        return num1 + num2;
    }

    public static void showInfo (String name, int age, String address){
        System.out.println("Họ và tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
    }

    public static float tinhDienTich(float chieuDai, float chieuRong) {
        return chieuDai * chieuRong;
    }

    public static void main(String[] args) {
        System.out.println("Tổng 2 số nguyên : " + congHaiSoNguyen(4, 5));

        showInfo("Bảo Châu", 24, "Hà Nội");
        showInfo("Bảo Trâm", 16, "Hà Nội");

        System.out.println("Diện tích là : " + tinhDienTich(3.5F, 8.3F));
    }
}
