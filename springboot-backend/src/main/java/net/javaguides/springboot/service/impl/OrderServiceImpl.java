package net.javaguides.springboot.service.impl;

import net.javaguides.springboot.model.Order;
import net.javaguides.springboot.repository.OrderRepository;
import net.javaguides.springboot.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(long id) {
        return null;
    }

    @Override
    public Order updateOrder(Order order, long id) {
        return null;
    }


    @Override
    public void deleteOrder(long id) {

    }
}
