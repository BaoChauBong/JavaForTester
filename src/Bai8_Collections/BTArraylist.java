package Bai8_Collections;

import java.util.ArrayList;

public class BTArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        // Dùng vòng lặp for để thêm các số chẵn vào ArrayList
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }

        // Dùng vòng lặp for để in ra các số chẵn
        for (int number : evenNumbers) {
            System.out.println(number);
        }

        // c2:
        for (int i = 0; i < evenNumbers.size(); i++){
            System.out.println(evenNumbers.get(i));
        }
    }
}
