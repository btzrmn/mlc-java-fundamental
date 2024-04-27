package HW;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) { //{"1 2 3" "4 5 6""7  8"}
        Scanner sc = new Scanner(System.in);
        List<String> numberList = Arrays
                .stream(sc.nextLine()
                        .split("\\|"))
                .collect(Collectors.toList());

        Collections.reverse(numberList);

        System.out.println(numberList.toString().replace("[", "")
                .replace("]", "")
                .replaceAll(",", "")
                .trim()
                .replaceAll("\\s+", " "));
    }
}
