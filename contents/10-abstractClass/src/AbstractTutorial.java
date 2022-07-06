abstract class Dog {
    String breed;

    public void bark(){
        System.out.println("Bark!");
    }
    public abstract void poop();
}

class Chihuahua extends Dog{
    public void poop(){
        System.out.println("Dog pooped!");
    }
}

public class AbstractTutorial {
    public static void main(String[] args) {
        //Dog d = new Dog(); This type of class cannot be instanced
        //d.bark();

        Chihuahua c = new Chihuahua();
        c.bark();
        c.poop();
    }
}
