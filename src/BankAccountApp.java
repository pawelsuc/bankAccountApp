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
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " " + sSN + " " + accountType + " " + initDeposit);
            if(accountType.equals("Savings")) {
                System.out.println("OPEN A SAVINGS ACCOUNT");
            }
            else if (accountType.equals("Checking")) {
                System.out.println("OPEN A CHECKING ACCOUNT");
            }
            else {
                System.out.println("ERROR");
            }
        }
    }
}