package class06;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Car chevet = new Car();
        Car gol = new Car();
        Car hilux = new Car();

        chevet.setPlate("HBN-2329");
        chevet.setModel("Sedan");

        gol.setPlate("HBN-2329");
        gol.setModel("Hat");

        hilux.setPlate("HBN-3512");
        hilux.setModel("Hat");

        System.out.println("Which car do You wanna select?");
        int whichCar = Integer.parseInt(input.next());

        RentRegistry registry = new RentRegistry();
        switch (whichCar){
        case 1:
            registry.setCar(gol); // passing a object as a parameter
            System.out.println("You selected Gol car");
            break;
        case 2: 
            registry.setCar(chevet);
            System.out.println("You selected Chevet car");
            break;
        case 3: 
            registry.setCar(hilux);
            System.out.println("You selected Hilux car");
            break;
        // ...
        }

        System.out.println("How much did your rental car cost?");
        int costs = Integer.parseInt(input.next());
        input.close();
        registry.setValueRent(costs);
        System.out.println("Ok: R$" + registry.getValueRent());

        // System.out.println("The plates are equals? " + '\n' + chevet.equals(gol));
    }
}
