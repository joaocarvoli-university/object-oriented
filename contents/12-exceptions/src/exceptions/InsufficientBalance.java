package exceptions;

public class InsufficientBalance extends Exception{
    private final double balance;
    private final String number;

    public InsufficientBalance(String number, double balance){
        super("The balance is insufficient!");
        this.number = number;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getNumber() {
        return number;
    }
}
