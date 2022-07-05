package question02;
import question01.Employee;


public class EmployeeExecutive extends Employee{
    int amountOfSubordinateEmployees;
    double benefits;

    public EmployeeExecutive(String name, String address, int yearsOld, String gender, String registration, double salary, String admissionDate) {
        super(name, address, yearsOld, gender, registration, salary, admissionDate);
    }
}
