import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

public class Bank implements IBank{
    private final ArrayList<AccountAbstract> accounts;

    public Bank(){
        accounts = new ArrayList<>();
    }
    public void registerAccount(AccountAbstract account){
        accounts.add(account);
    }
    private @Nullable AccountAbstract searchAccount(String number){
        System.out.println(number);
        for (AccountAbstract account: accounts){
            if(account.getNumber().equals(number)) {
                return account;
            }
        }
        return null;
    }

    public void credit(String number, double value){
        AccountAbstract account = searchAccount(number);
        if (account != null){
            account.doDeposit(value);
        }
        System.out.println("This account doesn't exists");
    }

    public void debit(String number, double value){
        AccountAbstract account = searchAccount(number);
        if (account != null){
            account.doWithdraw(value);
        }
        System.out.println("This account doesn't exists");
    }

    public Object getBalance(String number){
        AccountAbstract account = searchAccount(number);
        if (account != null){
            return account.getBalance();
        }
        return null;
    }

    public void transfer(String from, String to, double value){
        AccountAbstract accountFrom = searchAccount(from);
        AccountAbstract accountTo = searchAccount(to);

        if (accountFrom != null){
            accountFrom.doWithdraw(value);
        } else {
            System.out.println("The account used to transfer doesn't exists!");
        }

        if (accountTo != null){
            accountTo.doDeposit(value);
        } else {
            System.out.println("The account used to receive doesn't exists!");
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
