package ch.fhnw.acrm.controller;


import ch.fhnw.acrm.data.repository.OrdersRepository;
import ch.fhnw.acrm.data.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class OrderConfig implements CommandLineRunner{

    private final ProductRepository productRepository;
    private final OrdersRepository ordersRepository;

    public OrderConfig(ProductRepository productRepository, OrdersRepository ordersRepository) {
        this.productRepository = productRepository;
        this.ordersRepository = ordersRepository;
    }

    @Override
    public void run(String... args) throws Exception {




    }









//    @Bean
//    CommandLineRunner commandLineRunner(
//            ProductRepository repository) {
//        return  args -> {
//
//
//        };
//
//    }
}
