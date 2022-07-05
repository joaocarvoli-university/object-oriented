package class06;

public class RentRegistry {
    private Car car; // points to null
    private int valueRent;

    public void setCar(Car carReference) {this.car = carReference;} // now, the car variable points to the car from the Main function whose the reference was passed

    public void setValueRent(int value) {this.valueRent = value;}

    public int getValueRent() {return this.valueRent;}
}
