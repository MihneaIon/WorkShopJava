package Lambda;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       // CevaCuThred myCevaThread=new CevaCuThred();
        //myCevaThread.startThread();
       // myCevaThread.startThread2();

//        ThreadLambda threadLambda=new ThreadLambda();
//        threadLambda.startThread();

        StreamExemple exemple=new StreamExemple();
        exemple.met1();


        List<String> words =Arrays.asList("aa","aaa","baad","cal","atacat","daltonist","belea");


        List<String> shortWords=Exercise1.allMatches(words, s -> s.length()<4);

        List<String> wordsWithB=Exercise1.allMatches(words, s->s.contains("b"));

        List<String> evenLengthWords=Exercise1.allMatches(words,(s->s.length()%2==0));

        System.out.println(shortWords);
        System.out.println(wordsWithB);
        System.out.println(evenLengthWords);

    }
}
