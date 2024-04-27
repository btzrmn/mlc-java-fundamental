package HW;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commandLine = input.split("\\s+");
            String command = commandLine[0];


            switch (command) {
                case "swap":
                    int indexToSwap1 = Integer.parseInt(commandLine[1]);
                    int indexToSwap2 = Integer.parseInt(commandLine[2]);

                    Collections.swap(numbers,indexToSwap1 , indexToSwap2);

                    break;
                case "multiply":
                    int indexToMultiply1 = Integer.parseInt(commandLine[1]);
                    int indexToMultiply2 = Integer.parseInt(commandLine[2]);

                    int multiplyResult = numbers.get(indexToMultiply1) * numbers.get(indexToMultiply2);
                    numbers.set(indexToMultiply1, multiplyResult);

                    break;
                case "decrease":

                    for (int i = 0; i < numbers.size(); i++) {
                        int arrayElement = numbers.get(i);
                        arrayElement = arrayElement - 1;
                        numbers.set(i, arrayElement);
                    }
                    break;
            }


            input = scanner.nextLine();
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.print(numbers.get(i));
            }else {
                System.out.print(numbers.get(i) + "," + " ");
            }
        }
    }
}
