package Lambda;

import java.util.Arrays;
import java.util.List;

public class Main5 {

    public static void main(String[] args) {

        List<String> firstList=Arrays.asList("aaE","behehe","aer","car","cer","nimic");

        String result =firstList.stream().reduce("",(s1,s2)->s1.toUpperCase()+ s2.toUpperCase());
        System.out.println(result);

    }
}
