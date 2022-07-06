package accounts;

public abstract class AccountAbstract {
    protected String number;
    protected double balance;
    public AccountAbstract(String number){
        this.number = number;
        balance = 0;
    }
    public void doDeposit(double value){
        balance += value;
    }
    public abstract void doWithdraw(double value);

    public String getNumber(){
        return number;
    }
    public double getBalance(){
        return balance;
    }
}
