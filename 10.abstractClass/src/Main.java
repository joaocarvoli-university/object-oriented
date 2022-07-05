public class Main {
    public static void main(String[] args) {
        Bank central = new Bank();
        TaxAccount account01 = new TaxAccount("1");
        SpecialAccount account02 = new SpecialAccount("Amanda", "2", 39);
        SavingsAccount account03 = new SavingsAccount("Graça", "3", 12, 5);

        central.registerAccount(account01);
        account01.doDeposit(200);
        account02.doDeposit(100);
        account03.doDeposit(300);
        central.registerAccount(account02);
        central.registerAccount(account03);

        for(int i = 1; i < 4; i++){
            if(central.getBalance(String.valueOf(i)) == null){
                //String str = "The account %s doesn't exists".formatted(i);
                System.out.printf("The account %s doesn't exists\n", i);
            } else {
                System.out.printf("The balance of account %s is: %s\n", i, central.getBalance(String.valueOf(i)));
            }
        }
    }
}
