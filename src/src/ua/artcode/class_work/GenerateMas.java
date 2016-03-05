package src.ua.artcode.class_work;

import java.util.Scanner;

/**
 * Created by levo on 28.02.16.
 */
public class GenerateMas {
    public static int[] masWithPairValue(int size, int range) {

        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            int value = (int) (Math.random() * range);

            mas[i] = value % 2 == 0 ? value : value + 1;
        }
        return mas;

    }


    public static String convert(int[] mas) {
        String res = "";
        for (int i = 0; i < mas.length; i++) {
            res = res + mas[i] + ",";
        }
        return res;
    }
}
