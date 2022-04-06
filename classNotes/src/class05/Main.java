package class05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Which is the initial number ?" + "\n");
        int initialInterval = Integer.parseInt(input.next());

        System.out.println("Which is the final number ?" + "\n");
        int endInterval = Integer.parseInt(input.next());

        System.out.println("Is the order descending?" + "\n" + "Digit 'true' for yes and 'not' for no" + "\n");
        boolean descending = Boolean.parseBoolean(input.next());

        TestLoop loop = new TestLoop(initialInterval, endInterval, descending);
        loop.implementingFor();
        loop.implementingWhile();
        loop.implementingDoWhile();
    }
}
