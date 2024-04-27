package HW;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> cardsOfTheFirstPlayer = Arrays
                .stream(sc.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> cardsOfTheSecondPlayer = Arrays
                .stream(sc.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (cardsOfTheFirstPlayer.size() != 0 && cardsOfTheSecondPlayer.size() != 0) {
            int firstPlayerCard = cardsOfTheFirstPlayer.get(0);
            int secondPlayerCard = cardsOfTheSecondPlayer.get(0);
            cardsOfTheFirstPlayer.remove(0);
            cardsOfTheSecondPlayer.remove(0);
            if (firstPlayerCard > secondPlayerCard) {
                cardsOfTheFirstPlayer.add(firstPlayerCard);
                cardsOfTheFirstPlayer.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                cardsOfTheSecondPlayer.add(secondPlayerCard);
                cardsOfTheSecondPlayer.add(firstPlayerCard);
            }
        }
        if (cardsOfTheFirstPlayer.size() == 0) {
            System.out.printf("Second player wins! Sum: %d", printSumOfTheCards(cardsOfTheSecondPlayer));

        } else if (cardsOfTheSecondPlayer.size() == 0) {
            System.out.printf("First player wins! Sum: %d", printSumOfTheCards(cardsOfTheFirstPlayer));

        }
    }

    public static int printSumOfTheCards(List<Integer> cardList) {
        int sum = 0;
        for (int card : cardList) {
            sum += card;

        }
        return sum;
    }
}
