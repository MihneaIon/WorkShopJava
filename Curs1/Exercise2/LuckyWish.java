package secondExemple;

import java.util.Scanner;

public class LuckyWish {
    public static void sayMyLuck() {
        Scanner myScanner = new Scanner(System.in);
        int memory = 0, myWish = 0;
        boolean check = false;
        System.out.println(" Guess the number ");
        myWish = myScanner.nextInt();

        memory = GuessTheNumber.randomNumber();
        while (memory != myWish) {


            System.out.println("Wrong number,  Try again ");
            myWish = myScanner.nextInt();
        }
        System.out.println(" You won ");

    }

}
