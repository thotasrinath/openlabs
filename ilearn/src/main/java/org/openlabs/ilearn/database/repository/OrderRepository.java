package org.openlabs.ilearn.database.repository;

import org.openlabs.ilearn.database.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
