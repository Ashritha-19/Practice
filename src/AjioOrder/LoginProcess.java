package AjioOrder;

public class LoginProcess {
    public String id;
    public String password;
      boolean  login(LoginDetails loginDetails){
        String localId = "Krish";
        String localPassword = "1234";
        if(localId.equals(loginDetails.id) && localPassword.equals(loginDetails.password)){
            return true;
        }else {
            return false;
        }
    }
}
