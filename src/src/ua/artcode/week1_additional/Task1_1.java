package src.ua.artcode.week1_additional;

// Ввести с клавиатуры значения трех сторон треугольника a, b и c и определить, является ли он прямоугольным. Ответ вывести в виде сообщения.

import java.util.Scanner;

/**
 * Created by levo on 24.02.16.
 */
public class Task1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("input value a");
        double a = sc.nextDouble();
        double aa = Math.pow(a , 2);

        System.out.println("input value b");
        double b = sc.nextDouble();
        double bb = Math.pow(b , 2);

        System.out.println("input value c");
        double c = sc.nextDouble();
        double cc = Math.pow(c , 2);


        if (cc == aa + bb) {
            System.out.println("треугольник прямоугольный");
        } else {
            System.out.println("треугольник не являеться прямоугольным");
        }


    }

}

