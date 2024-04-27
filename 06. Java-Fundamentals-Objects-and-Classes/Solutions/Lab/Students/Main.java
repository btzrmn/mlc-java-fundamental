package Lab.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> classOfStudents = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("end")){
            String givenName = input.split("\\s+")[0];
            String surName = input.split("\\s+")[1];
            int age = Integer.parseInt(input.split("\\s+")[2]);
            String town = input.split("\\s+")[3];
            Student student = new Student(givenName, surName, age, town);
            classOfStudents.add(student);
            input = scanner.nextLine();
        }
        String town = scanner.nextLine();
        classOfStudents = classOfStudents.stream()
                .filter(student -> student.getTown().equals(town))
                .collect(Collectors.toList());
        printList(classOfStudents);
    }

    private static void printList(List<Student> classOfStudents) {
        for (Student student : classOfStudents) {
            System.out.println(student.toString());
        }
    }
}
