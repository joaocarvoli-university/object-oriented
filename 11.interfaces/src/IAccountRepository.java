import java.util.ArrayList;

public interface IAccountRepository {
    void insert(AccountAbstract account);
    void remote(String numero);
    Account search(String numero);
    ArrayList<AccountAbstract> toList();
    int number();
}