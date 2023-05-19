public class Checking extends Account {
    //    List properties specific to a Checking account
    int debitCardNumber;
    int debitCardPin;

//    Constructor to initialize checking account properties

    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
    }


//    List any methods specific to the checking account
    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Checking");
    }
}
