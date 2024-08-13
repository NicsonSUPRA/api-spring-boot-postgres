package com.nicson.apipostgres.config;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.nicson.apipostgres.models.Order;
import com.nicson.apipostgres.models.User;
import com.nicson.apipostgres.models.enums.OrderStatus;
import com.nicson.apipostgres.repositories.OrderRepository;
import com.nicson.apipostgres.repositories.UserRepository;

@Configuration
public class instanciacao implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User userOne = new User(0, "Nicson", "nicson@example.com", "96999979918", "12345");
        User userTwo = new User(0, "Maria", "maria@example.com", "96976869918", "12345");
        Order orderOne = new Order(0, new Date(), userTwo, OrderStatus.PAID);
        Order orderTwo = new Order(0, new Date(), userTwo, OrderStatus.DELIVERED);
        Order orderThree = new Order(0, new Date(), userOne, OrderStatus.CANCELED);
        userRepository.saveAll(Arrays.asList(userOne, userTwo));
        orderRepository.saveAll(Arrays.asList(orderOne, orderTwo, orderThree));
    }
}
