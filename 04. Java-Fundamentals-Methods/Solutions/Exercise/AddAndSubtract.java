package HW;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int sum = sum(firstNumber, secondNumber);
        System.out.println(subtract(sum, thirdNumber));
    }

    public static int sum(int num1, int num2) {
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }

    public static int subtract(int sum, int num3) {
        int result = 0;
        result = sum - num3;
        return result;
    }
}
