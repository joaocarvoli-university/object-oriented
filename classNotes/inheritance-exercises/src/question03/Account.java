package question03;

public class Account {
    private final int number;
    private double balance = 0;
    private final int agency;
    String holder;

    public Account(String holder, int number, int agency){
        this.holder = holder;
        this.number = number;
        this.agency = agency;
    }

    public int getNumber(){
        return number;
    }

    public int getAgency(){
        return agency;
    }


    public void doDeposit(double value){
        balance += value;
    }
    public void doWithdraw(double value){
        if(balance < value){
            System.out.println("You don't have enough balance!");
        }
        balance -= value;
    }
    public double getBalance(){
        return balance;
    }

}
