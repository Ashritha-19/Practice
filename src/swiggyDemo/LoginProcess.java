package swiggyDemo;


public class LoginProcess {
   public String userName;
    public String password;

    String login(LoginProcess details) {
        String localUserName = "Tech Junkies";
        String localpassword = "Neoteric";

        if (localUserName.equals(details.userName)  && localpassword.equals(details.password)){
            return "Login SuccessFull";
        }else{
            return "Wrong Credentials";
        }
    }
}