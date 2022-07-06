public class AuditorshipGenericBank {
    public void toAudit(IBank bank){
        if((bank.totalBalance() / bank.accountsNumber()) > 500){
            System.out.println("Approved!");
        } else {
            System.out.println("Unapproved");
        }
    }
}
