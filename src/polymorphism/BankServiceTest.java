package polymorphism;

public class BankServiceTest {
    public static void main(String[]args){
        SBIBankService sbiBankService = new SBIBankService();
        double sbibankInterest=sbiBankService.calculateInterest(10000,86);
        System.out.println("SBI Bank"+ sbibankInterest);

        HDFCBankService hdfcBankService = new HDFCBankService();
        double hdfcBankIntrest = hdfcBankService.calculateInterest(1000, 88);
        System.out.println("HDFC Bank"+ hdfcBankIntrest);
    }
}
