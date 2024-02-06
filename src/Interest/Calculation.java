package Interest;

public class Calculation {
    public int interest(int principleAmount, int rateOfInterest, int tenure){
        int totalInterest = (principleAmount * rateOfInterest * tenure)/100;
        int finalAmount =  principleAmount + totalInterest;
        return finalAmount;

    }

}
