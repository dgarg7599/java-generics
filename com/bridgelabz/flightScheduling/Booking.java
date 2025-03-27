package com.bridgelabz.flightScheduling;

public class Booking<T> {
    private T bookingId;
    private Flight<?> flight;
    private String passengerName;

    public Booking( T bookingId, Flight<?> flight, String passengerName) {
        this.flight = flight;
        this.passengerName = passengerName;
        this.bookingId = bookingId;
    }

    public void displayBookingInfo(){
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Passenger Name: " + passengerName);
        flight.displayFlightInfo();
    }
}
