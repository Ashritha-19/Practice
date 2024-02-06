package CreditBalance;

public class CardProcessing {
    Boolean login(CardDetails card) {
        System.out.println(card.hashCode());
        String localcardNumber = "1234 5678 9012";
        String localpinNumber = "1122";
        if (localcardNumber.equals(card.cardNumber) && localpinNumber.equals(card.pinNumber)){
         return true;
        }else {
                return false;
        }
    }
}
