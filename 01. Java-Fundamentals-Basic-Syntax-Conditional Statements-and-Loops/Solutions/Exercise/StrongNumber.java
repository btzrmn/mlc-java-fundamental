package HW;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int givenNumber = Integer.parseInt(scanner.nextLine());
        String stringGivenNumber = "" + givenNumber;

        int sumFactorial = 0;

        for (int i = 0; i <= stringGivenNumber.length() - 1; i++) {
            int currentNumber = Integer.parseInt("" + stringGivenNumber.charAt(i));

            int factorial = 1;

            for (int j = 1; j <= currentNumber; j++) {
                factorial = factorial * j;
            }
            sumFactorial = sumFactorial + factorial;
        }
        if (sumFactorial == givenNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
