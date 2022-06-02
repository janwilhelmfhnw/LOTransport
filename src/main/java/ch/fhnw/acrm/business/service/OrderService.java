package ch.fhnw.acrm.business.service;

import ch.fhnw.acrm.data.domain.Agent;
import ch.fhnw.acrm.data.domain.Orders;
import ch.fhnw.acrm.data.repository.OrdersRepository;
import ch.fhnw.acrm.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
@Service
public class OrderService {

    @Autowired
    private OrdersRepository orderRepository;


    public void saveOrders(Orders orders) throws Exception {
        if (orders.getId() == null)

        //orders.setPassword(passwordEncoder.encode(agent.getPassword()));
        orderRepository.save(orders);
    }


}
