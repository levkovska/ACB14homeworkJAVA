package src.ua.artcode.class_work;

/**
 * Created by levo on 28.02.16.
 */
public class Run {
    public static void main(String[] args) {
       int[] mas = GenerateMas.masWithPairValue(10,100);
        String res = GenerateMas.convert(mas);
        System.out.print(res);



    }
}
