import accounts.Account;
import banks.Bank;
import banks.GenericBank;
import exceptions.InexistentAccount;
import exceptions.InsufficientBalance;

public class Main {
    public static void main(String[] args) throws InexistentAccount, InsufficientBalance {
        Account ac01 = new Account("João Victor", "002", 60525);
        Bank bk01 = new Bank();
        bk01.registerAccount(ac01);

        try {
            bk01.credit("002", 100);
            bk01.debit("002", 50);
            bk01.debit("001", 100);
            bk01.debit("002", 1000);
        } catch (InexistentAccount ia){
            System.out.println(ia.getMessage());
            System.out.printf("The account %s doesn't exists.", ia.getNumber());
        } catch (InsufficientBalance ib){
            System.out.println(ib.getMessage());
            System.out.println("The balance is " + ib.getBalance());
        } /*finally {
            System.out.println("The operation was done!");
        }*/



        //GenericBank gb01 = new GenericBank();
        //gb01.accountsNumber();


    }
}