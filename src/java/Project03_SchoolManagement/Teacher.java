package java.Project03_SchoolManagement;

public class Teacher extends Person {
    private String section;
    private String registration_number;

    public Teacher(String name_surname, String identification_number, int year, String section, String registration_number) {
        super(name_surname, identification_number, year);
        this.section = section;
        this.registration_number = registration_number;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }

    @Override
    public String toString() {
        return "NameSurName=" + getName_surname() + ", IdentificationNumber=" + getIdentification_number() + ", "
                + ", YEAR=" + getYear() + ", Section=" + section + ", Registration number=" + registration_number;
    }
}
