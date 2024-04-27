package Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        removeNegatives(numbers);
        Collections.reverse(numbers);
        if (numbers.isEmpty()) {
            System.out.println("empty");
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void removeNegatives(List<Integer> numbers) {
        numbers.removeIf(number -> number < 0);
    }
}
