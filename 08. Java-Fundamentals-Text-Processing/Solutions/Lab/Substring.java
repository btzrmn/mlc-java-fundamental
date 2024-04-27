package Lab;

import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first = scan.nextLine();
        String second = scan.nextLine();

        while (second.contains(first)){

            second = second.replace(first, "");
        }
        System.out.println(second);
    }
}
