package ch.fhnw.acrm.controller;


import ch.fhnw.acrm.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productCalc")
public class ProductControllerCalc {

    @Autowired
    private final ProductRepository productRepository;

    public ProductControllerCalc(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public ResponseEntity get() {
        return ResponseEntity.ok(this.productRepository.findAll());

    }
    
}
