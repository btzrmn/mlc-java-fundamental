package HW;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index < number; index++) {


            boolean isDivisible = checkIfNumberIsDivisibleBy8(index);

            boolean conntainOddDigit = checkIfNumberOddDigit(index);

            if(isDivisible && conntainOddDigit) {
                System.out.println(index);
            }
        }
    }

    public static boolean checkIfNumberIsDivisibleBy8(int number) {

        int sum = 0;
        while(number != 0) {
            int digit = number % 10;
            number = number / 10;

            sum = sum + digit;
        }

        return sum % 8 == 0;
    }

    public static boolean checkIfNumberOddDigit(int number) {
        while(number != 0) {
            int digit = number % 10;
            number = number / 10;

            if(digit % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}
