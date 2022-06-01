package ch.fhnw.acrm.business.service;

import ch.fhnw.acrm.data.domain.Product;
import ch.fhnw.acrm.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class ProductCalculatorService {


    //Get db data
    @Autowired
    private ProductRepository productRepository;

    double PriceCalc (){
        double costSum = 0;
        Product product = productRepository.findById(Long id);
        //double price = product.getPrice();

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



}
