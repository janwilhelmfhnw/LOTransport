package ch.fhnw.acrm.data.domain;

import ch.fhnw.acrm.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ProductCalculator {


    @Autowired
    private ProductRepository productRepository;

String query = "Select city FROM agent";





}
