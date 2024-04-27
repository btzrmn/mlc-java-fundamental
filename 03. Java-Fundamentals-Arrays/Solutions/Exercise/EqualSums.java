package HW;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isEqual = false;
        for (int i = 0; i < numbers.length; i++) {

            int leftSum = 0;
            for (int j = i - 1; j >= 0; j--) {
                leftSum = leftSum + numbers[j];
            }

            int rightSum = 0;
            for (int k = i + 1; k < numbers.length ; k++) {
                rightSum = rightSum + numbers[k];
            }

            if (leftSum == rightSum) {
                isEqual = true;
                System.out.println(i);
            }

        }
        if (!isEqual) {
            System.out.println("no");
        }
    }
}
