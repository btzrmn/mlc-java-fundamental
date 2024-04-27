package HW;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());

        double highestValue = Double.MIN_VALUE;
        short highestSnow = 0;
        short highestTime = 0;
        short highestQuality = 0;

        for (int i = 1; i <= n ; i++) {
            short snow = Short.parseShort(scanner.nextLine());
            short time = Short.parseShort(scanner.nextLine());
            byte quality = Byte.parseByte(scanner.nextLine());

            double value = Math.pow(1.0 * snow / time, quality);

            if (value > highestValue){
                highestValue = value;
                highestSnow = snow;
                highestTime = time;
                highestQuality = quality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", highestSnow, highestTime, highestValue, highestQuality);
    }
}
