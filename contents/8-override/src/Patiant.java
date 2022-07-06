public class Patiant extends Person {
    private String disease;
    private String medication;
    private boolean pain;
    private boolean discharged;

    public Patiant(String name, String address, int yearsOld, String cpf, String gender, String disease, String medication){
        super(name, address, yearsOld, cpf, gender);
        this.disease = disease;
        this.medication = medication;
    }

    public void setPain(){
        pain = true;
    }
    public void setNotPain(){
        pain = false;
    }
    public boolean isPain() {
        return pain;
    }
    public void receiveDischarged(){
        discharged = true;
    }
    public void denyDischarged(){
        discharged = false;
    }
    public boolean isDischarged(){
        return discharged;
    }
    @Override
    public String printValues(){
        String text;
        if(discharged){
            text = "The patient is on discharged!";
        } else {
            if(pain){
                text = "The patient is with " + disease + " disease, felling pain, taking the " + medication + " medication and it is at the hospital!";
            } else {
                text = "The patient is with " + disease + " disease, not felling with pain but it is at the hospital!";
            }
        }
        return super.printValues() + "\n" + text;
    }
}
