package HW;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double headsetTrash = Math.floor(lostGamesCount * 1.00 / 2);
        double mouseTrash = Math.floor(lostGamesCount * 1.00 / 3);
        double keyboardTrash = Math.floor(lostGamesCount * 1.00 / 6);
        double displayTrash = Math.floor(lostGamesCount * 1.00 / 12);

        double expenses = headsetTrash * headsetPrice + mouseTrash * mousePrice + keyboardTrash * keyboardPrice + displayTrash * displayPrice;
        System.out.printf("Rage expenses: %.2f USD.", expenses);

    }
}
