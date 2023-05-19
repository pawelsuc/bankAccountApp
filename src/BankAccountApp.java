import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        String file = "/home/pawelsuc/Pulpit/java/udemyTrustNsignCourses/Project3/NewBankAccounts.csv";
//        Checking checkingAccount1 = new Checking("Pablo Picasso","123456789", 1500);
//        Savings savingAccount1 = new Savings ("Rich Lowe", "123456789", 2500);
//
//        savingAccount1.compound();
//
//        checkingAccount1.showInfo();
//        System.out.println("**********");
//        savingAccount1.showInfo();

//        Read a CSV File then create new accounts based on that data




//        Read a CSV File then create new accounts based on that data
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for(String[] accountHolder : newAccountHolders) {
            System.out.println("NEW ACCOUNT: ");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);
        }
    }
}