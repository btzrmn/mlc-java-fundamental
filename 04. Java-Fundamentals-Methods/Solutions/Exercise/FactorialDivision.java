package HW;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int division = Integer.parseInt(scanner.nextLine());

        double factorialNumber = calculateFactorial(number);
        double factorialDivision = calculateFactorial(division);
        double result = factorialNumber / (factorialDivision);
        System.out.printf("%.2f", result);
    }

    public static long calculateFactorial(int number) {
        long factorial = 1;

        while(number > 0) {
            factorial = factorial * number;
            number--;
        }
        return factorial;
    }
}
