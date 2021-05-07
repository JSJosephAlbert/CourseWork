/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

public class Flight {
    private String airline;
    private String flightNum;
    private String origin;
    private String destination;
    private static int flightCount;

    public Flight() {
        airline = "default";
        flightNum = "default";
        origin = "default";
        destination = "default";
        flightCount++;
    }

    
    public Flight(String airline, String flightNum, String origin, String destination) {
        this.airline = airline;
        this.flightNum = flightNum;
        this.origin = origin;
        this.destination = destination;
        flightCount++;
    }

    public String getAirline() {
        return airline;
    }
    public void setAirline(String airline) {
        this.airline = airline;
    }
    public String getFlightNum() {
        return flightNum;
    }
    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public static int getFlightCount(){
        return flightCount;
    }

    @Override
    public String toString() {
        String output = "\nAirline: " + airline;
        output += "\nFlight Number: " + flightNum;
        output += "\nFlight Origin: " + origin;
        output += "\nFlight Destination: " + destination;
        return output;
    }
    
    
    
}
