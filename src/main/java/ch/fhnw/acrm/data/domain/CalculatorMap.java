package ch.fhnw.acrm.data.domain;

import ch.fhnw.acrm.api.MapsAPI;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

//copied from https://github.com/Nic0Joos/Unchained2
//in the end not implemented, but takes input from MapsAPI

public class CalculatorMap {



    public static double getCosts() throws Exception {

        long km = MapsAPI.getDistance();
        int pallets = 10;
        double shippingCosts;

        ClassPathResource classPathResource = new ClassPathResource("transportCosts");
        File costFile = classPathResource.getFile();
        Scanner scanner = new Scanner(new BufferedReader(new FileReader(costFile)));

        final int rows = 12;
        final int columns = 12;
        final double[][] CostTable = new double[rows][columns];

        while (scanner.hasNext()) {
            for (int i = 0; i<CostTable.length; i++) {
                String[] line = scanner.nextLine().trim().split(",");
                for  (int j = 0; j<line.length; j++) {
                    CostTable[i][j] = Double.parseDouble(line[j]);
                }
            }
        }

        if (pallets >= 13 || km >= 361) {
            throw new Exception("Too much pallets used or too many kilometers to ship");
        } else if(km % 30 == 0) { //Check for threshold (because up to and including 30)
            shippingCosts = CostTable[(int) ((km/30)-1)][pallets-1];
        } else { //all other values that are not a threshold value
            shippingCosts = CostTable[(int) (km/30)][pallets-1];
        }
        System.out.println(shippingCosts);
        return shippingCosts;

    }
}
