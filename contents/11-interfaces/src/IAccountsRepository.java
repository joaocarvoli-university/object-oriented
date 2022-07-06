import java.util.ArrayList;

public interface IAccountsRepository {
    void toInsert(AccountAbstract account);
    void toRemove(String number);
    AccountAbstract searchAccount(String number);
    ArrayList<AccountAbstract> toList();
    int getNumber();

}
