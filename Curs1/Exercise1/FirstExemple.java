package firstExemple;

import java.util.Scanner;

public class FirstExemple {

    public static void main(String[] args) {
        System.out.println(" Read the age ");
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        try {
            if (age < 5) {
                System.out.println("You are in kindergarden");
            } else {
                if (age < 10) {
                    System.out.println("elementary school");
                } else {
                    if (age < 13) {
                        System.out.println("Middle schol");
                    } else {
                        if (age < 18) {
                            System.out.println("High school");
                        } else {
                            if (age > 18) {
                                System.out.println("Colleage");
                            }
                        }
                    }

                }
            }
        } catch (Exception e) {
            System.out.println(" Invalid age ");
        }

    }
}
