package ch.fhnw.acrm.data.repository;

import ch.fhnw.acrm.data.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

//    @Query("SELECT s FROM Product s WHERE s.")
    Optional<Product> findProductById(long id);

    //Product findProductById(long id);

    List<Product> findByPrice(double price);






}