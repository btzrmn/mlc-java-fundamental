package Lab;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        String symbol = scanner.nextLine();
        double num2 = Double.parseDouble(scanner.nextLine());

        double result = getCalculatedSum(num1,symbol,num2);
        System.out.printf("%.0f",result);
    }

    private static double getCalculatedSum(double num1, String symbol,double num2) {
        double result = 0;

        switch(symbol){
            case "*":
                result = num1 * num2;
                return result;
            case"+":
                result = num1 + num2;
                return result;
            case "/":
                result = num1 / num2;
                return result;
            case "-":
                result = num1 - num2;
                return result;
        }
        return result;
    }
}
