package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Order;

import java.util.List;

public interface OrderService {
    Order saveOrder(Order order);
    List<Order> getAllOrders();
    Order getOrderById(long id);
    Order updateOrder(Order order, long id);
    void deleteOrder(long id);
}
