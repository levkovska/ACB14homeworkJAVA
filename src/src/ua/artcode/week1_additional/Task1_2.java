package src.ua.artcode.week1_additional;

//Ввести с клавиатуры три числа, положительные возвести в куб, а отрицательные заменить на 0.

import java.util.Scanner;

/**
 * Created by levo on 25.02.16.
 */
public class Task1_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("input first value");
        double first = sc.nextDouble();
        double f3 = Math.pow(first, 3);

        System.out.println("input second value");
        double second = sc.nextDouble();
        double s3 = Math.pow(second, 3);

        System.out.println("input third value");
        double third = sc.nextDouble();
        double t3 = Math.pow(third, 3);


        if (first > 0) {
            System.out.println(f3);
        } else {
            System.out.println("0");
        }

        if (second > 0) {
            System.out.println(s3);
        } else {
            System.out.println("0");
        }

        if (third > 0) {
            System.out.println(t3);
        } else {
            System.out.println("0");
        }


    }
}

