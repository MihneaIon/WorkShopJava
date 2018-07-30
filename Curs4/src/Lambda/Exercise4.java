package Lambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise4 {

    public static String[] allMatches(List<String> params, Function<String,String> functie, Predicate<String> condition )
    {

        //return params.stream().map(functie).filter(condition).collect(Collectors.toList());

         return params.stream().map(functie).filter(condition).toArray(String[]::new);

        //return params.stream().map(functie).filter(condition).findFirst().orElse(null).collect(Collectors.toList());
    }
}
