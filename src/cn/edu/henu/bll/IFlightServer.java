package cn.edu.henu.bll;

//import cn.edu.hcnu.bean.Flight;
import cn.edu.henu.bean.Flight;

import java.util.Set;

public interface IFlightServer {
    void insertFlight(Flight flight);
    Set<Flight> getAllFlights();
    Flight getFlightByformtime(String formtime);
    Flight getFlightByform(String form);
    Flight getFlightByto(String to);
    void updateFlight(Flight flight);
}
