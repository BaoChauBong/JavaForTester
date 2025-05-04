package Bai7_XuLyMang;

public class DemoArray2 {
    public static void main(String[] args) {
        int number []  = new int[10];

        // gấn gt thông qua vòng lặp for
        for (int i = 0; i < number.length; i++){
            number[i] = i+1;
        }

        number[3] = 2000;

        // duyệt mảng number bằng vòng lặp FOR cải tiến
        for(int temp : number){
            System.out.println(temp);
        }

        String emailList[] = new String[4];
        emailList[0] = "admin@gmail.com";
        emailList[1] = "project@abc.com";

        String emailData[] = {"admin@gmail.com", "project@abc.com"};

        System.out.println(emailData[1]);
    }
}
