package AjioOrder;

public class AjioTest {
    public static void main(String[]args){
       LoginProcess loginProcess = new LoginProcess();
       LoginDetails loginDetails = new LoginDetails();
       loginDetails.id = "Krish";
       loginDetails.password = "1234";
       boolean loginstatus = loginProcess.login(loginDetails);
       System.out.println(loginstatus);
       if (loginstatus){
           Payment payment = new Payment();
           Products products = new Products();
           products.book = 9;
           int itemsAdded = payment.items(products);
           System.out.println("Total Items:"+" "+itemsAdded);
       }
    }
}
