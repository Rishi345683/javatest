package security;

import java.util.Random;

public class AccountNumberGenerator {

    public static long generateAccountNumber() {
        Random r = new Random();
        return 1000000000L + r.nextInt(900000000);
    }
}
