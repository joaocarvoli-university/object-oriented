package class03;

public class Tv {
    int volume;
    int channel;
    int volMax;
    int volMin;
    boolean turned;
    static String brand = "Sambung";

    public Tv(){
        this.volume = 0;
        this.channel = 0;
        this.turned = false;
        this.volMax = 100;
        this.volMin = 0;
    }

    public void setTurnedOn(){
        System.out.println("Now your TV is turned on!");
        this.turned = true;
    }

    public void setTurnedOff(){
        System.out.println("Now your TV is turned of!");
        this.turned = false;
    }

    public void increaseVolume(){
        if(this.turned){
            System.out.print("The previous volume is: " + this.volume + "\n");
            this.volume = this.volMax;
            System.out.print("The actual volume is: " + this.volume  + "\n");
        }
        System.out.println("You need to turn on your Tv!");
    }

    public void decreaseVolume(){
        if(this.turned){
            if(this.volume == 0){
                System.out.println("You cannot decrease the volume"  + "\n");
            }
            System.out.print("The previous volume is: " + this.volume + "\n");
            this.volume = this.volMin;
            System.out.print("The actual volume is: " + this.volume  + "\n");
        }
        System.out.println("You need to turn on your Tv!");
    }

    public static void getBrand(){
        System.out.println(brand);
    }

    public void increaseChannel(){
        System.out.print("The previous channel is: " + this.channel + "\n");
        this.channel = channel + 1;
        System.out.print("The actual channel is: " + this.channel  + "\n");
    }

    public void decreaseChannel(){
        if(this.channel == 0){
            System.out.println("You cannot decrease the volume"  + "\n");
            return;
        }
        System.out.print("The previous channel is: " + this.channel + "\n");
        this.channel = channel - 1;
        System.out.print("The actual channel is: " + this.channel  + "\n");
    }
}