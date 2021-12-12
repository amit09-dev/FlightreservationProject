package ProjectFlightRes1;

import java.time.LocalDateTime;//Importing Package LocalDateTime for Local Date & Time....

//Declarations of abstract class...
    public abstract class Ticket {
    //variable declarations...
        private String pnr;
        private String from;
        private String to;
        private String departureDateTime;
        private String arrivalDateTime;
        private String seatNo;
        private float price;
        private boolean cancelled;
        private Flight flight;
        private Passenger passenger;
    //Parametrized constructor...
        public Ticket(String pnr, String from, String to, String departureDateTime,
                      String arrivalDateTime, String seatNo, float price, boolean cancelled,
                      Flight flight, Passenger passenger) {
            //using this keyword to initialize....
            this.pnr = pnr;
            this.from = from;
            this.to = to;
            this.departureDateTime = departureDateTime;
            this.arrivalDateTime = arrivalDateTime;
            this.seatNo = seatNo;
            this.price = price;
            this.cancelled = cancelled;
            this.flight = flight;
            this.passenger = passenger;
        }
    //checking status of cancelled tickets...
        public String checkStatus() {
            return cancelled ? "Cancelled" : "Confirmed";
        }
    //using Package LocalDateTime to determine the date and time of the flight...
        public int getFlightDuration() {
            LocalDateTime departureLocalDateTime = LocalDateTime.parse(departureDateTime);
            LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(arrivalDateTime);
            return (arrivalLocalDateTime.getDayOfMonth() - departureLocalDateTime.getDayOfMonth()) * 24 +
                    (arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());
        }

        public void cancel() {
            cancelled = true;
        }
    //getter methods...
        public String getPnr() {
            return pnr;
        }
    //setter methods...
        public void setPnr(String pnr) {
            this.pnr = pnr;
        }
    //getter methods...
        public String getFrom() {
            return from;
        }
    //setter methods...
        public void setFrom(String from) {
            this.from = from;
        }
    //getter methods...
        public String getTo() {
            return to;
        }
    //setter methods...
        public void setTo(String to) {
            this.to = to;
        }
    //getter methods...
        public String getDepartureDateTime() {
            return departureDateTime;
        }
    //setter methods...
        public void setDepartureDateTime(String departureDateTime) {
            this.departureDateTime = departureDateTime;
        }
    //getter methods...
        public String getArrivalDateTime() {
            return arrivalDateTime;
        }
    //setter methods...
        public void setArrivalDateTime(String arrivalDateTime) {
            this.arrivalDateTime = arrivalDateTime;
        }
    //getter methods...
        public String getSeatNo() {
            return seatNo;
        }
    //setter methods...
        public void setSeatNo(String seatNo) {
            this.seatNo = seatNo;
        }
    //getter methods...
        public float getPrice() {
            return price;
        }
    //setter methods...
        public void setPrice(float price) {
            this.price = price;
        }
    //getter methods...
        public boolean isCancelled() {
            return cancelled;
        }
    //setter methods...
        public void setCancelled(boolean cancelled) {
            this.cancelled = cancelled;
        }
    //getter methods...
        public Flight getFlight() {
            return flight;
        }
    //setter methods...
        public void setFlight(Flight flight) {
            this.flight = flight;
        }
    //getter methods...
        public Passenger getPassenger() {
            return passenger;
        }
    //setter methods...
        public void setPassenger(Passenger passenger) {
            this.passenger = passenger;
        }
    }

