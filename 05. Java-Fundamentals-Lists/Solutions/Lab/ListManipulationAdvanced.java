package Lab;

import java.util.Arrays;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer :: parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            doCommandPerInput(input, integerList);
            input = scanner.nextLine();
        }
    }

    private static void doCommandPerInput(String input, List<Integer> integerList) {
        String[] inputSeparated = input.split(" ");
        switch(inputSeparated[0]) {
            case "Contains":
                checkIfNumberIsContained(Integer.parseInt(inputSeparated[1]), integerList);
                break;
            case "Print":
                switch (inputSeparated[1]) {
                    case "even":
                        printEvenElements(integerList);
                        break;
                    case "odd":
                        printOddElements(integerList);
                        break;
                }
                break;
            case "Get":
                printSumOfAllElements(integerList);
                break;
            case "Filter":
                filterPerCondition (integerList, inputSeparated[1], Integer.parseInt(inputSeparated[2]));
        }
    }

    private static void checkIfNumberIsContained(int number, List<Integer> integerList) {
        if (integerList.contains(number)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    private static void printEvenElements(List<Integer> integerList) {
        for (int element : integerList) {
            if (element % 2 == 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    private static void printOddElements(List<Integer> integerList) {
        for (int element : integerList) {
            if (element % 2 != 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    private static void printSumOfAllElements(List<Integer> integerList) {
        int sum = 0;
        for (int element : integerList) {
            sum += element;
        }
        System.out.println(sum);
    }

    private static void filterPerCondition(List<Integer> integerList, String condition, int number) {
        switch (condition) {
            case "<":
                for (int element : integerList) {
                    if (element < number) {
                        System.out.printf(element + " ");
                    }
                }
                break;
            case ">":
                for (int element : integerList) {
                    if (element > number) {
                        System.out.print(element + " ");
                    }
                }
                break;
            case ">=":
                for (int element : integerList) {
                    if (element >= number) {
                        System.out.print(element + " ");
                    }
                }
                break;
            case "<=":
                for (int element : integerList) {
                    if (element <= number) {
                        System.out.print(element + " ");
                    }
                }
                break;
        }
        System.out.println();
    }
}
