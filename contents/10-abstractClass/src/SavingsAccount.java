public class SavingsAccount extends Account{
    double interestRate;

    public SavingsAccount(String holder, String number, int agency, double interestRate) {
        super(holder, number, agency);
        this.interestRate = interestRate;
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

    public void earnInterest(){
        doDeposit(getBalance()*interestRate);
    }
}
