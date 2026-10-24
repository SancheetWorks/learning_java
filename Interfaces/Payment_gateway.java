
import java.util.Scanner;

interface IPayment {

    void paymentProcess(double amount);

    void generateReceipt();
}

class NetBanking implements IPayment {

    String userID;

    public NetBanking(String userID) {
        this.userID = userID;
    }

    @Override
    public void paymentProcess(double amount) {
        System.out.println("Processing netbanking payment of Rs. " + amount + " using car number: " + userID);
    }

    @Override
    public void generateReceipt() {
        System.out.println("netbanking payment Receipt generated");
    }

}

class UPIPayment implements IPayment {

    String UPI_ID;

    public UPIPayment(String UPI_ID) {
        this.UPI_ID = UPI_ID;
    }

    @Override
    public void paymentProcess(double amount) {
        System.out.println("Processing UPI payment of Rs. " + amount + " using car number: " + UPI_ID);
    }

    @Override
    public void generateReceipt() {
        System.out.println("UPI payment Receipt generated");
    }

}

class CardPayment implements IPayment {

    String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void paymentProcess(double amount) {
        System.out.println("Processing card payment of Rs. " + amount + " using car number: " + cardNumber);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Card payment Receipt generated");
    }
}

class PaymentServices {

    private IPayment payment;

    public PaymentServices(IPayment payment) {
        this.payment = payment;
    }

    public void executePayment(double amount) {
        payment.paymentProcess(amount);
        payment.generateReceipt();
    }

}

public class Payment_gateway {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select payment method: 1. Card, 2. Upi, 3. netbanking");
        int choice = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        sc.nextLine();

        IPayment payment;

        switch (choice) {
            case 1:
                System.out.print("Enter card Number: ");
                String cardNumber = sc.nextLine();
                payment = new CardPayment(cardNumber);
                break;
            case 2:
                System.out.print("Enter Upi ID: ");
                String UPI_ID = sc.nextLine();
                payment = new UPIPayment(UPI_ID);
                break;
            case 3:
                System.out.print("Enter user ID: ");
                String userID = sc.nextLine();
                payment = new NetBanking(userID);
                break;

            default:
                System.out.println("Invaild choice");
                sc.close();
                return;

        }

        PaymentServices service = new PaymentServices(payment);
        service.executePayment(amount);
        sc.close();

    }
}
