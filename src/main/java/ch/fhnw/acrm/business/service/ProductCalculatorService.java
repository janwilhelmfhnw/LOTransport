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

    private ProductRepository productRepository;

    //Product findBy
    double PriceCalc (){
        double costSum = 0;
        //Long id = 1L;
       //Long id = 1L;
        Product product = productRepository.findById(1L).get();
        //Product product = productRepository.findById(Long id);
        costSum = product.getPrice();
        //costSum = price;
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
