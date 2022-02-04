package java.Project03_SchoolManagement;

public class Student extends Person {
    private String no;
    private String clas;

    public Student(String name_surname, String identification_number, int year, String no, String clas) {
        super(name_surname, identification_number, year);
        this.no = no;
        this.clas = clas;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    @Override
    public String toString() {
        return "Name/Surname=" + getName_surname() + ", Identification number=" + getIdentification_number() + ", Year =" + getYear() + " No=" + no + ", Class=" + clas;
    }
}
