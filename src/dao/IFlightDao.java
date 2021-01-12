package dao;

import java.util.Set;

public interface IFlightDao<Flight> {
    void insertFlight(Flight flight);
    Set<Flight> getAllFlight();
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDepartureAirPort(String departureAirPort);
    Flight getFlightByDestinationAirPort(String destinationAirPort);
    void updateFlight(Flight flight);


}
