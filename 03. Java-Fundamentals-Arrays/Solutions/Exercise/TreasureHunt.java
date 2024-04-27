package HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialLoot = new ArrayList<>(List.of((scanner.nextLine().split("\\|"))));

        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];

            switch (command) {
                case "Loot":
                    for (int i = 1; i < commandLine.length; i++) {
                        String item = commandLine[i];
                        if (!initialLoot.contains(item)) {
                            initialLoot.add(0, item);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandLine[1]);
                    if (index >= 0 && index < initialLoot.size()) {
                        String itemToDrop = initialLoot.get(index);
                        initialLoot.remove(index);
                        initialLoot.add(itemToDrop);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandLine[1]);
                    if (count <= initialLoot.size()) {
                        List<String> subList = initialLoot.subList(initialLoot.size() - count, initialLoot.size());
                        System.out.println(String.join(", ",subList));

                        initialLoot.removeAll(subList);
                    }else {
                        System.out.println(String.join(", ",initialLoot));
                        initialLoot.clear();
                    }

                    break;
            }


            input = scanner.nextLine();
        }

        if (initialLoot.size() > 0) {
            double sum = 0;
            for (String item : initialLoot) {
                sum += item.length();
            }
            sum = sum / initialLoot.size();

            System.out.printf("Average treasure gain: %.2f pirate credits.", sum);
        }else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
