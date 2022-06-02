package ch.fhnw.acrm.business.service;

import ch.fhnw.acrm.data.domain.Product;
import ch.fhnw.acrm.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

@Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProduct(){
    return productRepository.findAll();
    }


    public void addNewProduct(Product product) {
        System.out.println(product);
    }
}
