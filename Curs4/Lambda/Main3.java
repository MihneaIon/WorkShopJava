package Lambda;

import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        List<String> words =Arrays.asList("aolo","iepure","zonaq","elan","macelar","submarin","elvetia","aer","cer");

        List<String> result=Exercise3.allMatches(words, s->s.toUpperCase(), s -> s.length()<4 && s.contains("E"));
        try {
            System.out.println(result.get(0));
        }catch (Exception e)
        {
            System.out.println(" I haven't a such element ");
        }

    }
}
