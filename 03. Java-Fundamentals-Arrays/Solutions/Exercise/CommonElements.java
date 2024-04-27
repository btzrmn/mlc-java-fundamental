package HW;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] firstArrElements = scanner.nextLine().split(" ");
        String [] secondArrElements = scanner.nextLine().split(" ");

        for (int i = 0; i < secondArrElements.length; i++) {
            for (int j = 0; j < firstArrElements.length; j++) {
                if (firstArrElements[j].equals(secondArrElements[i])) {
                    System.out.print(firstArrElements[j] + " ");
                }
            }
        }
    }
}
