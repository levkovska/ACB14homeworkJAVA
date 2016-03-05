package src.ua.artcode.homework2;

// Найти минимальное и максимальное значения в массиве и вывести их на консоль

import java.util.Scanner;

/**
 * Created by levo on 01.03.16.
 */
public class task1 {
    public static void main(String[] args) {
      int[] mas = GenerateArray.arrayGenerate(10, 100);

       int max_value = FindMax.maxValue(mas);
        System.out.println(" ");

        System.out.println(max_value );

        int min_value = FindMin.minValue(mas);
        System.out.println(" ");

        System.out.println(min_value );

        }
}
