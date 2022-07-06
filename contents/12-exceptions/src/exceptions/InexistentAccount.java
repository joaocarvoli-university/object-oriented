package exceptions;

public class InexistentAccount extends Exception {
    private final String number;

    public InexistentAccount(String number){
        super("This account doesn't exists!");
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
