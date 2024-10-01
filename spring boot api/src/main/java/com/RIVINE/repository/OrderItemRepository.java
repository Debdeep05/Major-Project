package com.RIVINE.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RIVINE.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
