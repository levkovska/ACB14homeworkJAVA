package src.ua.artcode.homework2;

/**
 * Created by levo on 05.03.16.
 */
public class AverageArrays {
    public static int averageArrays(int[] mas) {

        int result = 0;

        for (int i = 0; i < mas.length; i++) {
            result = result + mas[i];
        }

        int averageValue = result / mas.length;
        return averageValue;
    }
}
