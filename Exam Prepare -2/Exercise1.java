package org.example;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("Reveal")) {
            String[] commands = command.split(":\\|:");
            switch (commands[0]) {
                case "InsertSpace":
                    int index = Integer.parseInt(commands[1]);
                    String subString1 = inputValue.substring(0, index); // "Test
                    String subString2 = inputValue.substring(index);
                    inputValue = subString1 + " " + subString2;
                    System.out.println(inputValue);
                    break;
                case "Reverse":
                    String subString = commands[1];
                    if (inputValue.contains(subString)) {
                        StringBuilder sb = new StringBuilder();
                        for (int i = subString.length() - 1; i >= 0; i--) {
                            sb.append(subString.charAt(i));
                        }
                        int firstIndex = inputValue.indexOf(subString);
                        String firstString = inputValue.substring(0, firstIndex);
                        String lastString = inputValue.substring(firstIndex + subString.length());
                        inputValue = firstString + lastString + sb;
                        System.out.println(inputValue);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String subStr = commands[1];
                    String replacement = commands[2];
                    inputValue = inputValue.replace(subStr, replacement);
                    System.out.println(inputValue);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", inputValue);
    }
}
