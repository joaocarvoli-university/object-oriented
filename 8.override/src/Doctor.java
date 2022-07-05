public class Doctor extends Person {
    private int crm; // Doctor id on Brazil
    private double salary;
    private String specialization;
    private boolean working;

    public Doctor(String name, String address, int yearsOld, String cpf, String gender, int crm, double salary, String specialization){
        super(name, address, yearsOld, cpf, gender);
        this.crm = crm;
        this.salary = salary;
        this.specialization = specialization;
    }

    public void doShift(){ // Doctor's shift
        working = true;
    }
    public void stopShift(){ // Doctor's shift
        working = false;
    }
    public boolean onShift(){
        return working;
    }

    @Override
    public String printValues(){
        String text;
        text = "The Doctor id is: " + crm + ", its specialization is: " + specialization + " and the salary is: " + salary;
        return super.printValues() + "\n" + text;
    }

}
