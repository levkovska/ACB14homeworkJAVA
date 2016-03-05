package src.ua.artcode.week1;
//Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел. Если второе больше, то выводим сумму.

import java.util.Scanner;

/**
 * Created by levo on 22.02.16.
 */
public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("input first number");
        int number1 = sc.nextInt();
        System.out.println("input second number");
        int number2 = sc.nextInt();

        if (number1 > number2) {
            System.out.println(number1 - number2);
        } else {
            System.out.println(number1+number2);
        }

    }
}
