import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        do {
            score = 0;

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

                if (password.length() >= 8) {
                    score++;
                }

                if (password.contains("!") || password.contains("#") || password.contains("$")) {
                    score++;
                }

                if (password.matches(".*[A-Z].*")) {
                    score++;
                }

                if (password.matches(".*[0-9].*")) {
                    score++;
                }

                if (!password.equals(username)) {
                    score++;
                }
                if (score < 5) {
                    System.out.println("Rating: Password lerng kak. Please try again.");
                }
            } while (score < 5) ;

            System.out.print("Rating: Very Strong password bro! Password accepted.  ");
            scanner.close();

        }
    }
