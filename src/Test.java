public class Test {
    public static void main(String[]args){
        Ticket t1=new Ticket();
        TicketBooking t2=new TicketBooking();
      Ticket ticketOutput=  t2.booking("Balcony","OG","6:00",3);
      System.out.println(ticketOutput);
    }
}
