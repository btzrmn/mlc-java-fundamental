package HW;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int countSequence = 1;
        int countMaxSequence = 0;
        int maxSequenceInitial = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (i == numbers.length - 1) {
                break;
            }

            if (numbers[i] == numbers[i + 1]) {
                countSequence++;
            }else {
                countSequence = 1;
            }

            if (countSequence > countMaxSequence) {
                countMaxSequence = countSequence;
                maxSequenceInitial = numbers[i];
            }

        }
        for (int i = 0; i < countMaxSequence; i++) {
            System.out.print(maxSequenceInitial + " ");
        }
    }
}
