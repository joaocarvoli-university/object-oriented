interface WaterBottleInterface {
    String color = "blue";

    void fillUp();
    void pourOut();
}

public class InterfacesTutorial implements WaterBottleInterface {
    public static void main(String[] args) {
        System.out.println(color);
        InterfacesTutorial et = new InterfacesTutorial();
        et.fillUp();
    }

    @Override
    public void fillUp() {
        System.out.println("It is filled!");
    }

    @Override
    public void pourOut() {

    }
}
