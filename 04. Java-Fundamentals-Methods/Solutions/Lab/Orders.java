package Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double total;
        total = totalPriceOfTheOrder(product, quantity);
        System.out.printf("%.2f", total);
    }

    private static double totalPriceOfTheOrder(String product, int quantity) {
        double totalPrice= 0;
        switch (product){
            case "coffee":
                totalPrice = quantity * 1.50;
                break;
            case "water":
                totalPrice = quantity * 1.00;
                break;
            case "coke":
                totalPrice = quantity * 1.40;
                break;
            case "snacks":
                totalPrice = quantity * 2.00;
                break;

        }

        return totalPrice;
    }
}
