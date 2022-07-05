package class05;

public class TestLoop {
    int begin;
    int end;
    boolean order;

    public TestLoop(int initialInterval, int endInterval, boolean descending){
        this.begin = initialInterval;
        this.end = endInterval;
        this.order = descending;
    }

    public void implementingFor(){
        System.out.println("Starting for");
        if(this.order){
            for(int i = this.begin; i <= this.end; i++){
                System.out.println(i);
            }
        } else {
            for(int i = this.end; i >= this.begin; i--){
                System.out.println(i);
            }
        }
        System.out.println("Finishing for");
    }

    public void implementingWhile(){
        System.out.println("Starting while");
        if(this.order){
            int i = this.begin;
            while(i<=this.end){
                System.out.println(i);
                i++;
            }
        } else {
            int i = this.end;
            while(i>=this.begin){
                System.out.println(i);
                i--;
            }
        }
        System.out.println("Finishing while");
    }

    public void implementingDoWhile(){
        System.out.println("Starting do while");
        if(this.order){
            int i = this.begin;
            do{
                System.out.println(i);
                i++;
            }while(i<=this.end);
        } else {
            int i = this.end;
            do{
                System.out.println(i);
                i--;
            }while(i>=this.begin);
        }
        System.out.println("Finishing do while");
    }
}

