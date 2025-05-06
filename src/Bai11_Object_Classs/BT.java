package Bai11_Object_Classs;

import java.util.Scanner;

public class BT {
    String name;
    int age;

    public void getInfomation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        name = sc.next();
        System.out.print("Enter Age : ");
        age = sc.nextInt();
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
        BT bt = new BT();
        bt.getInfomation();
        bt.display();
    }
}
