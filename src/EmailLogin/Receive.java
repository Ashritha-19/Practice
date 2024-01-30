package EmailLogin;


public class Receive {
    public static void main(String[]args) {
        GmailLogin gmailLogin =new GmailLogin();
        gmailLogin.userName="asrhipullabhatla@gmail.com";
        gmailLogin.password="Annaya@19";
        Credentials credentials =new Credentials();
        credentials.userName ="ashripullabhatla@gmail.com";
        credentials.password ="Annaya@19";
        SendingMsg sendingMsg =new SendingMsg();
        sendingMsg.fromId ="ashripullabhatla@gmail.com";
        sendingMsg.toId ="ashupullabhatla1419@gmail.com";
        Boolean loginstatus = gmailLogin.login(credentials);
        if (loginstatus) {
            System.out.println(sendingMsg.sendMessage("ashripullabhatla@gmail.com","ashupullabhatla1419@gmail.com"));
        }

    }
}
