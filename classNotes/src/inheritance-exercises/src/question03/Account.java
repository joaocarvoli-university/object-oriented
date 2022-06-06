package question03;

public class Account {
    int number;
    double balance = 0;
    int agency;
    String holder;

    public Account(String holder, int number, int agency){
        this.holder = holder;
        this.number = number;
        this.agency = agency;
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
