package com.devgustavo.course.repositories;

import com.devgustavo.course.entities.OrderItem;
import com.devgustavo.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
