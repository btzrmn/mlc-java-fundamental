package Lab;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        if (0 <= age && age <= 18) {
            if ("Weekday".equals(type)) {
                sum = 12;
            } else if ("Weekend".equals(type)) {
                sum = 15;
            } else if ("Holiday".equals(type)) {
                sum = 5;
            }
        } else if (18 < age && age <= 64) {
            if ("Weekday".equals(type)) {
                sum = 18;
            } else if ("Weekend".equals(type)) {
                sum = 20;
            } else if ("Holiday".equals(type)) {
                sum = 12;
            }
        } else if (64 < age && age <= 122) {
            if ("Weekday".equals(type)) {
                sum = 12;
            } else if ("Weekend".equals(type)) {
                sum = 15;
            } else if ("Holiday".equals(type)) {
                sum = 10;
            }
        }
        if (age < 0 || age > 122) {
            System.out.println("Error!");
        } else {
            System.out.printf("%d$", sum);
        }
    }
}
