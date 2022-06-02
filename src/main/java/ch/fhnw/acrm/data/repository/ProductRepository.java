package ch.fhnw.acrm.data.repository;

import ch.fhnw.acrm.data.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findProductById(long id);

    List<Product> findByPrice(double price);






}