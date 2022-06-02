package ch.fhnw.acrm.controller;


import ch.fhnw.acrm.business.service.ProductService;
import ch.fhnw.acrm.data.domain.Agent;
import ch.fhnw.acrm.data.domain.Product;
import ch.fhnw.acrm.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("productOrder")
    public String getProductView(){return "acrm/productOrder.html";}

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //simple test
//    @GetMapping
//    public ResponseEntity getAllProducts() {
//        return ResponseEntity.ok(this.productRepository.findAll());
//
//    }

    @GetMapping("/order")
    public @ResponseBody Product getProfile() {
        return productService.getCurrentProduct();
    }

}
