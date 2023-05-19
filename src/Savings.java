public class Savings extends Account {
    //    List properties specific to the Savings account
    int safetyDepositBoxId;
    int safetyDepositBoxKey;

//    Constructor to initialize setting for the Saving properties

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }


    //    List any methods specific to savings account
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println("Your Savings Account Features" + "\nSafety Deposit Box ID: " + safetyDepositBoxId +
                "\nSafety Deposit Box Key: " + safetyDepositBoxKey);

    }

}
