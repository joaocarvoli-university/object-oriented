package question03;

public class SpecialAccount extends Account{
    double limit;
    public SpecialAccount(String holder, int number, int agency) {
        super(holder, number, agency);
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

    public void setLimit(double limit) {
        this.limit = limit;
    }
    public double getLimit(){
        return limit;
    }
}
