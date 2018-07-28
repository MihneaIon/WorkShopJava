package thirdExemple;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWords {

    public static void numberOfWords() {
        int number = 0;
        String[] splitString;
        System.out.println(" Read the statement: ");
        Scanner myScanner = new Scanner(System.in);
        String aux = myScanner.nextLine();
        splitString = aux.split(" ");
        Map<String, Integer> words = new HashMap<>();
        for (String myString : splitString) {
            if (!words.containsKey(myString)) {
                words.put(myString, 1);
            } else {
                words.put(myString, words.get(myString) + 1);
            }
        }

        Set<Map.Entry<String, Integer>> set = words.entrySet();
        for (Map.Entry<String, Integer> contor : set) {
            System.out.println("The word " + contor.getKey() + " was found by " + contor.getValue());
        }
    }

}
