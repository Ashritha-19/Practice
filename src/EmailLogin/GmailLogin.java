package EmailLogin;

public class GmailLogin {
    public String userName;
    public String password;

    Boolean login(Credentials credentials){
        String localUserName ="ashripullabhatla@gmail.com";
        String localPassword ="Annaya@19";
        if(localUserName.equals(credentials.userName) && localPassword.equals(credentials.password)){
            return true;
        }else {
            return false;
        }
    }
}
