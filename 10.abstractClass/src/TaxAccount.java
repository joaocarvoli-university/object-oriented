public class TaxAccount extends AccountAbstract{

    public TaxAccount(String number) {
        super(number);
    }

    @Override
    public void doWithdraw(double value) {
        balance -= (value + (value * 0.001));
    }
}
