package src.ua.artcode.homework2;

// Найти среднее арифметическое массива

/**
 * Created by levo on 05.03.16.
 */
public class task6 {

    public static void main(String[] args) {

        int[] mas = GenerateArray.arrayGenerate(3, 100);
        System.out.println();

        int result = AverageArrays.averageArrays(mas);
        System.out.println("Average is " + result);
    }



}
