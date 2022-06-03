package ch.fhnw.acrm.data.domain;


import java.sql.*;

//Author: Kenan Ahmetasevic

public class DatabaseConnection {

    private static String url = "jdbc:postgresql://ec2-52-30-67-143.eu-west-1.compute.amazonaws.com:5432/db9gl717l6jetr";
    private static String uname = "trjjnfbrmizoql";
    private static String password = "909d7787c99319cdf1f1e15ed5329a2bcfed409371985741e3aa20d43534b7f0";
    private static String productQuery = "select distinct pallet_size, price from product";
    private static String addressQuery = "select distinct city, postal, snumber, street from agent";
    private static String street = "";
    private static String snumber = "";
    private static String postal = "";
    private static String city = "";

    public static void getProductData(long id){

        productQuery = productQuery + " where product.id = " + id;

        try {
            Connection con = DriverManager.getConnection(url, uname, password);
            System.out.println("Connected");
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(productQuery);

            while (result.next()) {
                String palletSize = "";
                String price = "";

                for (int i = 1; i < 2; i++){
                    palletSize = result.getString(1);
                    price = result.getString(2);
                }
                System.out.println("Pallet Size: " + palletSize + "\n" + "Price: " + price);
            }

        }
        catch (SQLException e) {
            System.out.println("not connected");
        }
    }
    public static String getAddressData(long id) {

        addressQuery = addressQuery + " where agent.id = " + id;
        String apiAddress = "";

        try {
            Connection con = DriverManager.getConnection(url, uname, password);
            System.out.println("Connected");
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(addressQuery);

            while (result.next()) {

                for (int i = 1; i < 4; i++){
                    city = result.getString(1);
                    postal = result.getString(2);
                    snumber = result.getString(3);
                    street = result.getString(4);


                }
            }
            apiAddress = street + snumber + "," + postal + city;

        }
        catch (SQLException e) {
            System.out.println("not connected");
        }

        return apiAddress;
    }
    public static void main(String[] args) {

        System.out.println(getAddressData(23));
    }


}
