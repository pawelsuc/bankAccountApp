public abstract class Account implements Rate {
    //    List common properties for saving and checking accounts
    String name;
    String sSN;
    double balance;
    String accountNumber;
    double rate;


//    Constructor to set base properties and initialize the account

    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        System.out.println("NAME: " + name + " SSN: " + sSN + " BALANCE: $" + balance);


//    List common methods

    }
}
