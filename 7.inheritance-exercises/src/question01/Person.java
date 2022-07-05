package question01;

public class Person {
    String name;
    String address;
    int yearsOld;
    String gender;


    public Person(String name, String address, int yearsOld, String gender){
        this.name = name;
        this.address = address;
        this.yearsOld = yearsOld;
        this.gender = gender;
    }

    public void toWalk(){
        System.out.println(name + " walked!");
    }

}
