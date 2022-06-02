package ch.fhnw.acrm.controller;


import ch.fhnw.acrm.business.service.ProductService;
import ch.fhnw.acrm.data.domain.Product;
import ch.fhnw.acrm.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ProductController(ProductService productService) {
        this.productService = productService;

    }

//    @GetMapping
//    public ResponseEntity getAllProducts() {
//        return ResponseEntity.ok(this.productRepository.findAll());
//
//    }


@GetMapping
    public List<Product> getProducts(){

        return List.of(
                new Product(
                        1L,
                        "sarah",
                        2,
                        2
                )
        );
}





}
