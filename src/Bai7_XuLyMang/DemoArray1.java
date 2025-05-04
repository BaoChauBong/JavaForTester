package Bai7_XuLyMang;

public class DemoArray1 {
    public static void main(String[] args) {
        // khai báo vầ khởi tạo độ dài mảng
        String sinhVienArray [] = new String[3];

        // gán giá trị cho mảng sinhVienArray
        sinhVienArray[0] = "Linh";
        sinhVienArray[1] = "Trường";
        sinhVienArray[2] = "Tươi";
//        sinhVienArray[3] = "Xuân"; // vượt ngưỡng độ dài quy định


        // truy xuất giá trị thủ công thông qua vị trí
        System.out.println(sinhVienArray[1]);

        // duyệt mảng để truy xuất giá trị đồng loạt
        // dùng vòng lặp for để duyệt mảng

        // cách 1 : vòng lặp for đơn giản
        for (int i = 0; i < sinhVienArray.length; i++){
            System.out.println(sinhVienArray[i]);
        }

        String svArray [] = new String[3];
        // copy gtr từ mảng sinhVienArray sang svArray
        for (int i = 0; i < sinhVienArray.length; i++){
            // gán gtr tại vị trí của mảng 1 cho mảng 2
            svArray[i] = sinhVienArray[i];
        }

        System.out.println("===========================");

        // in mảng svArray
        for (int i = 0; i < svArray.length; i++){
            System.out.println(svArray[i]);
        }
    }
}
