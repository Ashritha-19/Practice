package swiggyDemo;

public class PhonePayService implements PaymentService {
    int pin;
    int transactionId;
    int merchantId;
    int balance;

    public PhonePayService(int pin, int transactionId, int merchantId, int balance) {
        this.pin = pin;
        this.transactionId = transactionId;
        this.merchantId = merchantId;
        this.balance = balance;
    }

    public String phonePay(int totalAmt){
        int localPin=1234;
        int localTransactionId=5678;
        int localMerchantId=8765;
        if(localTransactionId==transactionId && localMerchantId==merchantId && localPin==pin){
            if(balance>=totalAmt){
                balance=balance-totalAmt;
                System.out.println(" Order Confirm "  +  " Remaining Balance: " +balance);
                return "Transaction SuccessFull";
        }else{
                return "Insufficient Balance";
            }
        }else{
            return "Wrong Pin";
        }
    }

    @Override
    public String paytm(int totalAmt) {
        return null;
    }
}
