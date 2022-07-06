package banks;

import accounts.AccountAbstract;
import exceptions.InexistentAccount;
import exceptions.InsufficientBalance;
import interfaces.IBank;
import interfaces.IAccountsRepository;

public class GenericBank implements IBank {
    private final IAccountsRepository accounts;

    public GenericBank(IAccountsRepository accounts){
        this.accounts = accounts;
    }
    public void registerAccount(AccountAbstract account){
        accounts.toInsert(account);
        accounts.toRemove(account.getNumber());
    }
    public void debit(String number, double value) throws InsufficientBalance,InexistentAccount{
        AccountAbstract account = accounts.searchAccount(number);
        if(account != null){
            if(account.getBalance() >= value){
                account.doWithdraw(value);
            } else {
                throw new InsufficientBalance(number, value);
            }
        } else {
            throw new InexistentAccount(number);
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
