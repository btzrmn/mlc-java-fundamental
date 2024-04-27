package HW;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightSaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double sumWithoutBelts = Math.ceil(1.1 * students) * priceLightSaber + students * priceRobe;
        double beltSum = 0;
        if (students >= 6) {
            beltSum =  (students - Math.floor(students / 6)) * priceBelt ;
        } else {
            beltSum = students * priceBelt;
        }
        double sum = sumWithoutBelts + beltSum;
        if (amount >= sum) {
            System.out.printf("The money is enough - it would cost %.2f USD.", sum);
        } else {
            double neededMoney = sum - amount;
            System.out.printf("George Lucas will need %.2f USD more.", neededMoney);
        }
    }
}
