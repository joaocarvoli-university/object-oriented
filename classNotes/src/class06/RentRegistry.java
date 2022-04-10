package class06;

public class RentRegistry {
    Car car; // points to null
    int valueRent;

    public void setCar(Car carReference){
        this.car = carReference; // now, car points to the car from the Main function
    }

    public void setValueRent(int value){
        this.valueRent = value;
    }

    public int getValueRent(){
        return this.valueRent;
    }
}
