package Lab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        int sum=0;
        for (int i = 1; i <=number ; i++) {
            System.out.println(2*i-1);
            sum= 2*i-1+sum;
        }
        System.out.printf("Sum: %d",sum);
    }
}
