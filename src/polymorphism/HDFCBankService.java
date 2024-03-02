package polymorphism;

public class HDFCBankService extends RBIBankService {
    public double calculateInterest(int principleAmt) {
        double totalAmt = 0;
        double interestAmt = super.calculateInterest(principleAmt);
        totalAmt = interestAmt + principleAmt;
        return totalAmt;
    }

    public double calculateInterest(int principleAmt, int days) {
        double totalAmt = 0;
        if (days > 89) {
            totalAmt = this.calculateInterest(principleAmt);
        }
        return totalAmt+principleAmt;
    }
}
