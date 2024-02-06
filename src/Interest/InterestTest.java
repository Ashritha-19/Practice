package Interest;

public class InterestTest {
    public static void main(String[]args){
        Details details = new Details();
        details.principleAmount = 400000;
        details.rateOfInterest = 4;
        details.tenure = 3;
        Calculation calculation = new Calculation();
        calculation.interest(400000, 4, 3);
        System.out.println(calculation.interest(400000, 4, 3));
    }
}
