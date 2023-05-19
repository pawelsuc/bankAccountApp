public class BankAccountApp {
    public static void main(String[] args) {
        Checking checkingAccount1 = new Checking("Pablo Picasso","123456789", 1500);
        Savings savingAccount1 = new Savings ("Rich Lowe", "123456789", 2500);
        checkingAccount1.showInfo();
        System.out.println("**********");
        savingAccount1.showInfo();
        savingAccount1.deposit(5000);
        savingAccount1.withdraw(200);
        savingAccount1.transfer("Brokerage", 3000);


//        Read a CSV File then create new accounts based on that data
    }
}