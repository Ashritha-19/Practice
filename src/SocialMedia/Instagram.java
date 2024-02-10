package SocialMedia;

public class Instagram {
    private String userName;
    private String password;
    private long mobileNo;
    private String otp;
    public Instagram(String userName, String password) {
        this.userName = userName;
        this.password = password;
//        this.mobileNo = mobileNo;
//        this.otp = otp;
    }
    boolean login(String userName, String password){
        return (this.userName.equals(userName)&& this.password.equals(password));
    }

    public Instagram(long mobileNo, String otp) {
        this.mobileNo = mobileNo;
        this.otp = otp;
    }
    boolean login(long mobileNo, String otp){
        return (this.mobileNo== mobileNo&& this.otp.equals(otp));
    }
    public static void main(String[]args){
        Instagram instagram = new Instagram("Krish", "Annaya");
        boolean up = instagram.login("Krish", "Annaya");
        if(up!=false){
            System.out.println("Login Successful");
        }else{
            System.out.println("Login Unsuccessful");
        }
        boolean down = instagram.login("1234567890", "Annaya");
        if (down!= false){
            System.out.println("Login Successful");
        }else {
            System.out.println("Login Unsuccessful");
        }
    }
}
