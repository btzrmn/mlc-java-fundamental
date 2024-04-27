package HW;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentNum = a;

        while (currentNum > 0){
            int currentDigit = currentNum % 10;
            sum += currentDigit;
            currentNum /= 10;
        }
        System.out.println(sum);
    }
}
