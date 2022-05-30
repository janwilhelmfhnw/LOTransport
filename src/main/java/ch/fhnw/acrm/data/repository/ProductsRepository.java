package ch.fhnw.acrm.data.repository;

import ch.fhnw.acrm.data.domain.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {
}