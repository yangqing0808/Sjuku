package cn.edu.henu.dao.impl;

import cn.edu.henu.bean.Flight;
import cn.edu.henu.dao.IFlightDao;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class FlightDaoIml<conn> implements IFlightDao {

    //private String DstinationAirPort;

    public void insertFlight(Flight flight) throws SQLException{
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
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

        pstmt.executeUpdate();
    }

    @Override
    public Set<Flight> getAllFlights() throws SQLException {
         Set<Flight>allFlights =new HashSet<Flight>();
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn= DriverManager.getConnection(url,username,password);
        //String sql="INSERT INTO flight VALUES(?,?,?,?,?,?,?)";
        String sql ="SELECT * FROM flight";
        PreparedStatement pstmt=conn.prepareStatement(sql);
        ResultSet rs=pstmt.executeQuery();

        while (rs.next()){
            String id=rs.getString("ID");
            String flightId=rs.getString("FLIGHT_ID");
            String planeType=rs.getString("PLANE_TYPE");
            int currentSeatsNum=rs.getInt("TOTAL_SEATS_NUM");
            String departureAirPort = rs.getString("DEPARTURE_AIRPORT");
            String destinationAirPort=rs.getString("DESTINATION_AIRPORT");
            String departureTime=rs.getString("DEPARTURE_TIME");


        //  String dstinationAirPort = null;
            Flight flight =new Flight(id,flightId,planeType,currentSeatsNum,departureAirPort,destinationAirPort,departureTime);
            allFlights.add(flight);
        }

        return allFlights;
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
