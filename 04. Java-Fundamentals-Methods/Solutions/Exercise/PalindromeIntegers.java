package HW;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while(!input.equals("END")) {
            checkIfStringIsPalindrome(input);
            input = scanner.nextLine();
        }
    }

    public static void checkIfStringIsPalindrome(String input) {
        boolean isValid = true;
        for (int index = 0; index < input.length() / 2; index++) {
            isValid = input.charAt(index) == input.charAt(input.length() - 1 - index);
        }

        if(isValid) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
