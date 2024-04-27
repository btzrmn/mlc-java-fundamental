package HW;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numberList = Arrays
                .stream(sc.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = sc.nextLine();
        while (!input.equals("End")) {
            List<String> actions = Arrays
                    .stream(input
                            .split(" "))
                    .collect(Collectors.toList());
            String action = actions.get(0);

            switch (action) {
                case "Add":
                    int numberToAdd = Integer.parseInt(actions.get(1));
                    numberList.add(numberToAdd);
                    break;
                case "Insert":
                    int index = Integer.parseInt(actions.get(2));
                    if (isIndexValid(index, numberList.size())) {
                        int insert = Integer.parseInt(actions.get(1));
                        numberList.add(index, insert);


                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(actions.get(1));
                    if (isIndexValid(numberToRemove, numberList.size())) {
                        numberList.remove(numberToRemove);

                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    if (actions.get(1).equals("left")) {
                        int count = Integer.parseInt(actions.get(2));
                        for (int i = 1; i <= count; i++) {
                            int firstNumber = numberList.get(0);
                            numberList.add(firstNumber);
                            numberList.remove(0);
                        }

                    } else if (actions.get(1).equals("right")) {
                        int count = Integer.parseInt(actions.get(2));
                        for (int i = 1; i <= count; i++) {
                            int lastNumber = numberList.get(numberList.size() - 1);
                            numberList.add(0, lastNumber);
                            numberList.remove(numberList.size() - 1);
                        }
                    }
                    break;
            }
            input = sc.nextLine();
        }
        for (int number : numberList) {
            System.out.print(number + " ");
        }
    }

    public static boolean isIndexValid(int index, int sizeOfList) {

        return index >= 0 && index <= sizeOfList - 1;
    }
}
