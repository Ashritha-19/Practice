package swiggyDemo;

public class PaytmService implements PaymentService {
    int pin;
    int transactionId;
    int merchantId;
    int balance;


    @Override
    public String phonePay(int totalAmt) {
        return null;
    }

    public String paytm(int totalAmt) {
        int localPin = 1234;
        int localTransactionId = 5678;
        int localMerchantId = 8765;
        if (localTransactionId == transactionId && localMerchantId == merchantId && localPin == pin) {
            if (balance >= totalAmt) {
                balance = balance - totalAmt;
                System.out.println(" Order Confirm " + " Remaining Balance: " + balance);
                return "Transaction SuccessFull";
            } else {
                return "Insufficient Balance";
            }
        } else {
            return "Wrong Pin";
        }
    }
}