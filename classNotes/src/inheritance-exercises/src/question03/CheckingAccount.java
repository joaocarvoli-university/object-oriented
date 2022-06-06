package question03;

public class CheckingAccount extends Account{
    double tax;

    public CheckingAccount(String holder, int number, int agency, double tax) {
        super(holder, number, agency);
        this.tax = tax;
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public void doDeposit(double value) {
        super.doDeposit(value);
    }

    @Override
    public void doWithdraw(double value) {
        super.doWithdraw(value);
    }
}
