package src.ua.artcode.homework2;

import java.util.Scanner;

/**
 * Created by levo on 02.03.16.
 */
public class GenerateArray {
    public static int[] arrayGenerate (int size, int range) {

        int[] mas = new int[size];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * range);
            System.out.print(mas[i] + ",");
        }

        return mas;
    }

    public static int[] specificArrayGenerate (int size, int range) {
        int[] mas = new int[size];

        for (int i = 0; i < mas.length; i++) {
            int random = (int) (Math.random() * range);

            if (i % 2 == 0 ) {
                mas[i] = random % 2 == 0 ? random : random + 1;
            } else {
                mas[i] = random % 2 != 0 ? random : random+1;

            }

        }
        return mas;

    }

}


