public class Person {
    private String name;
    private String address;
    private int yearsOld;
    private String cpf; // Person id on Brazil
    private String gender;
    private boolean walking;

    public Person(String name, String address, int yearsOld, String cpf, String gender){
        this.name = name;
        this.address = address;
        this.yearsOld = yearsOld;
        this.cpf = cpf;
        this.gender = gender;
    }

    public void toWalk(){
        walking = true;
    }

    public void toStop(){
        walking = false;
    }

    public boolean isWalking(){
        return walking;
    }
    public String printValues(){
        String text01, text02;
        if(gender.equals("M")){
            text01 = "The person name is: " + name + ", he is " + yearsOld + " years old.";
            text02 = "His id is: " + cpf + " and the address is: " + address;
        } else {
            text01 = "The person name is: " + name + ", she is " + yearsOld + " years old.";
            text02 = "Her id is: " + cpf + " and the address is: " + address;
        }
        return text01 + "\n" + text02;
    }
}
