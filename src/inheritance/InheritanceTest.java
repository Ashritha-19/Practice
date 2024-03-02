package inheritance;

public class InheritanceTest {
    public static void main(String[]args){
        Account account = new RetailAccount("1234", 1000, true);
        System.out.println(account);
        Account account2= new Account("1234",1111,true);
        System.out.println(account2);
        Account account3 = new InsuranceAccount("1234",1111,true,"14th feb 2000");
        System.out.println(account3);
    }
}
