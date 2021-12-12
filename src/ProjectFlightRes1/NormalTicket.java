package ProjectFlightRes1;

import java.time.LocalDateTime;

//Using extends keyword since this class inherits from Ticket...
    public class NormalTicket extends Ticket {
        private String specialServices;

    //Parameterized constructor...
        public NormalTicket(String pnr, String from, String to, String departureDateTime,
                             String arrivalDateTime, String seatNo, float price, boolean cancelled,
                             Flight flight, Passenger passenger, String specialServices) {
            //using super keyword because we are using parent class attributes....

            super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled,
                    flight, passenger);
            //using this keyword...
            this.specialServices = specialServices;
        }
        //getters...
        public String getSpecialServices() {
            return specialServices;
        }
        //setters...
        public void setSpecialServices(String specialServices) {
            this.specialServices = specialServices;
        }
}
