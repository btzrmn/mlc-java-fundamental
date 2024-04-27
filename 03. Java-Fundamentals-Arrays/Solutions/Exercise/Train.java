package HW;
import java.util.Scanner;
public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] countPeople = new int[n];

        int sum = 0;
        for (int i = 0; i < countPeople.length; i++) {
            countPeople [i] = Integer.parseInt(scanner.nextLine());
            sum += countPeople [i];
            System.out.print(countPeople [i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
