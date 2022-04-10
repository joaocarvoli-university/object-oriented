package class06;

public class Car {
    private String plate;
    private String model;
    static int CarsNumber;

    public Car() {CarsNumber++;}

    public void setPlate(String plate) {this.plate = plate;}

    public void setModel(String model) {this.model = model;}

    public String getPlate() {return this.plate;}

    public String getModel() {return this.model;}

    public boolean equals(Car carTwo) {return this.plate.equals(carTwo.getPlate());}
}