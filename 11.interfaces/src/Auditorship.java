public class Auditorship {
    public static void main(String[] args) {
        Bank bank01 = new Bank();
        AuditorshipGenericBank auditor01 = new AuditorshipGenericBank();
        auditor01.toAudit(bank01);
    }
}
