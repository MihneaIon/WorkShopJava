package thirdExemple;

import java.util.Scanner;

public class ChechRotationStrings {

    public static void chechRevers() {
        String[] splitString;
        Scanner myScanner = new Scanner(System.in);
        System.out.println(" Insert first word ");
        String firstWord = myScanner.nextLine();
        System.out.println(" Insert the second  word ");
        String secondWord = myScanner.nextLine();
        if (firstWord.equals(revers(secondWord + ""))) {
            System.out.println(" First string is a rotation of second ");
        } else {
            System.out.println(" First string isn't a rotation of second");
        }

    }

    public static String revers(String aStringWhichItWillBeRevers) {
        String aux = "";
        for (int i = aStringWhichItWillBeRevers.length() - 1; i >= 0; i--) {

            aux = aux + aStringWhichItWillBeRevers.charAt(i);
        }
        System.out.println(aux);
        return aux;
    }


    public static void chechRevers2() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println(" Insert first word ");
        String firstWord = myScanner.nextLine();
        System.out.println(" Insert the second  word ");
        String secondWord = myScanner.nextLine();
        if (firstWord.equals(revers(secondWord + ""))) {
            System.out.println(" First string is a rotation of second ");
        } else {
            System.out.println(" First string isn't a rotation of second");
        }
    }

    public static StringBuilder revers2(String aStringWhichItWillBeRevers) {
        StringBuilder myStringBuilder = new StringBuilder(aStringWhichItWillBeRevers);
        return myStringBuilder.reverse();
    }

}
