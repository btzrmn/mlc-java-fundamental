package HW;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numberList = Arrays
                .stream(sc.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int removedElements = 0;

        while (numberList.size() > 0) {
            int index = Integer.parseInt(sc.nextLine());
            if (index < 0) {
                int elementOnTheFirstPosition = numberList.get(0);
                removedElements += elementOnTheFirstPosition;
                int elementOnTheLastPosition = numberList.get(numberList.size() - 1);
                numberList.set(0, elementOnTheLastPosition);
                listModificator(numberList, elementOnTheFirstPosition);
            } else if (index > numberList.size() - 1) {
                int elementOnTheFirstPosition = numberList.get(0);
                int elementOnTheLastPosition = numberList.get(numberList.size() - 1);
                removedElements += elementOnTheLastPosition;
                numberList.set(numberList.size() - 1, elementOnTheFirstPosition);
                listModificator(numberList, elementOnTheLastPosition);

            } else if (index >= 0 && index <= numberList.size() - 1) {
                int removedElement = numberList.get(index);
                removedElements += removedElement;
                numberList.remove(index);
                listModificator(numberList, removedElement);
            }
        }
        System.out.println(removedElements);
    }

    public static void listModificator(List<Integer> list, int removedElement) {
        for (int i = 0; i <= list.size() - 1; i++) {
            int currentNumber = list.get(i);
            if (currentNumber <= removedElement) {
                currentNumber += removedElement;
            } else {
                currentNumber -= removedElement;
            }
            list.set(i, currentNumber);
        }
    }
}
