package Lab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = area(width, height);
        System.out.printf("%.0f", area);
    }
    static double area(double width, double height) {
        return width * height;
    }
}
