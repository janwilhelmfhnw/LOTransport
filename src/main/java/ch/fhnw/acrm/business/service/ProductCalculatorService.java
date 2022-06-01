package ch.fhnw.acrm.business.service;

import ch.fhnw.acrm.data.domain.Product;
import ch.fhnw.acrm.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCalculatorService {


    //Get db data
    @Autowired

    private static ProductRepository productRepository;

    //Product findBy
    static double PriceCalc (){
        double costSum = 0;

        try {
            Product product = productRepository.findById(2L).get();

            costSum = product.getPrice();



        }
        catch (Exception e) {
            e.getStackTrace();
        }

        return costSum;
    }

    // get number



    // List approach
    double PriceCalculation (List<Product> pList) {

        double priceSum = 0;

        for (int i=0; i<pList.size(); i++){

            double price = pList.get(i).getPrice();
            priceSum += price;

        }

        return priceSum;
    }

    public static void main(String[] args) {
        System.out.println(PriceCalc());
    }
}
