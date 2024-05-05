package Exam;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            String[] commandList = command.split(" ");
            switch (commandList[0]) {
                case "TakeOdd":
                    password = takeOdd(password);
                    break;
                case "Cut":
                    password = cut(password, Integer.parseInt(commandList[1]), Integer.parseInt(commandList[2]));
                    break;
                case "Substitute":
                    password = substitute(password, commandList[1], commandList[2]);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + password);
    }

    static String takeOdd(String password) {
        StringBuilder newPassword = new StringBuilder();
        for (int i = 1; i < password.toCharArray().length; i += 2) {
            newPassword.append(password.charAt(i));
        }
        System.out.println(newPassword);
        return newPassword.toString();
    }

    static String cut(String password, int index, int length) {
        String newPassword = password.substring(0, index) + password.substring(index + length);
        System.out.println(newPassword);
        return newPassword;
    }

    static String substitute(String password, String substring, String substitute) {
        if (password.contains(substring)) {
            password = password.replace(substring, substitute);
            System.out.println(password);
        } else {
            System.out.println("Nothing to replace!");
        }
        return password;
    }
}