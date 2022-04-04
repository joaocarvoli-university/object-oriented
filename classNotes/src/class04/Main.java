package class04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name, address, gender;
        int yearsOld;
        name = input.nextLine();
        address = input.nextLine();
        yearsOld = Integer.parseInt(input.next());
        gender = input.next();

        Employee func01 = new Employee(name, address, yearsOld, gender);
        System.out.println("The name of employee is: " + func01.getName());
        System.out.println("The age of employee is: " + func01.getAge());
        System.out.println("The address of employee is: " + func01.getAddress());
        System.out.println("The gender of employee is: " + func01.getGender());
        func01.setOnVacation();
        if(func01.getOnVacation()){
            System.out.println("The employee is on vacation!");
        }
        else System.out.println("The employee isn't on vacation!");

    }
}
