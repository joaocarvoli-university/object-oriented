package class04;

public class Employee {
    String name;
    String address;
    int yearsOld;
    String gender;
    Boolean vacation;

    public Employee(String name, String address, int yearsOld, String gender) {
        this.name = name;
        this.address = address;
        this.yearsOld = yearsOld;
        this.gender = gender;
        this.vacation = false;
    }

    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public int getAge(){
        return this.yearsOld;
    }
    public String getGender(){
        return this.gender;
    }

    public void setOnVacation(){
        this.vacation = true;
    }
    public Boolean getOnVacation(){
        return this.vacation;
    }
}
