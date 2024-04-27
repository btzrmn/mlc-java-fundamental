package HW;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte people = Byte.parseByte(scanner.nextLine());
        byte capacity = Byte.parseByte(scanner.nextLine());

        double result = Math.ceil(1.0 * people / capacity);
        System.out.printf("%.0f", result);

    }
}
