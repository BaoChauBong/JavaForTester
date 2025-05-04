package Bai5_DieuKien_IF_ELSE;

public class BaiTap {
    public static void main(String[] args) {
        int number = 100;
        if (number == 100) {
            System.out.println("Number = " + number);
        } else if (number < 50) {
            System.out.println("Number < " + 50);
        } else if (number > 50) {
            System.out.println("Number > " + 50);
        }

        String month = "Tháng 12";
        switch (month) {
            case "Tháng 12":
                System.out.println("Tháng 12");

                break;
            case "Tháng 2":
                System.out.println("Tháng 2");

                break;
            default:
                System.out.println("Không thuộc tháng nào !");
        }
    }
}
