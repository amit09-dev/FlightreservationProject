package ProjectFlightRes1;

public class Flight {
    //Declaring private variables....
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;
    //Parameterized constructor...

    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        //Using this keyword to initialize parameters of the constructor...

        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }
    //Getter...
    public String getFlightNumber() {
        return flightNumber;
    }
    //Setter...

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    //getter...
    public String getAirline() {
        return airline;
    }
    //Setter...
    public void setAirline(String airline) {
        this.airline = airline;
    }
    //getter...
    public int getCapacity() {
        return capacity;
    }
    //Setter...
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    //getter...
    public int getBookedSeats() {
        return bookedSeats;
    }
    //Setter...
    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    //Method to get flight details...
    public String getFlightDetails() {
        return "Flight No: " + flightNumber + ", Airline: " + airline +
                ", Capacity: " + capacity + ", Booked Seats: " + bookedSeats;
    }
    //boolean Method to check if flight tickets are available...
    public boolean checkAvailability() {
        return bookedSeats < capacity;
    }

    //method for finding the ticket booked...
    public void incrementBookingCounter() {
        bookedSeats++;
    }
}
