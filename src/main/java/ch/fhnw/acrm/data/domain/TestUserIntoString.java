package ch.fhnw.acrm.data.domain;

import java.sql.*;
import java.util.ArrayList;

import ch.fhnw.acrm.business.service.AgentService;
import ch.fhnw.acrm.data.repository.AgentRepository;

import org.springframework.stereotype.Service;

@Service
public class TestUserIntoString {



    AgentRepository agentRepository;
    AgentService agentService;
    public TestUserIntoString(AgentRepository agentRepository, AgentService agentService) {
        this.agentRepository = agentRepository;
        this.agentService = agentService;
        //public String a = agentRepository.toString();
    }





    void add(){
      agentService.getLocation();

    }


    public static void main(String[] args) {
        Agent agent = new Agent();

        //agent.toString();

        System.out.println(agent);
        System.out.println();


    }

public static void AddressString (){


        String url = "jdbc:postgresql://ec2-52-30-67-143.eu-west-1.compute.amazonaws.com:5432/db9gl717l6jetr";
        String uname = "trjjnfbrmizoql";
        String password = "909d7787c99319cdf1f1e15ed5329a2bcfed409371985741e3aa20d43534b7f0";
        String query = "select * from agent";

        String address = "";

        try {
            Connection con = DriverManager.getConnection(url, uname, password);
            System.out.println("Connected");
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                String streetname = "";
                String streetnumber = "";
                String postalcode = "";
                String city = "";

                for (int i = 1; i < 10; i++) {
                    streetname = result.getString(9);
                    streetnumber = result.getString(8);
                    postalcode = result.getString(7);
                    city = result.getString(6);
                }
       //         System.out.println("Location: " + streetname + streetnumber + "," + postalcode + city); //direct location from database


                ArrayList<String> AddressList = new ArrayList<String>();
                AddressList.add(streetname);
                AddressList.add(streetnumber + ",");
                AddressList.add(postalcode);
                AddressList.add(city);


                for (int x = 0; x < AddressList.size(); x++) {
                    address += AddressList.get(x);

                }
                System.out.println(address); //string output

            }

        } catch (SQLException e) {
            System.out.println("not connected");

        }
    }

//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public static String getAddress() {
//      AddressString();
//        return address;
//
//    }
}