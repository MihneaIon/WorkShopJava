package Lambda;

import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        List<String> words =Arrays.asList("aolo","iepure","zonaq","elan","macelar","submarin","elvetia","aer","cer");

       // String[] result=Exercise3.allMatches(words, s->s.toUpperCase(), s -> s.length()<4 && s.contains("E"));
        String result=Exercise3.allMatches(words, s->s.toUpperCase(), s -> s.length()<4 && s.contains("E"));

        System.out.println(result);


    }
}
