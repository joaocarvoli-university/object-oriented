package class01;

public class SimpleTv {
    int volume;
    int channel;
    int volMax;
    int volMin;

    public SimpleTv(){
        this.volume = 0;
        this.channel = 0;
        this.volMax = 100;
        this.volMin = 0;
    }

    public void increaseVolume(){
        System.out.print("The previous volume is: " + this.volume + "\n");
        this.volume = this.volMax;
        System.out.print("The actual volume is: " + this.volume  + "\n");
    }

    public void decreaseVolume(){
        if(this.volume == 0){
            System.out.println("You cannot decrease the volume"  + "\n");
        }
        System.out.print("The previous volume is: " + this.volume + "\n");
        this.volume = this.volMin;
        System.out.print("The actual volume is: " + this.volume  + "\n");
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
