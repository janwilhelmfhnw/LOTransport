package ch.fhnw.acrm.controller;


import ch.fhnw.acrm.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;



//    @GetMapping
//    public C getIt() {
//        double x = 0;
//
//        return x;
//
//    }
// Test
@GetMapping
public ResponseEntity getAllProducts() {
    return ResponseEntity.ok(productRepository.findAll());

}
}
