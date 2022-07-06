package class02;

public class Calculator {
    double value;

    public Calculator(){
        this.value = 0;
        System.out.println("The actual value is: " + this.value + "\n");
    }

    public void sum(double newValue){
        System.out.println(this.value + "+" +  newValue);
        this.value = value + newValue;
        System.out.println("The result is: " + this.value + "\n");
    }

    public void sub(double newValue){
        System.out.println(this.value + "-" +  newValue);
        this.value = value - newValue;
        System.out.println("The result is: " + this.value + "\n");
    }

    public void mul(double newValue){
        System.out.println(this.value + "*" +  newValue);
        this.value = value*newValue;
        System.out.println("The result is: " + this.value + "\n");
    }

    public void div(double newValue){
        System.out.println(this.value + "/" +  newValue);
        this.value = value/newValue;
        System.out.println("The result is: " + this.value + "\n");
    }

}
