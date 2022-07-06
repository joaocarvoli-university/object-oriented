package accounts;

public class Account extends AccountAbstract{
    private String holder;
    private int agency;

    public Account(String holder, String number, int agency){
        super(number);
        this.holder = holder;
        this.agency = agency;
    }
    @Override
    public void doWithdraw(double value) {
        balance -= value;
    }
}
