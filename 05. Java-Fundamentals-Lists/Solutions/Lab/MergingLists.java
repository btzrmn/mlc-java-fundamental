package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstLineNumbers = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondLineNumbers = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        int minListLength = Math.min(firstLineNumbers.size(), secondLineNumbers.size());
        for (int index = 0; index < minListLength; index++) {
            System.out.print(firstLineNumbers.get(index) + " "
                    + secondLineNumbers.get(index) + " ");
        }
        if (firstLineNumbers.size() > secondLineNumbers.size()) {
            printTheRest(firstLineNumbers, minListLength);
        } else {
            printTheRest(secondLineNumbers, minListLength);
        }
    }

    private static void printTheRest(List<Integer> list, int minListLength) {
        for (int index = minListLength; index < list.size(); index++) {
            System.out.print(list.get(index) + " ");
        }
    }
}
