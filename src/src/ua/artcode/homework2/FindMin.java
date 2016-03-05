package src.ua.artcode.homework2;

/**
 * Created by levo on 02.03.16.
 */
public class FindMin {
    public static int minValue(int[] mas) {

        int min_value = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < min_value) {
                min_value = mas[i];


            }
        }
        return min_value ;
    }

    public static int findIndexMin(int[] mas) {

        int min_value = mas[0];
        int index =0;
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < min_value) {
                min_value = mas[i];
                index = i;

            }
        }
        System.out.println("min_index:"+index);
        return index ;
    }
}

