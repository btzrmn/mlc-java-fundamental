package HW;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        printSmallest(firstNumber, secondNumber, thirdNumber);
    }

    public static void printSmallest(int f, int s, int t) {
        if(f < s && f < t) {
            System.out.println(f);
        }else  if(s < f && s < t){
            System.out.println(s);
        }else {
            System.out.println(t);
        }
    }
}
