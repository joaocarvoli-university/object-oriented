package question01;

public class Employee extends Person{
    String registration;
    double salary;
    String admissionDate;
    boolean onVacation;

    public Employee(String name, String address, int yearsOld, String gender, String registration, double salary, String admissionDate) {
        super(name, address, yearsOld, gender);
        this.registration = registration;
        this.salary = salary;
        this.admissionDate = admissionDate;
    }

    @Override
    public void toWalk() {
        super.toWalk();
    }

    public void goOnVacation(){
        this.onVacation = true;
    }
}
