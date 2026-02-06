public class Admin {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public static boolean login(String username, String password) {
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            System.out.println("Admin login successful!");
            return true;
        } else {
            System.out.println("Invalid admin credentials!");
            return false;
        }
    }
}

