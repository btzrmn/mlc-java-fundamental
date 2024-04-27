package Lab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());
        printPyramid(height);
    }

    private static void printPyramid(int height) {

        printTop(height);
        printBottom(height);
    }

    private static void printTop(int height) {
        for(int i = 1; i < height ;i++){
            printSingleLine(i);
        }
    }

    private static void printSingleLine(int length) {
        for(int i = 1; i <= length ;i++){
            System.out.print(i + " ");
        }
        System.out.println();

    }

    private static void printBottom(int height) {
        for(int i = height; i >= 1 ;i--){
            printSingleLine(i);

        }
    }

}
