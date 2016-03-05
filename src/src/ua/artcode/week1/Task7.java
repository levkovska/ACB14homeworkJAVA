package src.ua.artcode.week1;

//  Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат деления (целую часть от деления  и остачу)
//в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)

import java.util.Scanner;

/**
 * Created by levo on 22.02.16.
 */
public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("input first number");
        double number1 = sc.nextDouble();
        System.out.println("input second number");
        double number2 = sc.nextDouble();

        double number3 = number1 / number2;
        double number4 = number2 / number1;
        double number5 = number1 % number2;
        double number6 = number2 % number1;

        if (number5 == 0) {
            System.out.println("true" + number3);
        }
        else {
            System.out.println("false" + number3);
        }

        if (number6 == 0) {
            System.out.println("true" + number4);
        }
        else {
            System.out.println("false" + number4);
        }
    }
}
