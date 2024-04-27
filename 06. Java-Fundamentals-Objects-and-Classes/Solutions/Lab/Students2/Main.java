package Lab.Students2;

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

            if (isStudentExisting(classOfStudents, givenName, surName)){
                Student student = getExistingStudent(classOfStudents, givenName, surName);
                student.setGivenName(givenName);
                student.setSurName(surName);
                student.setAge(age);
                student.setTown(town);
            }else {
                Student student = new Student(givenName, surName, age, town);
                classOfStudents.add(student);
            }

            input = scanner.nextLine();
        }
        String town = scanner.nextLine();
        classOfStudents = classOfStudents.stream()
                .filter(student -> student.getTown().equals(town))
                .collect(Collectors.toList());
        printList(classOfStudents);
    }



    private static boolean isStudentExisting(List<Student> classOfStudents, String givenName, String surName) {
        for (Student student : classOfStudents) {
            if (student.getGivenName().equals(givenName) && student.getSurName().equals(surName)){
                return true;
            }
        }
        return false;
    }

    private static Student getExistingStudent(List<Student> classOfStudents, String givenName, String surName) {
        Student existingStudent = null;
        for (Student student : classOfStudents) {
            if (student.getGivenName().equals(givenName) && student.getSurName().equals(surName)){
                existingStudent = student;
            }
        }
        return existingStudent;
    }

    private static void printList(List<Student> classOfStudents) {
        for (Student student : classOfStudents) {
            System.out.println(student.toString());
        }
    }
}
