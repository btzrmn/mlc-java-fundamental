package HW;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);

        if(start > end) {
            char temp = start;
            start = end;
            end = temp;
        }
        printAsciInRange(start, end);
    }

    public static void printAsciInRange(char begin, char end) {
        begin++;
        for (char symbol = begin; symbol < end; symbol++) {
            System.out.print(symbol + " ");
        }
    }
}
