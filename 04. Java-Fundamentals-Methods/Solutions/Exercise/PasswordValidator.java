package HW;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if(validatePassword(password)) {
            System.out.println("Password is valid");
        }
    }

    public static boolean validatePassword(String password) {
        boolean correctCharCount = validateLength(password);
        boolean onlyLettersAndDigits = validateContains(password);
        boolean haveTwoDigits = validateDigitsCount(password);
        return correctCharCount && onlyLettersAndDigits && haveTwoDigits;
    }

    public static boolean validateLength(String password) {
        boolean isValid = password.length() >= 6 && password.length() <= 10;

        if(!isValid) {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
        return true;
    }

    public static boolean validateContains(String password) {
        for (int index = 0; index < password.length(); index++) {
            char symbol = password.charAt(index);

            if(!Character.isLetterOrDigit(symbol)) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
    }

    public static boolean validateDigitsCount(String password) {
        int digitCount = 0;

        for (int index = 0; index < password.length(); index++) {
            char symbol = password.charAt(index);
            if(Character.isDigit(symbol)) {
                digitCount++;
                if(digitCount >= 2) {
                    return true;
                }
            }
        }
        System.out.println("Password must have at least 2 digits");
        return false;
    }
}
