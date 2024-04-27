package HW;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numberList = Arrays
                .stream(sc.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int capacity = Integer.parseInt(sc.nextLine());

        String input = sc.nextLine();

        while (!input.equals("end")) {
            List<String> actions = Arrays
                    .stream(input
                            .split(" "))
                    .collect(Collectors.toList());
            String action = actions.get(0);

            if (action.equals("Add")) {
                numberList.add(Integer.parseInt(actions.get(1)));

            } else {

                int listSize = numberList.size();
                for (int i = 0; i < listSize; i++) {
                    int currentPassengers = numberList.get(i);
                    if (capacity >= Integer.parseInt(actions.get(0)) + currentPassengers) {
                        numberList.add(i, currentPassengers + Integer.parseInt(actions.get(0)));
                        numberList.remove(i + 1);
                        break;
                    }
                }
            }
            input = sc.nextLine();
        }

        System.out.println(numberList.toString().replace("[", "").replace("]", "").replace(",", ""));
    }
}
