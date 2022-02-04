package java.Project03_SchoolManagement;

public class Main {
    public static void main(String[] args) {
        Transactions transaction = new Transactions();
        transaction.createTestPersons();
        transaction.mainMenu();
    }
}
