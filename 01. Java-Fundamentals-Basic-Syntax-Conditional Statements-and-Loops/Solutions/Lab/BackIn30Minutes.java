package Lab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours =Integer.parseInt(scanner.nextLine());
        int minutes=Integer.parseInt(scanner.nextLine());
        int TotalMinutes = hours*60+minutes+30;
        int rHours= TotalMinutes/60;
        int rMinutes=TotalMinutes%60;
        if (rHours>=24){
            rHours=0;
        }
        System.out.printf("%d:%02d",rHours,rMinutes);
    }
}
