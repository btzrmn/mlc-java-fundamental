package HW;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double biggestVolume =Double.MIN_VALUE;
        String lastModel = "";

        for (int i = 1; i <= n ; i++) {

            String model = scanner.nextLine();
            double r = Double.parseDouble(scanner.nextLine());
            int h = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * r * r * h;

            if (volume > biggestVolume){
                biggestVolume = volume;
                lastModel = model;
            }
        }
        System.out.println(lastModel);
    }
}
