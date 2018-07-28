package Lambda;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise2 {

    public static List<String> transformedList(List<String>myList, Function<String,String> condition)
    {
       return myList.stream().map(condition).collect(Collectors.toList());
    }



}

