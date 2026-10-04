public class Technician extends Person{
    private int EmployeeID;
    private Speciality Speciality;

    public Technician() {
    }

    public Technician(String firstName, String lastName, String email, String login, String password, int employeeID, Speciality speciality) {
        super(firstName, lastName, email, login, password);
        EmployeeID = employeeID;
        Speciality = speciality;
    }

    @Override
    public String toString() {
        return "Technician{" +
                super.toString() +
                "EmployeeID=" + EmployeeID +
                ", Speciality=" + Speciality +
                '}';
    }
}
