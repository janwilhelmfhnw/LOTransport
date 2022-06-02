package ch.fhnw.acrm.business.service;

import ch.fhnw.acrm.data.repository.OrdersRepository;
import ch.fhnw.acrm.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {

    @Autowired
    private OrdersRepository orderRepository;
}
