package Lambda;

import java.util.Arrays;
import java.util.List;

public class Main4 {

    public static void main(String[] args) {

        List<String> words =Arrays.asList("aolo","iepure","zonaq","elan","macelar","submarin","elvetia","aer","cer");

       String[] result=Exercise4.allMatches(words, s->s.toUpperCase(), s -> s.length()<4 && s.contains("E"));
        for(String aux:result)
        {
            System.out.println(aux);
        }

    }
}
