public class GenericBank implements IBank{
    private IAccountsRepository accounts;

    public GenericBank(IAccountsRepository accounts){
        this.accounts = accounts;
    }
    public void registerAccount(AccountAbstract account){
        accounts.toInsert(account);
    }
    public void debit(String number, double value){
        AccountAbstract account = accounts.searchAccount(number);
        if(account != null){
            account.doWithdraw(value);
        } else {
            System.out.println("This account doesn't exists");
        }
    }

    @Override
    public double totalBalance() {
        return 0;
    }

    @Override
    public int accountsNumber() {
        return 0;
    }
}
