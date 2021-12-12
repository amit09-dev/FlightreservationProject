package ProjectFlightRes1;
//passenger class with attributes and methods.....
public class Passenger {

    //attributes...
    private static int idCounter = 0;
    private int id;
    //Static Address class...
    private static class Address {
        //attributes for address class....

        String passengerStreet, passengerCity, passengerState;


        Address(String passengerState, String passengerCity, String passengerStreet) {
            this.passengerStreet = passengerStreet;
            this.passengerCity = passengerCity;
            this.passengerState = passengerState;
        }
    }
    private Address address;
    //parameterized constructor....
    private static class Contact {
        String passengerName, passengerPhone, passengerEmail;

        Contact(String passengerName, String passengerPhone, String passengerEmail) {
            this.passengerName = passengerName;
            this.passengerPhone = passengerPhone;
            this.passengerEmail = passengerEmail;
        }
    }
    private Contact contact;
    //parameterized constructor for main class Passenger....

    public Passenger(String passengerStreet, String passengerCity, String passengerState, String passengerName, String passengerPhone, String passengerEmail) {
        this.id = ++idCounter;
        this.address = new Address(passengerStreet, passengerCity, passengerState);
        this.contact = new Contact(passengerName, passengerPhone, passengerEmail);
    }
    //getters..
    public int getId() {
        return this.id;
    }
    //setters...
    public String getAddressDetails() {
        return "Street: " + address.passengerStreet + ", City: " + address.passengerCity + ", State: " + address.passengerState;
    }
    //getters...
    public String getContactDetails() {
        return "Name: " + contact.passengerName + ", Phone: " + contact.passengerPhone + ", Email: " + contact.passengerEmail;
    }
    //static method to return number of passengers...
    public static int getPassengerCount() {
        return idCounter;
    }
}
