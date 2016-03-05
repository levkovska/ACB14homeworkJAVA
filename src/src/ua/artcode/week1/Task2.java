package src.ua.artcode.week1;

//Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее

import java.util.Scanner;

/**
 * Created by levo on 22.02.16.
 */
public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("input first value");
        double first = sc.nextDouble();

        System.out.println("input second value");
        double second = sc.nextDouble();

        System.out.println("input third value");
        double third = sc.nextDouble();

        if (first > second && first > third) {
            System.out.println("Наибольшее число" + first);
        }

        if (first < second && first < third) {
            System.out.println("Наименьшее число" + first);
        }

        if (second > first && second > third) {
            System.out.println("Наибольшее число" + second);
        }

        if (second < first && second < third) {
            System.out.println("Наименьшее число" + second);
        }

        if (third > second && third > first) {
            System.out.println("Наибольшее число" + third);
        } else {
            System.out.println("Наименьшее число" + third);
        }

    }

}

