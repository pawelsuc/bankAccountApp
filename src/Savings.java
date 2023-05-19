public class Savings extends Account {
//    List properties specific to the Savings account
    int safetyDepositBoxId;
    int safetyDepositBoxKey;

//    Constructor to initialize setting for the Saving properties

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        System.out.println("NEW SAVINGS ACCOUNT");
    }


//    List any methods specific to savings account

}
