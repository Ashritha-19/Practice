package MovieTicket;

public class MovieTicket {
    private String id;
    private String password;
    private String movieName;
    private String time;
    private String seatNo;
    private String rowName;


    public MovieTicket(){

    }



    public MovieTicket(String id, String password, String movieName, String time, String seatNo, String rowName) {
        this.id = id;
        this.password = password;
        this.movieName = movieName;
        this.time = time;
        this.seatNo = seatNo;
        this.rowName = rowName;

    }
}
