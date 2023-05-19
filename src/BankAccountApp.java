public class BankAccountApp {
    public static void main(String[] args) {
        Checking checkingAccount1 = new Checking("Pablo Picasso","123456789", 1500);
        Savings savingAccount1 = new Savings ("Rich Lowe", "123456789", 2500);

        savingAccount1.compound();

        checkingAccount1.showInfo();
        System.out.println("**********");
        savingAccount1.showInfo();



//        Read a CSV File then create new accounts based on that data
    }
}