package ProjectFlightRes1;

public class Main {
    //Declaring main function...
    public static void main(String[] args) {

        //Instantiation of Objects of class NormalTicket & TouristTicket...
        NormalTicket regularTicket = new NormalTicket("25468", "Indore",
                "Delhi", "DepartureDateTime", "ArrivalDateTime",
                "5M", 9000, false, null, null, "lunch");

        VacationTicket Ticket = new VacationTicket("17391", "India", "Bali",
                "DepartureDateTime", "ArrivalDateTIme",
                "21A", 12000, false, null, null,
                "BALIinn", new String[]{""});

        printTicketDetails(regularTicket);
        printTicketDetails(Ticket);
    }
    //method creation which prints the ticket(PNR) details for the passenger...
    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }

}
