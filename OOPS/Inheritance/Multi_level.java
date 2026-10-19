//Base class
class Account {

    String accountHolderName;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in " + accountHolderName + " account. New balance is: " + balance);
    }
}

//2nd Base Class
class SavingAccount extends Account {

    double interestRate;

    void applyInterest() {
        double interest = (balance * interestRate) / 100;
        balance += interest;
        System.out.println("Deposited " + interest + " in " + accountHolderName + " account. New balance is: " + balance);
    }
}

//Deriverd class
class PremiumSavingAccount extends SavingAccount {

    double cashBackRate;

    void applyCashback() {
        double cashback = (balance * cashBackRate) / 100;
        balance += cashback;
        System.out.println("Cashback deposited " + cashback + " in " + accountHolderName + " account. New balance is: " + balance);
    }
}

public class Multi_level {

    public static void main(String[] args) {
        
        PremiumSavingAccount obj2 = new PremiumSavingAccount();
        obj2.accountHolderName = "Sancheet";
        obj2.balance = 1000;

        obj2.cashBackRate = 7;
        obj2.applyCashback();
    }
}
