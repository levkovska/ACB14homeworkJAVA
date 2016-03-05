package src.ua.artcode.week1;
// Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)

import java.util.Scanner;

/**
 * Created by levo on 24.02.16.
 */
public class Task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("input first value");
        int number1 = sc.nextInt();

        System.out.println("input second value");
        int number2 = sc.nextInt();

        int number3 = number1 % 10;
        int number4 = number2 % 10;

        if (number3 == number4) {
            System.out.println("true" + " " + number3 + " " + number4);
        } else {
            System.out.println("false" + " " + number3 + " " + number4);
        }

    }
}
