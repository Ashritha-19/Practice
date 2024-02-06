package CreditBalance;

public class CardProcessTest {
    public static void main(String[]args){
        CardProcessing processing = new CardProcessing();
        CardDetails cardDetails = new CardDetails();
        cardDetails.cardNumber = "1234 5678 9012";
        cardDetails.pinNumber = "1122";
        System.out.println(cardDetails.hashCode());
        boolean loginstatus = processing.login(cardDetails);
        CreditService creditService = new CreditService();
        if (loginstatus){
            int balance = creditService.credit("1234 5678 9012",100);
            System.out.println(balance);
            System.out.println(" CreditService hashcode"+creditService.hashCode());
            int balance2 = creditService.credit("1234 5678 9012",100);
            System.out.println(" CreditService creditService2 hashcode"+creditService.hashCode());
            System.out.println(balance2);
        }
    }
}
