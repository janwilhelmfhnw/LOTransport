package ch.fhnw.acrm.data.repository;

import ch.fhnw.acrm.data.domain.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository <Orders,Long> {
}
