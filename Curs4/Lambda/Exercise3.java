package Lambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise3 {

    public static List<String> allMatches(List<String> params,Function<String,String> functie, Predicate<String>condition )
    {

        return params.stream().map(functie).filter(condition).collect(Collectors.toList());

    }


}
