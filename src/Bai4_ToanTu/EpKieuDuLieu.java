package Bai4_ToanTu;

public class EpKieuDuLieu {
    public static void main(String[] args) {
        float c = 35.8f;
        int b = (int)c + 1;
        System.out.println(c);
        System.out.println((int)c);
        System.out.println(b);

        // Chuyển số về chuỗi
        String numberString = String.valueOf(b);
        System.out.println(numberString + 40);

        // Chuyển chuỗi về số
        System.out.println(Integer.parseInt(numberString) + 40);
    }
}
