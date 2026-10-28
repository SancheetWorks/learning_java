//Create a bank account class in which we want a deposit and widthdraw method with variables which are private i.e. balance and account holder name. Also use getter, setter and constructor

class BankAccount{
    private double balance;
    private String AccHolderName;

    public  BankAccount(double balance, String AccHolderName){
        this.balance = balance;
        this.AccHolderName = AccHolderName;
    }

    public String getAccHolderName(){
        return AccHolderName;
    }
    
    public double getbalance(){
        return balance;
    }

    void deposit(double amount){
        if (amount < 0 ){
            System.out.println("Cannot deposit less than 0.");
        }
        else{
            balance += amount;
            System.out.println("Rs. " + amount + " credited to " + AccHolderName + "'s account. Your current balance is " + balance + ".");
        }
    }

    void widthdraw(double amount){
        if (amount < 0 || amount > balance){
            System.out.println("You have Inputed the wrong details.");
        }
        else{
            balance -= amount;
            System.out.println("Rs. " + amount + " has been widthdrawl from " + AccHolderName + "'s account. your current balance is " + balance + ".");
        }
    }
}

public class Encapsulation_example {
    public static void main(String[] args) {
        BankAccount obj;
        obj = new BankAccount(1000.00, "Sancheet");
        obj.deposit(100);
        obj.widthdraw(50);
    }
}
