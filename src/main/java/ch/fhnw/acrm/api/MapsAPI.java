package ch.fhnw.acrm.api;

/*
import java.net.URI;
import java.net.http.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MapsAPI {

    private static final String API_KEY = "AIzaSyCsceVMrBAdupkGbu0zM9jOOBrz2s5wEwY";
    private static String destination;
    public static float[][] distances;
    public static final String ORIGIN_ADDRESS = "PeterMerian-Strasse86,4052Basel";
    private static Scanner scan;

    //download data
    public static void getData(String source, String destination) throws Exception {

        long distance = 1;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(java.net.URI.create("https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + source + "&destinations=" + destination + "&key=" + API_KEY))
                .build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body);

        String response = client.send(request, HttpResponse.BodyHandlers.ofString()).body();


        JSONParser jp = new JSONParser();
        JSONObject jo = (JSONObject) jp.parse(response);
        JSONArray ja = (JSONArray) jo.get("rows");
        jo = (JSONObject) ja.get(0);
        ja = (JSONArray) jo.get("elements");
        jo = (JSONObject) ja.get(0);
        JSONObject je = (JSONObject) jo.get("distance");

        distance = (long) je.get("value");

        System.out.println(response + "\n" + distance + " m");
    }
    public static void setDestination() {

        scan = new Scanner(System.in);
        destination = scan.next();

    }
    public static String getDestination() {

        return destination;
    }
    public static void main(String[] args) throws Exception {

        setDestination();

        getData(ORIGIN_ADDRESS, getDestination());
    }

}

*/