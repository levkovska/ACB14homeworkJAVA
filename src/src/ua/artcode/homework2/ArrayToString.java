package src.ua.artcode.homework2;

import java.util.Arrays;

/**
 * Created by levo on 05.03.16.
 */
public class ArrayToString {

    public static String convertToString(int[] arr){

        String res = Arrays.toString(arr);
        res = res.replace(",","");
        res = res.replace(" ","");
        System.out.println();
        System.out.println("String:"+res);
        return res;
    }
}
