package secondExemple;

import java.util.Random;

public class GuessTheNumber {

    public static int randomNumber() {
        int nr = new Random().nextInt(11);
        return nr;
    }
}
