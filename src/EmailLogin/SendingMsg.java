package EmailLogin;

public class SendingMsg {
    public String fromId;
    public String toId;

    public String sendMessage(String userName, String toUsername){
        String fromId ="ashripullabhatla@gmail.com";
        String toId ="ashupullabhatla1419@gmail.com";
        if(fromId.equals(userName) && toId.equals(toUsername)) {
            return "msg sent";
        }else {
            return "email is not correct";
        }
    }
}
