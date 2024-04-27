package HW;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printMatrix(number);
    }

    public static void printMatrix(int number) {
        int[][] matrix = new int[number][number];

        for (int rows = 0; rows < matrix.length; rows++) {
            for (int columns = 0; columns < matrix[rows].length; columns++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
