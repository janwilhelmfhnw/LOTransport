package ch.fhnw.acrm.data.domain;


import java.sql.*;

//Author: Kenan Ahmetasevic

public class ProductData {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://ec2-52-30-67-143.eu-west-1.compute.amazonaws.com:5432/db9gl717l6jetr";
        String uname = "trjjnfbrmizoql";
        String password = "909d7787c99319cdf1f1e15ed5329a2bcfed409371985741e3aa20d43534b7f0";
        String query = "select * from product";


        try {
            Connection con = DriverManager.getConnection(url, uname, password);
            System.out.println("Connected");
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                String palletSize = "";
                String price = "";

                for (int i = 1; i < 5; i++){
                    palletSize = result.getString(3);
                    price = result.getString(4);
                }
                System.out.println("Pallet Size: " + palletSize + "\n" + "Price: " + price);
            }

        }
        catch (SQLException e) {
            System.out.println("not connected");
        }


    }



}
