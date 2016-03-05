package src.ua.artcode.homework2;
//Поменять местами наибольший и наименьший элементы в массиве

/**
 * Created by levo on 04.03.16.
 */
public class task2 {
    public static void main(String[] args) {

        int[] mas = GenerateArray.arrayGenerate(10, 100);

        int max_value = FindMax.maxValue(mas);
        System.out.println(" ");

        int indexmax = FindMax.findIndexMax(mas);

        System.out.println("maxvalue:"+max_value);

        int min_value = FindMin.minValue(mas);
        System.out.println(" ");

        int indexmin = FindMin.findIndexMin(mas);

        System.out.println("minvalue:"+min_value);
        mas[indexmin] = max_value;
        mas[indexmax] = min_value;

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ",");
        }




        }

    }

