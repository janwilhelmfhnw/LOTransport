package ch.fhnw.acrm.data.repository;

import ch.fhnw.acrm.data.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

    Orders findById(long id);
}