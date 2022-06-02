package ch.fhnw.acrm.controller;


import ch.fhnw.acrm.business.service.OrderService;
import ch.fhnw.acrm.business.service.ProductService;
import ch.fhnw.acrm.data.domain.Agent;
import ch.fhnw.acrm.data.domain.Orders;
import ch.fhnw.acrm.data.domain.Product;
import ch.fhnw.acrm.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@Controller
//@RequestMapping("/product")
public class ProductController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/productOrder")
    public String getProductView(){return "user/productOrder.html";}


    @PostMapping("/productOrder")
    public ResponseEntity<Void> postOrders(@RequestBody Orders orders) {
        try {
            orderService.saveOrders(orders);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return ResponseEntity.ok().build();
    }


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



}
