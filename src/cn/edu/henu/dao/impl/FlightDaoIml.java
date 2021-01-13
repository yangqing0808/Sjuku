package cn.edu.henu.dao.impl;

import cn.edu.henu.bean.Flight;
import cn.edu.henu.dao.IFlightDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

public class FlightDaoIml<conn> implements IFlightDao {
    
    public void insertFlight(Flight flight) throws SQLException{

        String url="jdbc:orcacle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn= DriverManager.getConnection(url,username,password);
        String sql="INSERT INTO flight VALUES(?,?,?,?,?,?,?)";

        PreparedStatement pstmt=conn.prepareStatement(sql);

        pstmt.setString(1,flight.getId());
        pstmt.setString(2,flight.getFlightId());
        pstmt.setString(3,flight.getPlanetype());
        pstmt.setInt(4,flight.getCurrentSeatsNum());
        pstmt.setString(5,flight.getDepartureAirPort());
        pstmt.setString(6,flight.getDstinationAirPort());
        pstmt.setString(7,flight.getDepartureTime());
        
        pstmt.executeLargeUpdate();
    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
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
