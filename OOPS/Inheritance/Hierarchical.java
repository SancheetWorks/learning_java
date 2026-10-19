//Base class

class Account {

    String accountHolderName;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in " + accountHolderName + " account. New balance is: " + balance);
    }
}

//1st Deriverd Class
class SavingAccount extends Account {

    double interestRate;

    void applyInterest() {
        double interest = (balance * interestRate) / 100;
        balance += interest;          //balance = balance + amount
        System.out.println("Deposited " + interest + " in " + accountHolderName + " account. New balance is: " + balance);
    }
}

//2nd Deriverd Class
class CurrentAccount extends Account {

    double overdraftlimit;

    void applyWithdraw(double amount) {
        if (amount <= overdraftlimit + balance) {
            balance -= amount;
            System.out.println("Withdrawl " + amount + " From " + accountHolderName + "'s Account. Current balance is " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class Hierarchical {

    public static void main(String[] args) {
        SavingAccount obj2 = new SavingAccount();
        CurrentAccount obj = new CurrentAccount();

        obj.accountHolderName = "Sancheet";
        obj.balance = 1000;
        obj.overdraftlimit = 1000;

        obj.applyWithdraw(2000);

        obj2.accountHolderName = "Sancheet";
        obj2.balance = 1000;
        obj2.interestRate = 5;
        obj2.applyInterest();
        
    }
}
