package Challenges;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Challenge06 {
    // Regex pattern to validate Clarivate email format
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[Cc]larivate\\.com$";

    public static boolean isValidClarivateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();

        if (isValidClarivateEmail(email)) {
            System.out.println("Valid Clarivate email address.");
        } else {
            System.out.println("Invalid email address. Please enter a valid @clarivate.com email.");
        }

        scanner.close();
    }
}
