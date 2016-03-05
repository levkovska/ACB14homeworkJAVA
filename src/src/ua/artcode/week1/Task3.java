package src.ua.artcode.week1;
//Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.

import java.util.Scanner;

/**
 * Created by levo on 22.02.16.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input number");
        int number = sc.nextInt();

        if(number % 7 == 0){
            System.out.println(number * 2);

        }
        else {
            System.out.println("Number"+" "+number+" "+"is not divided to 7");
        }

    }
}
