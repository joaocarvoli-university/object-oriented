package question03;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class Bank {
    private final ArrayList<Account> accounts;

    public Bank(){
        accounts = new ArrayList<>();
    }
    public void registerAccount(Account account){
        accounts.add(account);
    }
    private @Nullable Account searchAccount(int number){
        for (Account account: accounts){
            if(account.getNumber() == number) return account;
        }
        return null;
    }

    public void credit(int number, double value){
        Account account = searchAccount(number);
        if (account != null){
            account.doDeposit(value);
        }
        System.out.println("This account doesn't exists");
    }

    public void debit(int number, double value){
        Account account = searchAccount(number);
        if (account != null){
            account.doWithdraw(value);
        }
        System.out.println("This account doesn't exists");
    }

    public double getBalance(int number){
        Account account = searchAccount(number);
        if (account != null){
            return account.getBalance();
        }
        System.out.println("This account doesn't exists");
    }

    public void transfer(int from, int to, double value){
        Account accountFrom = searchAccount(from);
        Account accountTo = searchAccount(to);

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
}
