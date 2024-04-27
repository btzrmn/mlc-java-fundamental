package HW;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> threats = Arrays.stream(sc.nextLine()
                        .split(" "))
                .collect(Collectors.toList());
        String input = sc.nextLine();
        while (!input.equals("3:1")) {
            List<String> actions = Arrays
                    .stream(input
                            .split(" "))
                    .collect(Collectors.toList());
            String action = actions.get(0);

            switch (action) {
                case "merge":
                    int startIndex = Integer.parseInt(actions.get(1));
                    int endIndex = Integer.parseInt(actions.get(2));

                    if (startIndex < 0) {
                        startIndex = 0;
                    } if (endIndex > threats.size() - 1) {
                    endIndex = threats.size() - 1;
                }
                    boolean isValid = startIndex <= threats.size() - 1 && endIndex >= 0 && endIndex > startIndex;

                    if (isValid) {
                        String mergedString = "";
                        for (int i = startIndex; i <= endIndex; i++) {
                            String currentTextPosition = threats.get(i);
                            mergedString += currentTextPosition;
                        }
                        for (int i = startIndex; i <= endIndex; i++) {
                            threats.remove(startIndex);
                        }
                        threats.add(startIndex, mergedString);
                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(actions.get(1));
                    int partitions = Integer.parseInt(actions.get(2));
                    String divide = threats.get(index);
                    threats.remove(index);

                    int size = divide.length() / partitions;
                    int beginIndex = 0;
                    for (int i = 1; i < partitions; i++) {
                        threats.add(index, divide.substring(beginIndex, beginIndex + size));
                        index++;
                        beginIndex += size;
                    }
                    threats.add(index, divide.substring(beginIndex));
                    break;
            }
            input = sc.nextLine();
        }
        System.out.println(String.join(" ", threats));
    }
}

