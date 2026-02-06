package security;

import java.util.Random;

public class PinGenerator {

    public static int generatePin() {
        Random r = new Random();
        return 1000 + r.nextInt(9000); // 4-digit PIN
    }
}

