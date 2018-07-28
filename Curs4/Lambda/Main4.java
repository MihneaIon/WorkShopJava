/*
*
La exercitile 4 si 5 nu am mai
facut clase noi ci am reutilizat clasele
deja existente
*
*/

package Lambda;

import java.util.Arrays;
import java.util.List;

public class Main4 {

    public static void main(String[] args) {

        List<String> words =Arrays.asList("aolo","iepure","zonaq","elan","macelar","submarin","elvetia","aer","cer");

        List<String> result=Exercise3.allMatches(words, s->s.toUpperCase(), s -> s.length()<4 && s.contains("E"));
        String[] stockAsArr=new String[result.size()];
        stockAsArr=result.toArray(stockAsArr);

        for(String s: stockAsArr)
        {
            System.out.println(s);
        }
        try {
            System.out.println(result.get(0));
        }catch (Exception e)
        {
            System.out.println(" I haven't a such element ");
        }

    }
}
