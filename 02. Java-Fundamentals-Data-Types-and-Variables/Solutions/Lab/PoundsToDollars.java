package Lab;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double dolars = Double.parseDouble(scanner.nextLine());
        double pounds = dolars * 1.36;
        System.out.printf("%.3f", pounds);
    }
}
