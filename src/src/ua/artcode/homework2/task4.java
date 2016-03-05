package src.ua.artcode.homework2;
import java.lang.String;

//Посчитать сколько цифр(цифра задается пользователем) в массиве

/**
 * Created by levo on 04.03.16.
 */
public class task4 {
    public static void main(String[] args) {
        int[] mas = GenerateArray.arrayGenerate(10, 100);
        String str = ArrayToString.convertToString(mas);
        FindDigitsCount.getDigitsCount('5',str);

    }
}
