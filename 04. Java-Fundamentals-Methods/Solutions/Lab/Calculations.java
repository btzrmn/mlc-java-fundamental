package Lab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                getAddOf2numbers(num1, num2);
                break;
            case "multiply":
                getMultiplyOf2(num1, num2);
                break;
            case "subtract":
                getSubtractOf2(num1, num2);
                break;
            case "divide":
                getDivideOf2(num1, num2);
                break;
        }
    }

    private static void getAddOf2numbers(int num1, int num2) {

        System.out.println(num1 + num2);
    }

    private static void getMultiplyOf2(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    private static void getSubtractOf2(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    private static void getDivideOf2(int num1, int num2) {
        System.out.println(num1 / num2);
    }
}
