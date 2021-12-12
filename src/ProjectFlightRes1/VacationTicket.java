package ProjectFlightRes1;

import java.time.LocalDateTime;
////Using extends keywords since this class inherits from Ticket...
public class VacationTicket extends Ticket {

    //attributes...
    private String hotelAddress;
    private String[] selectedTouristLocation;
    //Parametrized constructor...
    public VacationTicket(String pnr, String from, String to, String departureDateTime,
                         String arrivalDateTime, String seatNo, float price, boolean cancelled,
                         Flight flight, Passenger passenger, String hotelAddress,
                         String[] selectedTouristLocation) {
        //using super keyword because we are using parent class attributes....
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled, flight, passenger);
        //using this keyword to initialize the attributes...
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }
    //getters....
    public String getHotelAddress() {
        return hotelAddress;
    }
    //setters....
    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
    //getters....
    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }
    //setters....
    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public void removeTouristLocation(String location) {
        int index=-1;
        for (int i=0; i<selectedTouristLocation.length; i++) {
            if (selectedTouristLocation[i].equals(location)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return;
        }
        for (int i=index; i< selectedTouristLocation.length-1; i++) {
            selectedTouristLocation[i] = selectedTouristLocation[i+1];
        }
        selectedTouristLocation[selectedTouristLocation.length-1] = null;
    }

    public void addTouristLocation(String location) {
        int index = -1;
        for (int i=0; i< selectedTouristLocation.length; i++) {
            if (selectedTouristLocation[i] == null) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            selectedTouristLocation[index] = location;
        }
    }
}