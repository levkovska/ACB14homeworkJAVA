package src.ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by levo on 22.02.16.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number");
        double number = sc.nextDouble();

        if (number >=0 && number <= 1) {
            System.out.println("Number" + " "+number+" " + "is included in diapason 0 ... 1");
        } else {
            System.out.println("Number is not included in diapason  0 ... 1" );
        }

    }
}
