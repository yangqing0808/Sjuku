package cn.edu.henu.ui.Mainui;

//import cn.edu.hcnu.bean.Flight;
//import cn.edu.hcnu.bll.IFlightServer;
//import cn.edu.hcnu.bll.flightserverimpl.FlightServerImpl;
import cn.edu.henu.bean.Flight;
import cn.edu.henu.bll.IFlightServer;
import cn.edu.henu.bll.flightserverimpl.FlightServerImpl;
import sun.plugin2.os.windows.FLASHWINFO;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainUi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)

        {
            System.out.println("请输入相应的数字进行操作：");

            System.out.println("按1,录入航班信息");
            System.out.println("按2，航班信息显示");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，机票预定");
            System.out.println("按5，机票退订");
            System.out.println("按6，退出系统");

            int choice = sc.nextInt();

            if (choice == 1) {
                String id= UUID.randomUUID().toString().replace("-","");
                System.out.println(id);
                System.out.print("请输入航班ID：");
                String flightId=sc.next();
                System.out.print("请输入飞机类型：");
                String planetype=sc.next();
                System.out.print("请输入当前座位数：");
                int dangqianSeatsNum=sc.nextInt();
                System.out.print("请输入出发机场：");
                String form=sc.next();
                System.out.print("请输入目的机场：");
                String to=sc.next();
                System.out.print("请输入起飞时间：");
                String formtime=sc.next();

                Flight flight=new Flight(id,flightId,planetype,dangqianSeatsNum,form,to,formtime);

                IFlightServer iFlightServer=new FlightServerImpl();
                try{
                iFlightServer.insertFlight(flight);
                // iFlightServer.insertFlight(flight);

                }
                catch (SQLException e){
                  //  e.getMessage();
                    String errorMessage=e.getMessage();
                    //ORA-12899:value
                    String pattern = "(\\w+-\\d{5}):(\\s\\w+)+\\s_(\"\\w+\")\\.(\"\\w+\")\\.(\"\\w+\")";
                    Pattern r=Pattern.compile(pattern);

                    //现在创建matcher对象
                    Matcher m = r.matcher(errorMessage);
                    if (m.find()){
                        String tableName=m.group(4);
                        String columnName =m.group(5);
                        System.out.println((tableName + "的" + columnName + "的值过大，请仔细检查"));
                    }else {
                        System.out.println("No MATCH");
                    }

                }


            }else  if(choice==2){
                IFlightServer iFlightServer=new FlightServerImpl();
                try {
                    Set<Flight> allFlight =iFlightServer.getAllFlights();

                    for (Flight flight:allFlight){
                        System.out.print(flight);
                    }
                } catch ( SQLException e ) {
                    e.printStackTrace();
                }

            }

        }
    }
    }

