package src.ua.artcode.homework2;

//Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные

/**
 * Created by levo on 04.03.16.
 */
public class task5 {
    public static void main(String[] args) {

        int[] mas = GenerateArray.specificArrayGenerate(10,100);
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ",");
        }


    }
}
