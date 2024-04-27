package HW;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int possibleYield = Integer.parseInt(scanner.nextLine());
        int inStore = 0;
        int days = 0;

        while (possibleYield >= 100){
            days ++;
            inStore += possibleYield - 26;
            possibleYield -= 10;
        }
        if (inStore >= 26){
            inStore -= 26;
        }else{
            inStore = 0;
        }
        System.out.println(days);
        System.out.println(inStore);
    }
}
