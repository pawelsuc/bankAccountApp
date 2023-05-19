public class Savings extends Account {
//    List properties specific to the Savings account
    int safetyDepositBoxId;
    int safetyDepositBoxKey;

//    Constructor to initialize setting for the Saving properties

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        System.out.println("NEW SAVINGS ACCOUNT");
    }


//    List any methods specific to savings account

}
