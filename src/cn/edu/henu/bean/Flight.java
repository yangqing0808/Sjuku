package cn.edu.henu.bean;

import java.util.*;
public class Flight {
    private String id;
    private String flightId;
    private String planetype;//飞机类型
    private int currentSeatsNum;//当前座位数
    private String departureAirPort;//出发地
    private String dstinationAirPort;//目的地
    private String departureTime;//起飞时间


    public Flight(String id, String flightId, String planetype, int currentSeatsNum, String departureAirPort, String dstinationAirPort, String departureTime) {
        this.id = id;
        this.flightId = flightId;
        this.planetype = planetype;
        this.currentSeatsNum = currentSeatsNum;
        this.departureAirPort = departureAirPort;
        this.dstinationAirPort = dstinationAirPort;
        this.departureTime = departureTime;
    }

    public Flight(Object flightId, String planetype, int dangqianSeatsNum, String form, String to, String formtime) {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getPlanetype() {
        return planetype;
    }

    public void setPlanetype(String planetype) {
        this.planetype = planetype;
    }

    public int getCurrentSeatsNum() {
        return currentSeatsNum;
    }

    public void setCurrentSeatsNum(int currentSeatsNum) {
        this.currentSeatsNum = currentSeatsNum;
    }

    public String getDepartureAirPort() {
        return departureAirPort;
    }

    public void setDepartureAirPort(String departureAirPort) {
        this.departureAirPort = departureAirPort;
    }

    public String getDstinationAirPort() {
        return dstinationAirPort;
    }

    public void setDstinationAirPort(String dstinationAirPort) {
        this.dstinationAirPort = dstinationAirPort;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id='" + id + '\'' +
                ", flightId='" + flightId + '\'' +
                ", planetype='" + planetype + '\'' +
                ", currentSeatsNum=" + currentSeatsNum +
                ", departureAirPort='" + departureAirPort + '\'' +
                ", dstinationAirPort='" + dstinationAirPort + '\'' +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }



}

