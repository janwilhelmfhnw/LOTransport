package ch.fhnw.acrm.data.repository;

import ch.fhnw.acrm.data.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
   // public Optional<Product> findById(Long id);
    //Product product findById(Long id);
    //List<Product> findByPrice(double price);
    //List<Product> findById(Long ids);

    //@Query ("FROM Product WHERE id = ?1")
    List<Product> findProductById(Long id);
           // (double price);
}