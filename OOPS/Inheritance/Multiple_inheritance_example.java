interface AccountOperation{

    void deposit(double amount);

}

interface LoanOperation{

    void ApplyLoan(double amount);
    
}

class SmartAccount implements AccountOperation, LoanOperation{

    String accountHolderName;
    double balance;

    SmartAccount(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }
    
    @Override 
    public void deposit(double amount){
        balance += amount;
        System.out.println("Rs. " + amount + " has been credited in " + accountHolderName + "'s account. Current balance is " + balance + ".");
    }

    @Override 
    public void ApplyLoan(double amount){
        balance += amount;
        System.out.println("Rs. " + amount + " has been given for loan in " + accountHolderName + "'s account. Current balance is " + balance + ".");
    }

}

public class Multiple_inheritance_example {
    public static void main(String[] args) {
        SmartAccount obj = new SmartAccount("Sancheet");
        obj.deposit(1000);
        obj.ApplyLoan(1500);
        
    }
}
