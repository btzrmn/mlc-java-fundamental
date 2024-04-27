package Lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valuesType = scanner.nextLine();
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        String getMaxValue = getMax(valuesType,input1, input2);
        System.out.println(getMaxValue);
    }

    private static String getMax(String valuesType, String input1, String input2) {
        switch(valuesType){
            case "int":
                int num1 = Integer.parseInt(input1);
                int num2 = Integer.parseInt(input2);
                if(num1 > num2){
                    return String.valueOf(num1);
                }else {
                    return String.valueOf(num2);
                }

            case "char":
                if(input1.charAt(0) > input2.charAt(0)){
                    return String.valueOf(input1);
                }else {
                    return String.valueOf(input2);
                }

            case "string":
                if(input1.compareTo(input2)>=0){
                    return input1;
                }else {
                    return input2;
                }
        }
        return null;
    }
}
