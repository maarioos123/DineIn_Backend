package net.javaguides.springboot.controller;

import net.javaguides.springboot.model.Order;
import net.javaguides.springboot.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @PostMapping
    @CrossOrigin
    public ResponseEntity<Order> saveOrder(@RequestBody Order order) {
        return new ResponseEntity<>(orderService.saveOrder(order), HttpStatus.CREATED);
    }


    // build get all orders REST API
    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
}
