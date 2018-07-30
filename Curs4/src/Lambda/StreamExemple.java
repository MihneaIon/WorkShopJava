package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExemple {

    public void met1()
    {
        List<String> names= Arrays.asList("Ion","Dan","Vasile");
        long nrOfElements =names.stream().count();
        System.out.println(nrOfElements);

        nrOfElements=names.stream().filter(s -> s.length()==3).count();
        System.out.println(nrOfElements);

        List<String>result=names.stream().filter(s -> s.length() == 3).collect(Collectors.toList());
        System.out.println(result);

        String number=Stream.of("Ion","Vasile","Dan").reduce(" ",(str1,str2) -> str1+str2);
        System.out.println(number);


    }
}
