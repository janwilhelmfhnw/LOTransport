package ch.fhnw.acrm.data.repository;

import ch.fhnw.acrm.data.domain.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositoryNew extends JpaRepository <Products, Long> {
}
