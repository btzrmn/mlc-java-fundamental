package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("(@|#)([A-z]{3,})\\1\\1([A-z]{3,})\\1");
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        List<String> strings = new ArrayList<>();
        while (matcher.find()) {
            count++;
            String group2 = matcher.group(2);
            String group3 = matcher.group(3);
            StringBuilder s = new StringBuilder(group2);
            if (group3.equals(s.reverse().toString())) {
                strings.add(group2 + " <=> " + group3);
            }
        }
        if (count > 0) {
            System.out.printf("%d word pairs found!\n", count);
        } else {
            System.out.println("No word pairs found!");
        }
        if (strings.size() > 0) {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", strings));
        } else {
            System.out.println("No mirror words!");
        }
    }
}
