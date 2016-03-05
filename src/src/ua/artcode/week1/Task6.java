package src.ua.artcode.week1;

// Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19

import java.util.Scanner;

/**
 * Created by levo on 22.02.16.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input first number");
        int number1 = sc.nextInt();
        System.out.println("input second number");
        int number2 = sc.nextInt();

        if (number1 + number2 >= 11 && number1 + number2 <= 19)
        {
            System.out.println(number1 + number2);
        }
        else
        {
            System.out.println("sum of the numbers are not in the range 11 ... 19 ");
        }
    }
}

