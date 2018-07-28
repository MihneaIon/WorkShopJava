package firstExemple;

import java.util.Scanner;

public class ExempleMonth {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int month = 0;
        month = myScanner.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 12: {
                System.out.println(" Winter ");
                break;
            }
            case 3:
            case 4:
            case 5: {
                System.out.println(" Spreing ");
                break;
            }
            case 6:
            case 7:
            case 8: {
                System.out.println(" Summer ");
                break;
            }
            case 9:
            case 10:
            case 11: {
                System.out.println(" Autumn ");
            }
            default: {
                System.out.println(" The month is worng ");
                break;
            }

        }
    }
}
