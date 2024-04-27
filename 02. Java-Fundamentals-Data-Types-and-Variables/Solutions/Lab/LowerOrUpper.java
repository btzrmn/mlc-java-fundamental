package Lab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char Char = scanner.nextLine().charAt(0);
        if(Char > 96){
            System.out.println("lower-case");
        } else
            System.out.println("upper-case");
    }
}
