package polymorphism;

public class RBIBankService {
    public double calculateInterest(int principleAmt){
        int duration = 3;
        double interest = (principleAmt*0.25*0.024);
        return interest;
    }
}
