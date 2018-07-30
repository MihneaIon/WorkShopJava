package Lambda;

import java.util.Arrays;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<String> words =Arrays.asList("aa","aaa","baab","cal","atacat","daltonist","belea");

        List<String> exclamationWords=Exercise2.transformedList(words, s->s+"!");
        System.out.println(exclamationWords);

        List<String> eyeWords=Exercise2.transformedList(words, s->s.replace("i","eye"));
        System.out.println(eyeWords);

        List<String> upperCaseWords=Exercise2.transformedList(words,String::toUpperCase);
        System.out.println(upperCaseWords);
    }
}
