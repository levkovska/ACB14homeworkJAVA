package src.ua.artcode.homework2;

/**
 * Created by levo on 02.03.16.
 */
public class FindMax {
    public static int maxValue(int[] mas) {
        int max_value = 0;
        for (int i = 0; i < mas.length; i++) {

            if (mas[i] > max_value) {
                max_value = mas[i];
            }

        }
        return max_value;
    }

    public static int findIndexMax(int[] mas) {

        int max_value = 0;
        int index = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max_value) {
                max_value = mas[i];
                index = i;
            }

        }
        System.out.println("max_index:"+index);
        return index;
    }
}
