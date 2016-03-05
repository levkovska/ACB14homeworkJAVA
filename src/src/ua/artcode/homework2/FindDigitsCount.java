package src.ua.artcode.homework2;

/**
 * Created by levo on 05.03.16.
 */
public class FindDigitsCount {
    public static void getDigitsCount(char number, String str){
        int count = 0;
        for (int i = 0, n = str.length(); i < n; i++) {
            if(number == str.charAt(i)){
                count++;
            }
        }
        System.out.println();

        if(count >= 1)
            System.out.println(count+" digit was found");
        else
            System.out.println(count+" digits were found");
    }

}
