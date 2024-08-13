package com.nicson.apipostgres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicson.apipostgres.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
