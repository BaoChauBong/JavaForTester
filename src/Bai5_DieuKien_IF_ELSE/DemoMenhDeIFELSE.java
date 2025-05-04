package Bai5_DieuKien_IF_ELSE;

public class DemoMenhDeIFELSE {
    public static void main(String[] args) {
        String address = "Ha Noi";
        String phone = "234456";
        boolean checkLogin = true;
        if (address.equals("Ha Noi ")) {
            System.out.println("Địa chỉ đúng là " + address);
        } else {
            System.out.println("Địa chỉ là các tỉnh khác");
        }

        if (checkLogin == true) {
            System.out.println("Login success");
        } else {
            System.out.println("Invalid email or password");
        }
    }
}
