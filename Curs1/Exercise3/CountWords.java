package thirdExemple;

import java.util.Scanner;

public class CountWords {


    public static void returnWords()
    {
        int number=0;
        String[] splitString;
        System.out.println(" Read the statement ");
        Scanner myScanner=new Scanner(System.in);
        String aux=myScanner.nextLine();
        System.out.println(aux);
        splitString=aux.split(" ");
        for(String myString:splitString)
        {
            number++;
        }
        System.out.println(" I found "+number+ " words");
    }
}
