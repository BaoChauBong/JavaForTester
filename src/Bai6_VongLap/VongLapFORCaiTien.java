package Bai6_VongLap;

public class VongLapFORCaiTien {
    public static void main(String[] args) {
        int number[] = {5, 7, 20, 10, 9};
        String name[] = {"Hoa", "Linh", "Trường", "Hân"};

       // String sinhvienn = Read_File Excel / JSON / Code Auto lấy ra / Select SQLL

        for (int i : number) {
            if (i == 20) {
                System.out.println("Co so 20 ton tai");
            } else {
                System.out.println("Ko co so 20");
            }
            // System.out.println(i);
        }
        for (String ten : name) {
//            System.out.println(ten);
            if (ten.equals("Nam")){
                System.out.println("Ban nay ten Nam");
            }
        }
    }
}
