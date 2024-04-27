package HW;

import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int powerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        byte exhaustionFactorY = Byte.parseByte(scanner.nextLine());

        int targets = 0;
        int currentN = powerN;

        while (currentN >= distanceM){
            currentN -= distanceM;
            targets ++;
            if (currentN == 0.5 * powerN){
                if (exhaustionFactorY > 0){
                    currentN /= exhaustionFactorY;
                }
            }
        }
        System.out.println(currentN);
        System.out.println(targets);
    }
}
