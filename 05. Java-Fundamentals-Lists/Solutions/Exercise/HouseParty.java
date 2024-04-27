package HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class HouseParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfCommands = Integer.parseInt(sc.nextLine());

        List<String> guests = new ArrayList<>();

        for (int i = 1; i <= countOfCommands; i++) {
            String actions = sc.nextLine();

            List<String> actionsParts = Arrays
                    .stream(actions.split(" "))
                    .collect(Collectors.toList());
            String name = actionsParts.get(0);
            if (actionsParts.size() == 3) {
                if (guests.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    guests.add(name);
                }
            } else if (actionsParts.size() == 4) {
                if (guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        for (String name : guests) {
            System.out.println(name);
        }
    }
}
