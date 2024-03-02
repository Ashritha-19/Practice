package inheritance;

public class InsuranceAccount extends Account {

    public  String dob;

    public InsuranceAccount(String accountNumber, int balance, boolean status, String dob) {
        super(accountNumber, balance, status);
        this.dob=dob;


    }

    @Override
    public String toString() {
        return "InsuranceAccount{" +
                "dob='" + dob + '\'' +
                '}';
    }
}