package cn.edu.henu.bll.flightserverimpl;

//import cn.edu.hcnu.bean.Flight;
//import cn.edu.hcnu.bll.IFlightServer;
import cn.edu.henu.bean.Flight;
import cn.edu.henu.bll.IFlightServer;
import cn.edu.henu.dao.IFlightDao;
import cn.edu.henu.dao.impl.FlightDaoIml;

import java.sql.SQLException;
import java.util.Set;

public class FlightServerImpl implements IFlightServer {
    IFlightDao flightDao;

    public FlightServerImpl() {
        this.flightDao = new FlightDaoIml();
    }

    @Override
    public void insertFlight(Flight flight) throws SQLException {

     //   System.out.println("界面传来的信息" + flight);
        flightDao.insertFlight(flight);
    }

    @Override
    public Set<Flight> getAllFlights() throws SQLException {

        return flightDao.getAllFlights();
    }

    @Override
    public Flight getFlightByformtime(String formtime) {
        return null;
    }

    @Override
    public Flight getFlightByform(String form) {
        return null;
    }

    @Override
    public Flight getFlightByto(String to) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
