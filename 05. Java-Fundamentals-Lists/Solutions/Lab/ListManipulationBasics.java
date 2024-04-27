package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());
        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        while (!command.contains("end")) {
            //Add {number}: add a number to the end of the list
            if (command.contains("Add")) {
                int lastNumber = Integer.parseInt(command.get(1));
                addLastNumber(numbers, lastNumber);
                //Remove {number}: remove a number from the list
            } else if (command.contains("Remove")) {
                int numberToRemove = Integer.parseInt(command.get(1));
                removeNumber(numbers, numberToRemove);
                //RemoveAt {index}: remove a number at a given index
            } else if (command.contains("RemoveAt")) {
                int numberAtIndex = Integer.parseInt(command.get(1));
                removeAt(numbers, numberAtIndex);
                //Insert {number} {index}: insert a number at a given index
            } else if (command.contains("Insert")) {
                int numberToInsert = Integer.parseInt(command.get(1));
                int indexToInsert = Integer.parseInt(command.get(2));
                insertAtIndex(numbers, numberToInsert, indexToInsert);
            }
            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void insertAtIndex(List<Integer> numbers, int numberToInsert, int indexToInsert) {
        numbers.add(indexToInsert, numberToInsert);
    }

    private static void removeAt(List<Integer> numbers, int numberAtIndex) {
        numbers.remove(numberAtIndex);
    }

    private static void removeNumber(List<Integer> numbers, int numberToRemove) {
        numbers.remove(Integer.valueOf(numberToRemove));
    }

    private static void addLastNumber(List<Integer> numbers, int number) {
        int lastIndex = numbers.size();
        numbers.add(lastIndex, number);
    }
}
