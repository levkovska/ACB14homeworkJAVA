package src.ua.artcode.class_work;

/**
 * Created by levo on 27.02.16.
 */
public class task2 {
    public static void main(String[] args) {

        int [] mas = {1,2,3,4,5,6,7,8};

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
    }
}
