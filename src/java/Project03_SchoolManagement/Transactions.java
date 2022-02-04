package java.Project03_SchoolManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transactions {

    private List <Person> listOfStudents = new ArrayList <>();
    private List <Person> listOfTeachers = new ArrayList<>();
    private String person;

    public void mainMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println(" STUDENT AND TEACHER MANAGEMENT PANEL");
        System.out.println("====================================");
        System.out.println("1- STUDENT OPERATIONS");
        System.out.println("2- TEACHER OPERATIONS");
        System.out.println("Q- END");
        String choose = scan.next().toUpperCase();

        if(choose.equals("Q")){
            End();
        }else if (choose.equals("1")){
            person = "STUDENT";
            action_Menu();
        }else if(choose.equals("2")) {
            person = "TEACHER";
            action_Menu();
        }else {
            System.out.println("INVALID INSERTION");
            mainMenu();
        }
    }

    private void action_Menu() {

        Scanner scan = new Scanner(System.in);
        System.out.println("============= OPERATIONS =============");
        System.out.println("1-ADD");
        System.out.println("2-SEARCH");
        System.out.println("3-SHOW");
        System.out.println("4-DELETE");
        System.out.println("5-MAIN MENU");
        System.out.println("Q-END\n");
        System.out.println("CHOOSEN:");
        String choose = scan.next().toUpperCase();

        switch(choose) {
            case "1":	add();
                break;
            case "2":	search();
                break;
            case "3":	show();
                break;
            case "4":	delete();
                break;
            case "5":	mainMenu();
                break;
            case "Q":	End();
                break;
            default: 	System.out.println("INVALID INSERTION");
                action_Menu();
                break;
        }
    }

    private void End() {
        System.out.println("BYE BYE ...");
    }

    private void add() {
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------- "+ person + " ADD ------------------");
        System.out.print("Name Surname:");
        String name_surname = scan.nextLine();
        System.out.print("Identification No:");
        String identification_number = scan.next();
        System.out.print("Year:");
        int year = scan.nextInt();

        if(person.equals("STUDENT")) {
            System.out.print("Class:");
            String clas = scan.next();
            System.out.print("School No:");
            String no = scan.next();
            Student student = new Student(name_surname,identification_number,year,no,clas);
            addPerson(student, listOfStudents);
        }else {
            System.out.print("REgistration Number:");
            String registration_number = scan.next();
            System.out.print("Section:");
            String section = scan.next();
            Teacher teacher = new Teacher(name_surname,identification_number,year,registration_number,section);
            addPerson(teacher,listOfTeachers);
        }
        action_Menu();
    }

    private void search(){

        Scanner scan = new Scanner(System.in);
        System.out.println("----------------- " + person + " Information ------------------");
        System.out.print("Search for identification :");
        String idetificationNumber = scan.next();
        if (person.equals("STUDENT")) {
            seachPersonByIdentificationNumber(idetificationNumber, listOfStudents);
        }else {
            seachPersonByIdentificationNumber(idetificationNumber, listOfTeachers);
        }
        action_Menu();
    }

    private void show() {
        List <Person> list;
        if (person.equals("STUDENT")) {
            list = listOfStudents;
        }else{
            list = listOfTeachers;
        }

        if(list.isEmpty()){
            System.out.println("There are no entries in the specified list");
        }else {
            System.out.println("************ "+ person + " LIST ************\n");
            for(Person w: list) {
                System.out.println(w);
            }
        }
        action_Menu();
    }

    private void delete() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Delete "+ person + " ID of person");
        String idStudent = scan.next();
        if (person.equals("STUDENT")) {
            deletePerson(idStudent, listOfStudents);
        }else {
            deletePerson(idStudent, listOfTeachers);
        }
        action_Menu();
    }
    private void deletePerson(String identification_number, List <Person> list) {
        for(Person w: list) {
            if(identification_number.equals(w.getIdentification_number()) ) {
                System.out.println(identification_number + " of "+ person +" deleted");
                return;
            }
        }
        System.out.println(identification_number + " of  "+ person +" not found");
    }

    private void addPerson(Person person, List <Person> liste) {

        for(Person w : liste) {
            if(person.getIdentification_number().equals(w.getIdentification_number()) ) {
                System.out.println(person.getIdentification_number() + " Person no. is registered to the system.");
                action_Menu();
            }
        }
        liste.add(person);
        System.out.println(person.getName_surname() + " is saved.");
    }

    private void seachPersonByIdentificationNumber(String no, List<Person> list) {

        for(Person w : list) {
            if(w.getIdentification_number().equals(no)) {
                System.out.println(w);
                return;
            }
        }
        System.out.println("No person found");
    }

    public void createTestPersons() {
        Student student1 = new Student("Kim Lo", "12345678",14,"123","9A");
        Student student2 = new Student("Natasha Keesin", "456889012",13,"456","8b");
        Student student3 = new Student("Pim Kerlk", "987654321",15,"567","12c");

        Teacher teacher1 = new Teacher("Jim Jerry", "4561236789",40,"Bioloji","O1234");
        Teacher teacher2 = new Teacher("Sandar klaas", "123490855",25,"Fysik","O456");

        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfTeachers.add(teacher1);
        listOfTeachers.add(teacher2);
    }
}
