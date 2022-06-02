package ch.fhnw.acrm.business.service;

import ch.fhnw.acrm.data.domain.Agent;
import ch.fhnw.acrm.data.domain.Product;
import ch.fhnw.acrm.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;




    }

