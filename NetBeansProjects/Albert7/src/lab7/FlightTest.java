/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

public class FlightTest {
    public static void main(String[] args){
        Flight flight1 = new Flight();
        System.out.println(flight1);
        
        Flight flight2 = new Flight("UML", "U234", "Chicago", "London");
        System.out.println(flight2);
        
        Flight flight3 = new Flight("Java", "J817", "Atlanta", "Paris");
        System.out.println(flight3);
        
        System.out.println("\nTotal flights: " + Flight.getFlightCount());
    }
}
