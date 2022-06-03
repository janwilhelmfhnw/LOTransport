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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProductController {

    private final ProductService productService;
//    @Autowired
//    private final ProductRepository productRepository;
    @Autowired
    private AgentRepository agentRepository;
    @Autowired
    private AgentService agentService;


    public ProductController(ProductService productService, ProductRepository productRepository, AgentRepository agentRepository, AgentService agentService) {
        this.productService = productService;
        this.agentRepository = agentRepository;
        this.agentService = agentService;
    }

    @RequestMapping("/product")
    public String getName(Model model){
       Agent a = agentService.getCurrentAgent();
        model.addAttribute("name", agentRepository.findByName(String.valueOf(a)));

        return "name";
    }
//
//    @RequestMapping("/product2"){
//        return String
//    }



@Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;

    }



//@GetMapping
//    public List<Product> getProduct(){
//    return productService.getProduct();
//}

//    @GetMapping
//    public List<Product> getCurrentAddress(){
//        return List.agentService.getAgentAddress("this", "this");
//    }


@PostMapping
public void registerNewProduct(@RequestBody Product product) {
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







