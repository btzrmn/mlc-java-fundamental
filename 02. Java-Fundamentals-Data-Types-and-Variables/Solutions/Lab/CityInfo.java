package Lab;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        String population = scanner.nextLine();
        String area = scanner.nextLine();
        System.out.println("Town " +town+" has population of "+population+" and area "+area+" square km.");
    }
}
