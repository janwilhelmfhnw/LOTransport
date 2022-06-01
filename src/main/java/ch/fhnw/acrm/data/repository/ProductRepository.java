package ch.fhnw.acrm.data.repository;

import ch.fhnw.acrm.data.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByPrice(double price);


    @Query ("FROM Product WHERE id = ?1")
    List<Product> findPrice(double price);
}