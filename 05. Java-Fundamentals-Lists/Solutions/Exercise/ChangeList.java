package HW;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ChangeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numberList = Arrays
                .stream(sc.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = sc.nextLine();

        while (!input.equals("end")) {
            List<String> actions = Arrays
                    .stream(input
                            .split(" "))
                    .collect(Collectors.toList());
            String action = actions.get(0);

            switch (action) {
                case "Delete":
                    for (int i = 0; i < numberList.size(); i++) {
                        int currentElement = numberList.get(i);
                        if (currentElement == Integer.parseInt(actions.get(1))) {
                            numberList.remove(i);
                            i = -1;
                        }
                    }
                    break;
                case "Insert":

                    numberList.add(Integer.parseInt(actions.get(2)), Integer.parseInt(actions.get(1)));
                    break;

            }
            input = sc.nextLine();
        }
        System.out.println(numberList.toString().replace("[", "").replace("]", "").replace(",", ""));
    }
}
