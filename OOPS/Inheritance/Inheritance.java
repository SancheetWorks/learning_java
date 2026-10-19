//Base class
class Account {

    String accountHolderName;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in " + accountHolderName + " account. New balance is: " + balance);
    }
}


//Deriverd Class
class SavingAccount extends Account{
    double interestRate;

    void applyInterest(){
        double interest = (balance * interestRate)/100;
        balance += interest;          //balance = balance + amount
        System.out.println("Deposited " + interest + " in " + accountHolderName + " account. New balance is: " + balance);
    }
}


//Main Class
public class Inheritance {

    public static void main(String[] args) {
   
        SavingAccount obj = new SavingAccount();
        obj.accountHolderName = "Sancheet";
        obj.balance = 1000;

        obj.deposit(1000);

        obj.interestRate = 5;
        obj.applyInterest();
        
    }
}
