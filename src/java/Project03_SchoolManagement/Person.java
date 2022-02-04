package java.Project03_SchoolManagement;

public class Person {

    private String name_surname;
    private String identification_number;
    private int year;

    public Person() {
    }

    public Person(String name_surname, String identification_number, int year) {
        this.name_surname = name_surname;
        this.identification_number = identification_number;
        this.year = year;
    }

    public String getName_surname() {
        return name_surname;
    }

    public void setName_surname(String name_surname) {
        this.name_surname = name_surname;
    }

    public String getIdentification_number() {
        return identification_number;
    }

    public void setIdentification_number(String identification_number) {
        this.identification_number = identification_number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
