package HW;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        countVowels(string);
    }

    public static void countVowels(String string) {
        int counter = 0;

        for (int index = 0; index < string.length(); index++) {
            if(string.charAt(index) == 'a') {
                counter++;
            }else if(string.charAt(index) == 'o') {
                counter++;
            }else if(string.charAt(index) == 'e') {
                counter++;
            }else if(string.charAt(index) == 'i') {
                counter++;
            }else if(string.charAt(index) == 'u') {
                counter++;
            }else if(string.charAt(index) == 'A') {
                counter++;
            }else if(string.charAt(index) == 'O') {
                counter++;
            }else if(string.charAt(index) == 'E') {
                counter++;
            }else if(string.charAt(index) == 'I') {
                counter++;
            }else if(string.charAt(index) == 'U') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
