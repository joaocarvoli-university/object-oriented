import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Figure toDraw;
        Scanner input = new Scanner(System.in);
        System.out.println("Select the options: \n1 - Draw a circle \n2 - Draw a Rectangle \n3 - Draw a Square\n");
        System.out.println("Your option is: ");
        int option = Integer.parseInt(input.next());

        switch (option) {
            case 1 -> {
                toDraw = new Circle();
                toDraw.draw();
            }
            case 2 -> {
                toDraw = new Rectangle();
                toDraw.draw();
            }
            case 3 -> {
                toDraw = new Square();
                toDraw.draw();
            }
            default -> {
                toDraw = new Figure();
                toDraw.draw();
            }
        }
    }
}
