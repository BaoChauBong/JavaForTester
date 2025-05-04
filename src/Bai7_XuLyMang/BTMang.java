package Bai7_XuLyMang;

public class BTMang {
    public static void main(String[] args) {
        // Bước 1: Khởi tạo mảng để lưu các số chẵn
        int soChan []= new int[26]; // Có 26 số chẵn từ 0 đến 50
        int index = 0;

        // Bước 2: Dùng vòng lặp for để tìm và lưu số chẵn vào mảng
        for (int i = 0; i <= soChan.length; i++) {
            if (i % 2 == 0) {
                soChan[index] = i;
                index++;
            }
        }

        // Bước 3: Duyệt mảng để in ra các số chẵn đã lưu
        System.out.println("Các số chẵn từ 0 đến 50 là:");
//        for (int i = 0; i < soChan.length; i++) {
//            System.out.print(soChan[i] + " ");
//        }
        for (int index12 : soChan) {
            System.out.println(index12);

        }
    }
}
