package question03;

public class Main {
    public static void main(String[] args) {
        Bank central = new Bank();
        CheckingAccount account01 = new CheckingAccount("João Victor", 1, 39, 10);
        SpecialAccount account02 = new SpecialAccount("Amanda", 2, 39);
        SavingsAccount account03 = new SavingsAccount("Graça", 3, 12, 5);


        central.registerAccount(account01);
        central.registerAccount(account02);

        System.out.print("The balance of account 01 is: " + central.getBalance(1));
        System.out.print("The balance of account 02 is: " + central.getBalance(2));
        System.out.print("The balance of account 01 is: " + central.getBalance(3));

    }
}
