package Lab.Students2;

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

    public String getGivenName() {
        return givenName;
    }

    public String getSurName() {
        return surName;
    }

    public String getTown() {
        return town;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old", givenName, surName, age);
    }
}
