package Bai10_ThuocTinh_PhuongThuc;

import java.util.ArrayList;

public class DemoPhuongThuc {

    ///  Hàm ko trả về gtr
    public void displayInfo() {
        System.out.println("Hello Student");
        System.out.println("Địa chỉ ở : " + getAddress());
    }

    ///  Hàm có trả về gtr loại String
    public String getAddress() {
        return "Ha Noi";
    }

    public static String getName() {
        return "Chau";
    }

    public static float chieuDai() {
        return 13.5F;
    }

    public static int chieuRong() {
        return 10;
    }

    public static void showInfo() {
        System.out.println("Tính diện tích hình chữ nhật : ");
    }

    public static float tinhDienTich() {
        return chieuDai() * chieuRong();
    }

    public ArrayList<Integer> timSoChan(int number) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                arrayList.add(i);
            }
        }
        return arrayList; // Trả về 1 arrayList dã chứa những gtr số chẵn
    }

    public static void main(String[] args) {
        /// Cách gọi lại để sử dụng phương thức
        DemoPhuongThuc demo = new DemoPhuongThuc();
        demo.displayInfo(); // Hàm KO có từ khóa static nên cần thông qua đối tượng class

        System.out.println(getName()); // Hàm có từ khóa static

        showInfo();
        System.out.println(tinhDienTich());

        // In ra gtr số chẵn ừ ArrayList trong hàm timSoChan
        for (int soChan : demo.timSoChan(50)) {
            System.out.print(soChan + ",");
        }
    }
}
