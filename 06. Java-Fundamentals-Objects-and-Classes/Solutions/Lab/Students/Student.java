package Lab.Students;

public class Student {
    //fields
    private String givenName;
    private String surName;
    private int age;
    private String town;

    //constructor

    public Student(String givenName, String surName, int age, String town) {
        this.givenName = givenName;
        this.surName = surName;
        this.age = age;
        this.town = town;
    }

    public String getTown() {
        return town;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old", givenName, surName, age);
    }
}
