package HW;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 255;
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            int currentLiters = Integer.parseInt(scanner.nextLine());
            capacity -= currentLiters;
            if (capacity < 0){
                System.out.println("Insufficient capacity!");
                capacity += currentLiters;
            }
        }
        System.out.println(255 - capacity);
    }
}
