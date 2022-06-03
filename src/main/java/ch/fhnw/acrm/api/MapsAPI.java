package ch.fhnw.acrm.api;

import ch.fhnw.acrm.data.domain.CalculatorMap;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

//Author: Kenan Ahmetasevic
public class MapsAPI {


    private static final String API_KEY = "AIzaSyCsceVMrBAdupkGbu0zM9jOOBrz2s5wEwY";
    private static String destination;
    public static float[][] distances;
    public static final String ORIGIN_ADDRESS = "PeterMerian-Strasse86,4052Basel";
    private static Scanner scan;
    private static long distance = 1;
    //download data
    public static void getData(String source, String destination) throws Exception {



        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(java.net.URI.create("https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + source + "&destinations=" + destination + "&key=" + API_KEY))
                .build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body);

        String response = client.send(request, HttpResponse.BodyHandlers.ofString()).body();

        System.out.println(response);

        JSONParser jp = new JSONParser();
        JSONObject jo = (JSONObject) jp.parse(response);
        JSONArray ja = (JSONArray) jo.get("rows");
        jo = (JSONObject) ja.get(0);
        ja = (JSONArray) jo.get("elements");
        jo = (JSONObject) ja.get(0);
        JSONObject je = (JSONObject) jo.get("distance");

        distance = (long) je.get("value");
        distance =distance/1000;
        System.out.println(response + "\n" + distance + " km");
        CalculatorMap.getCosts();

    }
    public static void setDestination() {

        scan = new Scanner(System.in);
   //     testUserIntoString.setAddress();
        destination = scan.next();

    }
    public static String getDestination() {

        return destination;
    }
    public static void main(String[] args) throws Exception {

        setDestination();

        getData(ORIGIN_ADDRESS, getDestination());
    }
public static long getDistance() {
        return distance;
}
}


