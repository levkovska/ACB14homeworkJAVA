package src.ua.artcode.homework2;

//Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй

/**
 * Created by levo on 04.03.16.
 */
public class task3 {
    public static void main(String[] args) {
        int[] mas = GenerateArray.arrayGenerate(10, 100);
        System.out.println();

        int[] mas1 = GenerateArray.arrayGenerate(10, 100);
        System.out.println();

        System.arraycopy(mas, 0, mas1, 0, mas1.length);
        for (int i = 0; i < mas1.length; i++) {
            System.out.print(mas1[i] + ",");

        }
    }
}


