package src.ua.artcode.week1;

//Пользователь вводит параметр с консоли (текущий час от 0 до 24)
//Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")

import java.util.Scanner;

/**
 * Created by levo on 22.02.16.
 */
public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("input time");
        int time = sc.nextInt();

        if(time >= 9 && time <= 18 ) {
            System.out.println("Я на работе");
        }
         else {

            System.out.println("Я отдыхаю");
        }


    }
}
