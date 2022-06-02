package ch.fhnw.acrm.controller;


import ch.fhnw.acrm.business.service.AgentService;
import ch.fhnw.acrm.business.service.ProductService;
import ch.fhnw.acrm.data.domain.Agent;
import ch.fhnw.acrm.data.domain.Product;
import ch.fhnw.acrm.data.repository.AgentRepository;
import ch.fhnw.acrm.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    private AgentRepository agentRepository;

    @Autowired
    private AgentService agentService;

@Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;

    }



@GetMapping
    public List<Product> getProduct(){
    return productService.getProduct();
}

public void registerNewProduct(Product product) {
    productService.addNewProduct(product);
}



//  @GetMapping
//    public ResponseEntity getAllProducts() {
//     return ResponseEntity.ok(this.productRepository.findAll());
//
//    }


//@GetMapping
//    public List<Product> getProducts(){
//
//        return List.of(
//                new Product(
//                        1L,
//                        "sarah",
//                        2,
//                        2
//                )
//        );


}







