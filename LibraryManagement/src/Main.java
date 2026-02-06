import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Admin Login");
            System.out.println("2. User");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter username: ");
                    String username = sc.nextLine();
                    System.out.print("Enter password: ");
                    String password = sc.nextLine();

                    if (Admin.login(username, password)) {

                        while (true) {
                            System.out.println("\n--- Admin Menu ---");
                            System.out.println("1. Add Book");
                            System.out.println("2. Remove Book");
                            System.out.println("3. View Books");
                            System.out.println("4. Back");
                            System.out.print("Choose option: ");

                            int adminChoice = sc.nextInt();

                            if (adminChoice == 1) {
                                sc.nextLine();
                                System.out.print("Enter Book ID: ");
                                int id = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Enter Title: ");
                                String title = sc.nextLine();
                                System.out.print("Enter Author: ");
                                String author = sc.nextLine();

                                Book book = new Book(id, title, author);
                                library.addBook(book);

                            } else if (adminChoice == 2) {
                                System.out.print("Enter Book ID to remove: ");
                                int id = sc.nextInt();
                                library.removeBook(id);

                            } else if (adminChoice == 3) {
                                library.displayBooks();

                            } else if (adminChoice == 4) {
                                break;
                            } else {
                                System.out.println("Invalid option!");
                            }
                        }
                    }
                    break;

                case 2:
                    User user = new User(library);

                    while (true) {
                        System.out.println("\n--- User Menu ---");
                        System.out.println("1. View Books");
                        System.out.println("2. Borrow Book");
                        System.out.println("3. Return Book");
                        System.out.println("4. Back");
                        System.out.print("Choose option: ");

                        int userChoice = sc.nextInt();

                        if (userChoice == 1) {
                            user.viewBooks();

                        } else if (userChoice == 2) {
                            System.out.print("Enter Book ID to borrow: ");
                            int id = sc.nextInt();
                            user.borrowBook(id);

                        } else if (userChoice == 3) {
                            System.out.print("Enter Book ID to return: ");
                            int id = sc.nextInt();
                            user.returnBook(id);

                        } else if (userChoice == 4) {
                            break;
                        } else {
                            System.out.println("Invalid option!");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank you! Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
